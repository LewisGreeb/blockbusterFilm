package com.sakila.lewis.blockbuster;

import com.sakila.lewis.blockbuster.actor.Actor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ActorTest {

    @Test
    void test_FirstName(){
        Actor actor = new Actor("Bernard", "Cribbins");
        assertEquals("Bernard", actor.getFirstName());
    }

    @Test
    void test_LastName(){
        Actor actor = new Actor("Bernard", "Cribbins");
        assertEquals("Cribbins", actor.getLastName());
    }

}
