package com.sakila.lewis.blockbuster;

import com.sakila.lewis.blockbuster.actor.Actor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ActorTest {

    @Test
    public void test_FirstName(){
        Actor actor = new Actor("Bernard", "Cribbins");
        assertEquals("Bernard", actor.getFirstName());
    }

    @Test
    public void test_LastName(){
        Actor actor = new Actor("Bernard", "Cribbins");
        assertEquals("Cribbins", actor.getLastName());
    }

}
