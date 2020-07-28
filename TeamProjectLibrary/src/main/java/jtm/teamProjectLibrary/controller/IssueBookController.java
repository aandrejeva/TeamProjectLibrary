package jtm.teamProjectLibrary.controller;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jtm.teamProjectLibrary.model.Book;
import jtm.teamProjectLibrary.model.IssueBook;
import jtm.teamProjectLibrary.repository.IssueBookRepository;
import jtm.teamProjectLibrary.service.BookService;
import jtm.teamProjectLibrary.service.IssueBookService;

@Controller
public class IssueBookController {

	private IssueBookService issueBookService;
	private BookService bookService;
	private final IssueBookRepository issueBookRepository;

	@Autowired
	public IssueBookController(IssueBookService issueBookService, BookService bookService, IssueBookRepository issueBookRepository) {
		this.issueBookService = issueBookService;
		this.bookService = bookService;
		this.issueBookRepository = issueBookRepository;
	}

	@GetMapping("/issues")
	public String findAll(Model model, @Param("searchName") String searchName) {
		List<IssueBook> issues = issueBookService.findAll(searchName);
		model.addAttribute("issues", issues);
		model.addAttribute("searchName", searchName);
		return "issue-list";
	}

	@GetMapping("/customer-issue/{id}")
	public String createIssueForm(@PathVariable("id") int id, Model model) {
		IssueBook issueBook = new IssueBook();
		issueBook.setBook(bookService.findById(id));
		model.addAttribute("issueBook", issueBook);
		return "customer-issue";
	}

	@PostMapping("/customer-issue")
	public String createIssue(IssueBook issueBook) {
		issueBookService.save(issueBook);
		return "redirect:issues"; // <----- Hompage
	}

	@GetMapping("/customer-return/{id}")
	public String returnBookForm(@PathVariable("id") int id, Model model) {
		IssueBook issueBook = issueBookService.findById(id);
		model.addAttribute("issueBook", issueBook);
		return "/customer-return";
	}

	@PostMapping("/customer-return")
	public String updateReturnDate(IssueBook issueBook) {
		issueBookService.saveReturn(issueBook);
		return "redirect:/issues";
	}

	@GetMapping("/book-validation")
	public String availabilityForm(IssueBook issueBook) {
		return "book-validation";
	}

	@PostMapping("/book-validation")
	public String checkAvailability(@RequestParam("id") int id) {
		issueBookService.availabilityCheck(id);
		return "redirect:/customer-issue";
	}
	
	@GetMapping("/book-issue-list")
	public String getBookIssuePage(Model model) {
		List<Book> books = bookService.findAll();
		model.addAttribute("books", books);
		
		List<Object[]> availabilityCheck = issueBookRepository.availabilityCheck();
		HashMap<Integer, Integer> availabilityMap = new HashMap();
		for (Object[] value : availabilityCheck) {
			availabilityMap.put((Integer)value[0], ((BigInteger)value[1]).intValue());
		}
		for (Book book : books) {
			Integer issuedCount = availabilityMap.get(book.getId()) != null ? availabilityMap.get(book.getId()) : 0;
			int availableCount = book.getCount() - issuedCount;
			book.setAvailable(availableCount > 0);
		}
		return "book-issue-list";
	}

}
