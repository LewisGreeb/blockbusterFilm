package com.sakila.lewis.blockbuster;

import com.sakila.lewis.blockbuster.language.Language;
import org.junit.jupiter.api.Test;

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

}
