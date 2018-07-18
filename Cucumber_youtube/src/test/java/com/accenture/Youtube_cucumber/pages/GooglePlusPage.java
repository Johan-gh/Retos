package com.accenture.Youtube_cucumber.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://plus.google.com/")
public class GooglePlusPage extends PageObject{
	@FindBy(xpath="//a[text()='Sign in']")
	private WebElementFacade login;
	@FindBy(xpath="//input[@autocomplete='username']")
	private WebElementFacade usuario;
	@FindBy(xpath="//input[@name='password']")
	private WebElementFacade clave;
	@FindBy(xpath="//div[@class='CjySve'][contains(text(),'Inicio')]")
	private WebElementFacade home;

	public void loginGP(String user, String pass) {		
		login.click();
		usuario.type(user+"\n");
		clave.type(pass+"\n");
	}
	
	public void home() {		
		home.click();
	}
	
}
