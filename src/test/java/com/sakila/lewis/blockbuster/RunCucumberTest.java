package com.sakila.lewis.blockbuster;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = {"src/test/resources/cucumber/checkCategoryName.feature",
                "src/test/resources/cucumber/checkLanguageName.feature"},
        glue = {"com.sakila.lewis.blockbuster"})
public class RunCucumberTest {}
