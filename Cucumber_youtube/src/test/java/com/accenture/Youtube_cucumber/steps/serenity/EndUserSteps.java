package com.accenture.Youtube_cucumber.steps.serenity;

import com.accenture.Youtube_cucumber.pages.YoutubePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {

    YoutubePage youtubepage
    ;

    @Step
    public void enters(String keyword) {
        youtubepage.enter_keywords(keyword);
        System.out.println("holaaaa");
    }

    @Step
    public void starts_search() {
        youtubepage.lookup_terms();
    }

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
        enters(term);
        starts_search();
    }
    @Step
    public void abrir_video() {
    	youtubepage.abrir_video();
    	try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    @Step
    public void compartir() {
    	youtubepage.compartir();
    }
    @Step
    public void googleplus() {
    	youtubepage.googleplus();
    }
}