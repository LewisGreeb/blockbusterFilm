package com.sakila.lewis.blockbuster;

import com.sakila.lewis.blockbuster.Film.Film;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FilmTest {

    @Test
    public void test_Title(){
        Film film = new Film("Oblivion", "A post-apocalyptic movie starring Tom Cruise, everyone's favourite cultist.",
                2003, 1, 7, 2.59, 124, 15.99, "PG-13", "Trailers");
        assertEquals(film.getTitle(), "Oblivion");
    }

    @Test
    public void test_Description(){
        Film film = new Film("Oblivion", "A post-apocalyptic movie starring Tom Cruise, everyone's favourite cultist.",
                2003, 1, 7, 2.59, 124, 15.99, "PG-13", "Trailers");
        assertEquals(film.getDescription(), "A post-apocalyptic movie starring Tom Cruise, everyone's favourite cultist.");
    }

    @Test
    public void test_ReleaseYear(){
        Film film = new Film("Oblivion", "A post-apocalyptic movie starring Tom Cruise, everyone's favourite cultist.",
                2003, 1, 7, 2.59, 124, 15.99, "PG-13", "Trailers");
        assertEquals(film.getRelease_year(), 2003);
    }

    @Test
    public void test_RentalRate(){
        Film film = new Film("Oblivion", "A post-apocalyptic movie starring Tom Cruise, everyone's favourite cultist.",
                2003, 1, 7, 2.59, 124, 15.99, "PG-13", "Trailers");
        assertEquals(film.getRental_rate(), 2.59);
    }

}
