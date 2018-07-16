package com.accenture.Youtube_cucumber.steps;

import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import com.accenture.Youtube_cucumber.steps.serenity.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps anna;

    @Given("el usuario esta en la pagina de youtube")
    public void givenTheUserIsOnTheWikionaryHomePage() {
        anna.is_the_home_page();
    }

    @When("busca el video '(.*)'")
    public void whenTheUserLooksUpTheDefinitionOf(String word) {
        anna.looks_for(word);
    }
    @When("reproducir")
    public void voi() {
		anna.abrir_video();
	}
    @When("compartir")
    public void compartir() {
    	anna.compartir();
    }
    @When("googleplus")
    public void googlepus() {
    	anna.googleplus();
    }

//    @Then("they should see the definition '(.*)'")
//    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
//        anna.should_see_definition(definition);
//    }

}
