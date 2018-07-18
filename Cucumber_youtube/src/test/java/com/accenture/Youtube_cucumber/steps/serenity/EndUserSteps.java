package com.accenture.Youtube_cucumber.steps.serenity;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import com.accenture.Youtube_cucumber.pages.GmailPage;
import com.accenture.Youtube_cucumber.pages.GooglePlusPage;
import com.accenture.Youtube_cucumber.pages.YoutubePage;
import net.thucydides.core.annotations.Step;

public class EndUserSteps {

    YoutubePage youtubepage;
    GmailPage gmailpage;  
    GooglePlusPage googlepluspage;

    
    @Step
    public void YotubeHomePage() {
        youtubepage.open();
        WebDriver driver = youtubepage.getDriver();
        driver.manage().window().maximize();
    }
    
    @Step
    public void Buscar_video(String video) {              
        youtubepage.Buscar_video(video);
    }    
    
    @Step
    public void compartir() {
    	youtubepage.compartir();        	
    }    
    @Step
    public void CambiarGmail() {	
    	WebDriver driver = youtubepage.getDriver();
    	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
    	driver.switchTo().window(tabs.get(1));
	}
    @Step
    public void login(String usuario,String clave) {		
    	gmailpage.login(usuario, clave);
	}

    @Step
    public void Post(String msg) {
    	gmailpage.Post(msg);
	}   
    
    @Step
    public void GooglePlusHomePage() {
        googlepluspage.open();
        WebDriver driver = youtubepage.getDriver();
        driver.manage().window().maximize();
    }
    @Step
	public void loginGP(String user, String pass) {		
		googlepluspage.loginGP(user, pass);
	}
    @Step
    public void inicio() {
    	googlepluspage.home();
	}
    
}