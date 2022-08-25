package com.sakila.lewis.blockbuster;

import com.sakila.lewis.blockbuster.actor.Actor;
import com.sakila.lewis.blockbuster.category.Category;
import com.sakila.lewis.blockbuster.film.Film;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ActorTest {

    @Test
    void test_ID(){
        Actor actor = new Actor();
        actor.setId(1);
        assertEquals(1, actor.getId());
    }

    @Test
    void test_FirstName(){
        Actor actor = new Actor();
        actor.setFirstName("Bernard");
        assertEquals("Bernard", actor.getFirstName());
    }

    @Test
    void test_LastName(){
        Actor actor = new Actor();
        actor.setLastName("Cribbins");
        assertEquals("Cribbins", actor.getLastName());
    }

    @Test
    void test_Constructor(){
        Actor actor = new Actor("Bernard", "Cribbins");
        assertEquals("Bernard", actor.getFirstName());
    }

    @Test
    void test_Films(){
        Actor actor = new Actor();
        Film film1 = new Film();
        film1.setTitle("FIlm1");
        Film film2 = new Film();
        film2.setTitle("Film2");
        Set<Film> films = new HashSet<>();
        actor.setFilms(films);
        assertEquals(films, actor.getFilms());
    }

}
