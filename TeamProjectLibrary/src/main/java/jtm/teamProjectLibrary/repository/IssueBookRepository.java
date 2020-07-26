package jtm.teamProjectLibrary.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.client.HttpClientErrorException.Forbidden;

import jtm.teamProjectLibrary.model.IssueBook;

public interface IssueBookRepository extends JpaRepository<IssueBook, Integer> {


	@Query(value = "SELECT issue_book.id, issue_book.customer_id, customers.first_name, customers.last_name, issue_book.book_id, issue_book.issue_date, issue_book.expected_return_date, issue_book.actual_return_date from library_database.issue_book, library_database.customers where issue_book.customer_id = customers.id", nativeQuery = true)
	public List<IssueBook> findAll();
	
//	@Query("SELECT i FROM IssueBook i WHERE i.actualReturnDate = null")
//	public List<IssueBook> findAll();

	
}

