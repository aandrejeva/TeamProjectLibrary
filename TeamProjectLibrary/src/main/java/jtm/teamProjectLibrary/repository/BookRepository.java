package jtm.teamProjectLibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jtm.teamProjectLibrary.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
