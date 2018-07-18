package com.accenture.Youtube_cucumber.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.WebElementFacade;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;


@DefaultUrl("https://www.youtube.com/")
public class YoutubePage extends PageObject {

    @FindBy(name="search_query")
    private WebElementFacade busqueda;

    @FindBy(xpath="//button[@id=\"search-icon-legacy\"]")
    private WebElementFacade buscar;
    
    @FindBy(xpath="//a[@title='Sting - Shape of My Heart (Leon)']")
    private WebElementFacade video;
    
    @FindBy(xpath="//video[@tabindex='-1']")
    private WebElementFacade pausa;
    
    @FindBy(xpath="//button[@aria-label=\"Share\"]")
    private WebElementFacade compartir;
    
    @FindBy(xpath="//button[@title='Google+']")
    private WebElementFacade googleplus;   
    
    public void Buscar_video(String video_busqueda) {
		busqueda.type(video_busqueda);
		buscar.click();
		video.click();
		pausa.click();
	}

    public void compartir() {
    	compartir.click();
    	googleplus.click();
    }
        

}