package com.devsuperior.movieflix.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.movieflix.entities.Genre;
import com.devsuperior.movieflix.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

	@Query("SELECT DISTINCT obj FROM Movie obj WHERE " 
	        + "(:genre IS NULL OR :genre = obj.genre) AND "
			+ "(LOWER(obj.title) LIKE LOWER(CONCAT('%',:title,'%')))")
	Page<Movie> find(Genre genre, String title, Pageable pageable);

}
