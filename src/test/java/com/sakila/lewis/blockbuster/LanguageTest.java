package com.sakila.lewis.blockbuster;

import com.sakila.lewis.blockbuster.actor.Actor;
import com.sakila.lewis.blockbuster.category.Category;
import com.sakila.lewis.blockbuster.film.Film;
import com.sakila.lewis.blockbuster.language.Language;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class LanguageTest {

    @Test
    void test_ID(){
        Language language = new Language();
        language.setId(1);
        assertEquals(1, language.getId());
    }

    @Test
    void test_Name(){
        Language language = new Language();
        language.setName("Spanish");
        assertEquals("Spanish", language.getName());
    }

    @Test
    void test_Constructor(){
        Language language = new Language("Spanish");
        assertEquals("Spanish", language.getName());
    }

    @Test
    void test_Films(){
        Language language = new Language();
        Film film1 = new Film();
        film1.setTitle("FIlm1");
        Film film2 = new Film();
        film2.setTitle("Film2");
        Set<Film> films = new HashSet<>();
        language.setFilms(films);
        assertEquals(films, language.getFilms());
    }

}
