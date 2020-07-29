package jtm.teamProjectLibrary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jtm.teamProjectLibrary.model.Book;
import jtm.teamProjectLibrary.service.BookService;

@Controller
public class BookController {

	private BookService bookService;

	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	@GetMapping("/books")
	public String findAll(Model model) {
		List<Book> books = bookService.findAll();
		model.addAttribute("books", books);
		return "book-list";
	}

	@GetMapping("/book-create")
	public String createBookForm(Book book) {
		return "book-create";
	}

	@PostMapping("/book-create")
	public String createBook(Book book) {
		bookService.saveBook(book);
		return "redirect:/books";
	}

	@GetMapping("/book-delete/{id}")
	public String deleteBook(@PathVariable("id") int id) {
		bookService.deleteById(id);
		return "redirect:/books";
	}

	@GetMapping("/book-update/{id}")
	public String updateBookForm(@PathVariable("id") int id, Model model) {
		Book book = bookService.findById(id);
		model.addAttribute("book", book);
		return "book-update";
	}

	@PostMapping("/book-update")
	public String updateBook(Book book) {
		bookService.saveBook(book);
		return "redirect:/books";
	}

	@GetMapping("/book-search")
	public String searchByTitle(@RequestParam(name = "title", required = false) String title, Model model) {
		if (title != null) {
			List<Book> books = bookService.findByTitle(title);
			model.addAttribute("books", books);
			return "book-list";
		} else {
			return "book-search";
		}
	}

//	@GetMapping("/book-search")
//	public String getBook(Model model) {
//		List<Book> books = bookService.findByGenre(genresIds);
//		return "book-list";
//	}

}
