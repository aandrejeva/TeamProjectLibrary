package jtm.teamProjectLibrary.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "issue_book")
public class IssueBook {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;

	@OneToOne
	@JoinColumn(name = "book_id")
	private Book book;

	@Column(name = "issue_date")
	private String issueDate;

	@Column(name = "expected_return_date")
	private String expectedReturnDate;

	@Column(name = "actual_return_date")
	private String actualReturnDate;

	public IssueBook() {
	}

	@Override
	public String toString() {
		return "IssueBook [id=" + id + ", book=" + book.getId() + ", customer=" + customer.getId() + ", issueDate="
				+ issueDate + ", expectedReturnDate=" + expectedReturnDate + ", actualReturnDate=" + actualReturnDate
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Book getBook() {
		return book;
	}

}