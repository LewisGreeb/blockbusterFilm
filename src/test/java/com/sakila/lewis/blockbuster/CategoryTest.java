package com.sakila.lewis.blockbuster;

import com.sakila.lewis.blockbuster.category.Category;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    @Test
    void test_Name(){
        Category category = new Category();
        category.setName("Spanish");
        assertEquals("Spanish", category.getName());
    }

}