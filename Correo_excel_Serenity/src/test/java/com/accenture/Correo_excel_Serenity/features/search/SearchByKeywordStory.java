package com.accenture.Correo_excel_Serenity.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.accenture.Correo_excel_Serenity.tasks.OpenTheApplication;
import com.accenture.Correo_excel_Serenity.tasks.Redact;
import com.accenture.Correo_excel_Serenity.tasks.Send;
import com.accenture.Correo_excel_Serenity.tasks.Sent;
import com.accenture.Correo_excel_Serenity.tasks.Subject;
import com.accenture.Correo_excel_Serenity.tasks.To;
import com.accenture.Correo_excel_Serenity.tasks.LoginAccount;
import com.accenture.Correo_excel_Serenity.tasks.LoginPassword;
import com.accenture.Correo_excel_Serenity.tasks.Message;

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
        when(anna).attemptsTo(LoginAccount.forTheTerm("johan1035.gh@gmail.com"));
        when(anna).attemptsTo(LoginPassword.forTheTerm("Johan1402@"));
		try {
			readexcel re = new readexcel();
	
			List<String> correos=  re.Obtenercorreos();
			for (String correo : correos) {		
		        
		        when(anna).attemptsTo(Redact.redact());
		        when(anna).attemptsTo(To.to(correo));
		        when(anna).attemptsTo(Subject.subject("Prueba"));
		        when(anna).attemptsTo(Message.message("Prueba automatizada utilizando Serenity Screenplay y Selenimu"));		        
		        when(anna).attemptsTo(Send.send());		        
		        Thread.sleep(2000);		        
		        
				}
			when(anna).attemptsTo(Sent.sent());
	        Thread.sleep(5000);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

        //then(anna).should(eventually(seeThat(TheWebPage.title(), containsString("BDD In Action"))));
        

    }
}