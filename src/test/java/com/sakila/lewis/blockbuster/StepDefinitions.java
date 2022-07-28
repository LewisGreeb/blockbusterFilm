package com.sakila.lewis.blockbuster;

import com.sakila.lewis.blockbuster.Film.FilmRepository;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IsItFriday {
    static String isItFriday(String today){
        return "Friday".equals(today) ? "Yes" : "No";
    }
    static String isItNotFriday(String today){
        return "Friday".equals(today) ? "No" : "Yes";
    }
}

public class StepDefinitions {
    private String today;
    private String actualAnswer;

    @Given("today is Monday")
    public void today_is_Monday(){
        today = "Monday";
    }

    @Given("today is Friday")
    public void today_is_Friday(){
        today = "Friday";
    }

    @Given("today is Tuesday")
    public void today_is_Tuesday(){
        today = "Tuesday";
    }

    @When("I ask whether it's Friday")
    public void i_ask_whether_it_s_Friday(){
        actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer){
        assertEquals(expectedAnswer, actualAnswer);
    }

    @When("I ask whether today is not Friday")
    public void i_ask_whether_today_is_not_Friday(){
        actualAnswer = IsItFriday.isItNotFriday(today);
    }

}
