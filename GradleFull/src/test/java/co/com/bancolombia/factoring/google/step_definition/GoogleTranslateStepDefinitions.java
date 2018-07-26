package co.com.bancolombia.factoring.google.step_definition;

//import org.junit.Before;
import org.openqa.selenium.WebDriver;

import co.com.bancolombia.factoring.google.tasks.BuscarAmigos;
import co.com.bancolombia.factoring.google.tasks.Login;
import co.com.bancolombia.factoring.google.tasks.OpenTheBrowser;
import co.com.bancolombia.factoring.google.user_interfaces.FacebookLoginPage;
import co.com.bancolombia.factoring.google.util.Tab;
import co.com.bancolombia.factoring.google.util.agendaDB;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;


public class GoogleTranslateStepDefinitions {
	
	@Managed(driver = "chrome")
	private WebDriver herBrowser;
	private Actor juanita = Actor.named("Juanita");
	//private GoogleHomePage googleHomePage;
	private FacebookLoginPage facebookloginpage;	
	private String nombre;
	agendaDB db = new agendaDB();
	
	
	@Before
	public void setup() {
		juanita.can(BrowseTheWeb.with(herBrowser));   // Se le asigna el driver al actor
		herBrowser.manage().window().maximize();	
	}
	
	// wasAbleTo (given) (Precondicion) - attemptsTo (when)  (Condicion)
	
	@Given("^that (.*) opened her browser at facebook (.*)$")
	public void thatTheUserOpenedTheBrowserAt(String name, String webpage) throws Exception {
		juanita.wasAbleTo(OpenTheBrowser.at(facebookloginpage));   
	}

	@When("^inicia sesion en facebook (.*) y (.*)$")
	public void sheGoesTo(String email,String pass) throws Exception {
		juanita.attemptsTo(Login.login(email, pass));
		Tab t =new Tab();
		t.tab();
	}

	@When("^busca los nombres contenidos en el archivo excel$")
	public void sheTranslatesTheWordFromTo() throws Exception {
		juanita.attemptsTo(BuscarAmigos.buscaramigos(nombre));
	}

//	@Then("^deberia ver el titulo del amigo buscado$")
//	public void sheShouldSeeTheWordInTheScreen(String palabraesperada) throws Exception {
//		palabraesperada= BuscarAmigos.getNombresFacebook();
//		juanita.should(seeThat(TheResult.is(), equalTo(palabraesperada)));
//		
//	}

}
