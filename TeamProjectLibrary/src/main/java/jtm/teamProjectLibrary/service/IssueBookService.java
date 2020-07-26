package jtm.teamProjectLibrary.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jtm.teamProjectLibrary.model.Book;
import jtm.teamProjectLibrary.model.IssueBook;
import jtm.teamProjectLibrary.repository.IssueBookRepository;

@Service
public class IssueBookService {

	private int onHand = 0;
	private int updatedCount;
	Book book = new Book();
	IssueBook issueBook = new IssueBook();
	
	
	private final IssueBookRepository issueBookRepository;

	@Autowired
	public IssueBookService(IssueBookRepository issueBookRepository) {
		this.issueBookRepository = issueBookRepository;
	}
	
	
	public IssueBook addBookIssue(IssueBook issueBook) {
		
		if(book.isAvailable()) {
			onHand +=1;
			updatedCount = book.getCount() - 1;
			book.setCount(updatedCount);
		}
		return issueBookRepository.save(issueBook);
	}
	
	
	public void updateAvailable () {
		
		if(book.getCount() == 0) {
			book.setAvailable(false);
		}
	}
	
	
//	public IssueBook returnBook (IssueBook issueBook) {
//		
//		onHand -=1;
//		updatedCount = book.getCount() + 1;
//		book.setCount(updatedCount);
//	
//		return issueBookRepository.save(issueBook);
//}	
	
}
