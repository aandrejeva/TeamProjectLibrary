package jtm.teamProjectLibrary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jtm.teamProjectLibrary.model.Genre;
import jtm.teamProjectLibrary.repository.GenreRepository;

@Service
public class GenreService {
	private final GenreRepository genreRepository;

	@Autowired
	public GenreService(GenreRepository genreRepository) {
		this.genreRepository = genreRepository;
	}

	public List<Genre> findAll() {
		return genreRepository.findAll();
	}
}
