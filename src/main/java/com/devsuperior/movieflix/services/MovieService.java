package com.devsuperior.movieflix.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.devsuperior.movieflix.repositories.GenreRepository;
import com.devsuperior.movieflix.repositories.MovieRepository;
import com.devsuperior.movieflix.repositories.ReviewRepository;

public class MovieService {
	
	@Autowired
	public MovieRepository repository;
	
	@Autowired
	public GenreRepository genreRepository;
	
	@Autowired
	public ReviewRepository reviewRepository;
	
	

}
