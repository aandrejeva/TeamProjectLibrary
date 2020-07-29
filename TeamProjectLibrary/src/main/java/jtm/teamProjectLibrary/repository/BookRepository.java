package jtm.teamProjectLibrary.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import jtm.teamProjectLibrary.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
//	@Query(
//			value = "SELECT b.*,g.name FROM library_database_final.books b " + 
//					"Left join library_database_final.genre_book_map gb on gb.book_id = b.id " + 
//					"Left join library_database_final.genres g on gb.genre_id = g.id "
//					+"where g.id in (?1)",
//			nativeQuery = true)
//	List<Book> findByGenre(List<Integer> ids);

	@Query(value = "SELECT * FROM books b where b.title like ?1", nativeQuery = true)
	List<Book> findByTitle(String title);

}
