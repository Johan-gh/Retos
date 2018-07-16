package com.accenture.Youtube.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.youtube.com/")
public class YoutubePage extends PageObject{
		
	@FindBy(name="search_query")
    private WebElementFacade Inpunt_Buscar;
	//botón buscar
	@FindBy(xpath="//button[@id='search-icon-legacy']")
    private WebElementFacade Button_Buscar;
	//compartir
	@FindBy(xpath="ytd-button-renderer[@class='style-scope ytd-menu-renderer force-icon-button style-default size-default']//a[@class='yt-simple-endpoint style-scope ytd-button-renderer']")
    private WebElementFacade Button_Compartir;
	//Google+
	@FindBy(xpath="//button[@id=\"target\" and @title='Google+']")
	private WebElementFacade GooglePlus;
	
	public void enter_keywords(String keyword) {
		System.out.println("holaaaa");
		Inpunt_Buscar.type(keyword);
    }

    public void lookup_terms() {
    	Button_Buscar.click();
    }
    
    public void share() {
		Button_Compartir.click();
	}
    
    public void googleplus() {
		GooglePlus.click();
	}

}
