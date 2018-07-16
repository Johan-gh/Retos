package com.accenture.Youtube.steps.serenity;

import com.accenture.Youtube.pages.DictionaryPage;
import com.accenture.Youtube.pages.YoutubePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {

   // DictionaryPage dictionaryPage;
    YoutubePage youtubepage;

    @Step
    public void enters(String keyword) {
        //dictionaryPage.enter_keywords(keyword);
    	youtubepage.enter_keywords(keyword);
    }

    @Step
    public void starts_search() {
        //dictionaryPage.lookup_terms();
    	youtubepage.lookup_terms();
    }
//
//    @Step
//    public void should_see_definition(String definition) {
//        assertThat(dictionaryPage.getDefinitions(), hasItem(containsString(definition)));
//    }

    @Step
    public void is_the_home_page() {
        youtubepage.open();
    }

    @Step
    public void looks_for(String term) {
    	System.out.println("entro");
        enters(term);
        starts_search();
        
    }
}