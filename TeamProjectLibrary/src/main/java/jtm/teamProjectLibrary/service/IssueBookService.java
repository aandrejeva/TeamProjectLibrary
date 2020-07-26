package jtm.teamProjectLibrary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

//	public IssueBook returnBook(IssueBook issueBook) { //save actualReturnDate 
//		return issueBookRepository.save(issueBook);
//	}

	public List<IssueBook> findAll() {
			return issueBookRepository.findAll();
	}
	
	
	public IssueBook findById (int id) {
		return issueBookRepository.getOne(id);
	}

	
	
	public boolean checkAvailability() {
		
		return true;
		
		
	}
	

}