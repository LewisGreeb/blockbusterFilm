package com.sakila.lewis.blockbuster.film;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FilmRepository extends CrudRepository<Film,Integer>{

    List<Film> findByTitle(String title);
    List<Film> findByTitleContains(String title);

}
