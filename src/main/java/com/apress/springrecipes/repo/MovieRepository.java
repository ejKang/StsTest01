package com.apress.springrecipes.repo;

import com.apress.springrecipes.model.Movie;

import reactor.core.publisher.Flux;

public interface MovieRepository {

	Flux<Movie> findAll();
}
