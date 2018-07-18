package com.accenture.Correo_excel_Serenity.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import static org.hamcrest.Matchers.containsString;
import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.accenture.Correo_excel_Serenity.tasks.OpenTheApplication;
import com.accenture.Correo_excel_Serenity.tasks.SendEmail;
import com.accenture.Correo_excel_Serenity.tasks.Sent;
import com.accenture.Correo_excel_Serenity.tasks.Login;

import static net.serenitybdd.screenplay.GivenWhenThen.*;

import java.io.IOException;
import java.util.List;

@RunWith(SerenityRunner.class)
public class SearchByKeywordStory {

    Actor anna = Actor.named("Anna");

    @Managed(uniqueSession = true)
    public WebDriver herBrowser;

    @Steps
    OpenTheApplication openTheApplication;

    @Before
    public void annaCanBrowseTheWeb() {
        anna.can(BrowseTheWeb.with(herBrowser));
    }

    @Test
    public void search_results_should_show_the_search_term_in_the_title() throws InterruptedException {
    	
    	
        givenThat(anna).wasAbleTo(openTheApplication);
        herBrowser.manage().window().maximize();
        when(anna).attemptsTo(Login.login("email","pass"));
        
		try {
			readexcel re = new readexcel();
	
			List<String> correos=  re.Obtenercorreos();
			for (String correo : correos) {		
				
				when(anna).attemptsTo(SendEmail.sendemail(correo, "Prueba", "Prueba automatizada utilizando Serenity Screenplay y Selenimu"));
	        
		        Thread.sleep(1000);		        
		        
				}
			when(anna).attemptsTo(Sent.sent());
			then(anna).should(eventually(seeThat(TheWebPage.title(), containsString("Enviados"))));
	        Thread.sleep(3000);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			                

    }
}