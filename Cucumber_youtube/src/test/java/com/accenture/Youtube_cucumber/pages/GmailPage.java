package com.accenture.Youtube_cucumber.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class GmailPage extends PageObject{
	
	@FindBy(xpath="//input[@autocomplete='username']")
	private WebElementFacade username;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElementFacade password;
	
	@FindBy(xpath="//textarea[@role='textbox']")
	private WebElementFacade mensaje;
	
	@FindBy(xpath="//span[text()='Post']")
	private WebElementFacade compartir;
	
	@FindBy(xpath="//span[@role='button' and contains(@aria-label,'Share with')]")
	private WebElementFacade sharepublic;
	
	@FindBy(xpath="//div[text()='Personal']")
	private WebElementFacade sharepersonal;
	
	
	public void login(String usuario,String clave) {
		username.type(usuario+"\n");
		password.type(clave+"\n");

	}
	
	public void Post(String msg) {
//		sharepublic.click();
//		sharepersonal.click();
		mensaje.type(msg);
		compartir.click();
	}
		
}
