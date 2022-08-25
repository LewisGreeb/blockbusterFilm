package com.sakila.lewis.blockbuster;

import com.sakila.lewis.blockbuster.film.Film;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class FilmTest {

    @Test
    void test_Title(){
        Film film = new Film();
        film.setTitle("Oblivion");
        assertEquals("Oblivion", film.getTitle());
    }

    @Test
    void test_Description(){
        Film film = new Film();
        film.setDescription("A post-apocalyptic movie starring Tom Cruise, everyone's favourite cultist.");
        assertEquals("A post-apocalyptic movie starring Tom Cruise, everyone's favourite cultist.", film.getDescription());
    }

    @Test
    void test_ReleaseYear(){
        Film film = new Film();
        film.setReleaseYear(2003);
        assertEquals(2003, film.getReleaseYear());
    }

    @Test
    void test_LanguageID(){
        Film film = new Film();
        film.setLanguageID(1);
        assertEquals(1, film.getLanguageID());
    }

    @Test
    void test_RentalDuration(){
        Film film = new Film();
        film.setRentalDuration(7);
        assertEquals(7, film.getRentalDuration());
    }

    @Test
    void test_RentalRate(){
        Film film = new Film();
        film.setRentalRate(BigDecimal.valueOf(2.59));
        assertEquals(BigDecimal.valueOf(2.59), film.getRentalRate());
    }

    @Test
    void test_Length(){
        Film film = new Film();
        film.setLength(120);
        assertEquals(120, film.getLength());
    }

    @Test
    void test_ReplacementCost(){
        Film film = new Film();
        film.setReplacementCost(BigDecimal.valueOf(14.99));
        assertEquals(BigDecimal.valueOf(14.99), film.getReplacementCost());
    }

    @Test
    void test_Rating(){
        Film film = new Film();
        film.setRating("PG");
        assertEquals("PG", film.getRating());
    }

    @Test
    void test_SpecialFeatures(){
        Film film = new Film();
        film.setSpecialFeatures("Behind the Scenes");
        assertEquals("Behind the Scenes", film.getSpecialFeatures());
    }

}
