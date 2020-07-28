package jtm.teamProjectLibrary.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import jtm.teamProjectLibrary.model.IssueBook;

public interface IssueBookRepository extends JpaRepository<IssueBook, Integer> {


	@Query(value = "SELECT issue_book.id, issue_book.customer_id, customers.first_name, customers.last_name, issue_book.book_id, issue_book.issue_date, issue_book.expected_return_date, issue_book.actual_return_date FROM library_database.issue_book, library_database.customers where issue_book.customer_id = customers.id "
	+ "AND customers.last_name like ?1", nativeQuery = true)
	public List<IssueBook> findAll(String searchName);

	@Query(value = "SELECT count(*) from library_database.issue_book where book_id = ?1 and actual_return_date is null", 
			nativeQuery = true)
	public int availabilityCheck (int id);
	
	@Query(value = "SELECT book_id, count(*) from library_database.issue_book where actual_return_date is null group by book_id", 
			nativeQuery = true)
	public List<Object[]> availabilityCheck ();
	
}

