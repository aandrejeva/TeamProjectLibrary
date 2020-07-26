package jtm.teamProjectLibrary.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "issue_book")
public class IssueBook {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "customer_id")
	private int customerId;
	
	@Column(name = "book_id")
	private int bookId;
	
	@Column(name = "issue_date")
	private String issueDate;
	
	@Column(name = "expected_return_date")
	private String expectedReturnDate;
	
	@Column(name = "actual_return_date")
	private String actualReturnDate;


	public IssueBook() {}
	


	@Override
	public String toString() {
		return "IssueBook [id=" + id + ", bookId=" + bookId + ", customerId=" + customerId + ", issueDate=" + issueDate
				+ ", expectedReturnDate=" + expectedReturnDate + ", actualReturnDate=" + actualReturnDate + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getIssueDate() {
		return issueDate;
	}


	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}


	public String getExpectedReturnDate() {
		return expectedReturnDate;
	}


	public void setExpectedReturnDate(String expectedReturnDate) {
		this.expectedReturnDate = expectedReturnDate;
	}


	public String getActualReturnDate() {
		return actualReturnDate;
	}


	public void setActualReturnDate(String actualReturnDate) {
		this.actualReturnDate = actualReturnDate;
	}



}