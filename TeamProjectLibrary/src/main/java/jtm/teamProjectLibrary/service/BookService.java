package jtm.teamProjectLibrary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jtm.teamProjectLibrary.model.Book;
import jtm.teamProjectLibrary.repository.BookRepository;

@Service
public class BookService {

	private final BookRepository bookRepository;

	@Autowired
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public Book findById(int id) {
		return bookRepository.getOne(id);
	}

	public List<Book> findAll() {
		return bookRepository.findAll();
	}

	public Book saveBook(Book book) {
		return bookRepository.save(book);
	}

	public void deleteById(int id) {
		bookRepository.deleteById(id);
	}
}
