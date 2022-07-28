package com.sakila.lewis.blockbuster.Category;

import com.sakila.lewis.blockbuster.Film.Film;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategoryRepository extends CrudRepository<Category, Integer> {

    List<Category> findByName(String name);

}
