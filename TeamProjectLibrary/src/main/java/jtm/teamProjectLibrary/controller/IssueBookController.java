package jtm.teamProjectLibrary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jtm.teamProjectLibrary.model.IssueBook;
import jtm.teamProjectLibrary.service.IssueBookService;

@Controller
public class IssueBookController {

	@Autowired
	private IssueBookService issueBookService;

	@GetMapping("/book-issue")
	public String createIssueForm(IssueBook issueBook) {
		return "book-issue";
	}

	@PostMapping("/book-issue")
	public String createIssue(IssueBook issueBook) {
		issueBookService.addBookIssue(issueBook);
		return "redirect:/books";
	}

}
	
