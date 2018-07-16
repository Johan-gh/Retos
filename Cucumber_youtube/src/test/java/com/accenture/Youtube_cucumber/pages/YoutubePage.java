package com.accenture.Youtube_cucumber.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

@DefaultUrl("https://www.youtube.com/")
public class YoutubePage extends PageObject {

    @FindBy(name="search_query")
    private WebElementFacade busqueda;

    @FindBy(xpath="//button[@id=\"search-icon-legacy\"]")
    private WebElementFacade buscar;
    
    @FindBy(xpath="//a[@title=\"Sting - Shape of My Heart (Leon)\"]")
    private WebElementFacade video;
    
    @FindBy(xpath="//button[@aria-label=\"Share\"]")
    private WebElementFacade compartir;
    
    @FindBy(xpath="//button[@title='Google+']")
    private WebElementFacade googleplus;

    public void enter_keywords(String keyword) {
    	System.out.println("escribio");
        busqueda.type(keyword);
    }

    public void lookup_terms() {
        buscar.click();
    }
    
    public void abrir_video() {
		video.click();
	}
    public void compartir() {
    	compartir.click();
    }
    
    public void googleplus() {
    	googleplus.click();
    }

    public List<String> getDefinitions() {
        WebElementFacade definitionList = find(By.tagName("ol"));
        return definitionList.findElements(By.tagName("li")).stream()
                             .map( element -> element.getText() )
                             .collect(Collectors.toList());
    }
}