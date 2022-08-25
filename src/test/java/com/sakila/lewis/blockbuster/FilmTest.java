package com.sakila.lewis.blockbuster;

import com.sakila.lewis.blockbuster.film.Film;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class FilmTest {

    @Test
    public void test_Title(){
        Film film = new Film();
        film.setTitle("Oblivion");
        assertEquals(film.getTitle(), "Oblivion");
    }

    @Test
    public void test_Description(){
        Film film = new Film();
        film.setDescription("A post-apocalyptic movie starring Tom Cruise, everyone's favourite cultist.");
        assertEquals(film.getDescription(), "A post-apocalyptic movie starring Tom Cruise, everyone's favourite cultist.");
    }

    @Test
    public void test_ReleaseYear(){
        Film film = new Film();
        film.setReleaseYear(2003);
        assertEquals(film.getReleaseYear(), 2003);
    }

    @Test
    public void test_RentalRate(){
        Film film = new Film();
        film.setRentalRate(BigDecimal.valueOf(2.59));
        assertEquals(film.getRentalRate(), BigDecimal.valueOf(2.59));
    }

}
