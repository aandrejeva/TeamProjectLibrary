package jtm.teamProjectLibrary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jtm.teamProjectLibrary.model.Author;
import jtm.teamProjectLibrary.repository.AuthorRepository;

@Service
public class AuthorService {
	private final AuthorRepository authorRepository;

	@Autowired
	public AuthorService(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}

	public List<Author> findAll() {
		return authorRepository.findAll();
	}
}
