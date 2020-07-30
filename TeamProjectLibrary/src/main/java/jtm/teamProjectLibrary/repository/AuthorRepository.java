package jtm.teamProjectLibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jtm.teamProjectLibrary.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
