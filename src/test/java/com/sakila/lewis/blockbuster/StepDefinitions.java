package com.sakila.lewis.blockbuster;

import com.sakila.lewis.blockbuster.category.Category;
import com.sakila.lewis.blockbuster.language.Language;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {

    private String actualAnswer;

    Category category = new Category();

    @Given("the category is fantasy.")
    public void category_is_fantasy(){
        category.setName("fantasy");
    }
    @When("I ask what the category is.")
    public void i_ask_what_category(){
        actualAnswer = category.getName();
    }
    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer){
        assertEquals(expectedAnswer, actualAnswer);
    }

    Language lang = new Language();

    @Given("the language is English.")
    public void language_is_English(){
        lang.setName("English");
    }
    @When("I ask what the language is.")
    public void i_ask_what_language(){
        actualAnswer = lang.getName();
    }


}
