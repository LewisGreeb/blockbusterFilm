package com.sakila.lewis.blockbuster;

import com.sakila.lewis.blockbuster.actor.Actor;
import com.sakila.lewis.blockbuster.category.Category;
import com.sakila.lewis.blockbuster.film.Film;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    @Test
    void test_ID(){
        Category category = new Category();
        category.setId(1);
        assertEquals(1, category.getId());
    }

    @Test
    void test_Name(){
        Category category = new Category();
        category.setName("Spanish");
        assertEquals("Spanish", category.getName());
    }

    @Test
    void test_Films(){
        Category category = new Category();
        Film film1 = new Film();
        film1.setTitle("FIlm1");
        Film film2 = new Film();
        film2.setTitle("Film2");
        Set<Film> films = new HashSet<>();
        category.setFilms(films);
        assertEquals(films, category.getFilms());
    }

}