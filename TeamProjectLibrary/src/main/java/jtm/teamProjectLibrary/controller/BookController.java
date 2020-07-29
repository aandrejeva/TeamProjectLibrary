package jtm.teamProjectLibrary.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jtm.teamProjectLibrary.model.Book;
import jtm.teamProjectLibrary.service.AuthorService;
import jtm.teamProjectLibrary.service.BookService;
import jtm.teamProjectLibrary.service.GenreService;

@Controller
public class BookController {

	private BookService bookService;
	private GenreService genreService;
	private AuthorService authorService;

	@Autowired
	public BookController(BookService bookService, GenreService genreService, AuthorService authorService) {
		this.bookService = bookService;
		this.genreService = genreService;
		this.authorService = authorService;
	}

	@GetMapping("/books")
	public String findAll(Model model) {
		List<Book> books = bookService.findAll();
		model.addAttribute("books", books);
		return "book-list";
	}

	@GetMapping("/book-create")
	public String createBookForm(Book book, Model model) {
		model.addAttribute("genres", genreService.findAll());
		model.addAttribute("authors", authorService.findAll());
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
		model.addAttribute("genres", genreService.findAll());
		model.addAttribute("authors", authorService.findAll());
		return "book-update";
	}

	@PostMapping("/book-update")
	public String updateBook(Book book) {
		bookService.saveBook(book);
		return "redirect:/books";
	}

	@GetMapping("/book-search")
	public String searchBook(@RequestParam(name = "title", required = false) String title,
			@RequestParam(name = "genre", required = false) List<Integer> genreId,
			@RequestParam(name = "author", required = false) List<Integer> authorId, Model model) {
		if (title != null || genreId != null || authorId != null) {
			List<Book> books = new ArrayList<Book>();
			books.addAll(bookService.findByTitle(title));
			books.addAll(bookService.findByGenre(genreId));
			books.addAll(bookService.findByAuthor(authorId));
			model.addAttribute("books", books);
			return "book-list";
		} else {
			model.addAttribute("genres", genreService.findAll());
			model.addAttribute("authors", authorService.findAll());
			return "book-search";
		}
	}
}
