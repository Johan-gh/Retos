package com.accenture.Youtube.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.youtube.com/")
public class YoutubePage extends PageObject{
		
	@FindBy(id="search")
    private WebElementFacade Inpunt_Buscar;
	
	@FindBy(xpath="//button[@id='search-icon-legacy']")
    private WebElementFacade Button_Buscar;
	
	@FindBy(xpath="ytd-button-renderer[@class='style-scope ytd-menu-renderer force-icon-button style-default size-default']//a[@class='yt-simple-endpoint style-scope ytd-button-renderer']")
    private WebElementFacade Button_Compartir;
	//

}
