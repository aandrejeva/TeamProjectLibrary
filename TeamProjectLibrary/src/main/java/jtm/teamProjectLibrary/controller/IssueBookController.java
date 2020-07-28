package jtm.teamProjectLibrary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jtm.teamProjectLibrary.model.IssueBook;
import jtm.teamProjectLibrary.service.IssueBookService;

@Controller
public class IssueBookController {

	private IssueBookService issueBookService;

	@Autowired
	public IssueBookController(IssueBookService issueBookService) {
		this.issueBookService = issueBookService;
	}

	@GetMapping("/issues")
	public String findAll(Model model, @Param ("searchName") String searchName) {
		List<IssueBook> issues = issueBookService.findAll(searchName);
		model.addAttribute("issues", issues);
		model.addAttribute("searchName", searchName);
		return "issue-list";
	}

	@GetMapping("/customer-issue")
	public String createIssueForm(IssueBook issueBook) {
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
	public String checkAvailability(@RequestParam ("id") int id) {
		issueBookService.availabilityCheck(id);
		return "redirect:/customer-issue";
}
	
}
