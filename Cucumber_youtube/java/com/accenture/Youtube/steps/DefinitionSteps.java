package com.accenture.Youtube.steps;

import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import com.accenture.Youtube.steps.serenity.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps anna;

    @Given("the user is on the youtube home page")
    public void givenTheUserIsOnTheYoutubeHomePage() {
        anna.is_the_home_page();
    }

    @When("the user looks up the video of the word")
    public void whenTheUserLooksUpTheVideoOf(String word) {
        anna.looks_for(word);
        System.out.println("escribio ");
    }

//    @Then("they should see the definition '(.*)'")
//    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
//        anna.should_see_definition(definition);
//    }

}
