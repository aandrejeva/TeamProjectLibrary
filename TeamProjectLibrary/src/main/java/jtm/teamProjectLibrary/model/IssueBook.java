package jtm.teamProjectLibrary.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "issue book")
public class IssueBook {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int bookId;
	private int customerId;
	private double issueDate;
	private double expectedReturnDate;
	private double actualReturnDate;
	private int finedDays;
	
	
	
	public IssueBook() {}
	
	
	@ManyToOne
    @JoinColumn(name="customerId")
    private Customer customer;

	


	@Override
	public String toString() {
		return "IssueBook [id=" + id + ", bookId=" + bookId + ", customerId=" + customerId + ", issueDate=" + issueDate
				+ ", expectedReturnDate=" + expectedReturnDate + ", actualReturnDate=" + actualReturnDate
				+ ", finedDays=" + finedDays + "]";
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


	public double getIssueDate() {
		return issueDate;
	}


	public void setIssueDate(double issueDate) {
		this.issueDate = issueDate;
	}


	public double getExpectedReturnDate() {
		return expectedReturnDate;
	}


	public void setExpectedReturnDate(double expectedReturnDate) {
		this.expectedReturnDate = expectedReturnDate;
	}


	public double getActualReturnDate() {
		return actualReturnDate;
	}


	public void setActualReturnDate(double actualReturnDate) {
		this.actualReturnDate = actualReturnDate;
	}


	public int getFinedDays() {
		return finedDays;
	}


	public void setFinedDays(int finedDays) {
		this.finedDays = finedDays;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	

}
