package jtm.teamProjectLibrary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jtm.teamProjectLibrary.model.Book;
import jtm.teamProjectLibrary.model.IssueBook;
import jtm.teamProjectLibrary.repository.IssueBookRepository;

@Service
public class IssueBookService {

	private final IssueBookRepository issueBookRepository;

	@Autowired
	public IssueBookService(IssueBookRepository issueBookRepository) {
		this.issueBookRepository = issueBookRepository;

	}

	public IssueBook save(IssueBook issueBook) {
		return issueBookRepository.save(issueBook);
	}

	public void saveReturn(IssueBook issueBook) {
		issueBookRepository.save(issueBook);
	}

	public List<IssueBook> findAll(String searchName) {
		if (searchName != null) {
			return issueBookRepository.findAll(searchName);
		}
		return issueBookRepository.findAll();
	}

	public IssueBook findById(int id) {
		return issueBookRepository.getOne(id);
	}
	
	public void availabilityCheck(int id) {
	int result = issueBookRepository.availabilityCheck(id);
	Book book = new Book();
		if(book.getCount() - result == 0) {
			System.out.println("Book with id: " + id + " and mysql result: " + result + " and book count " + book.getCount() + " is not available at the moment");
		}
		
	}
	
}