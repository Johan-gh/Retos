package com.accenture.Youtube_cucumber.steps;

import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


import com.accenture.Youtube_cucumber.steps.serenity.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps anna;

    @Given("el usuario esta en la pagina de youtube")
    public void el_usuario_esta_en_la_pagina_de_youtube() {
        anna.YotubeHomePage();
    }

    @When("busca y reproduce el video '(.*)'")
    public void whenTheUserLooksUpTheDefinitionOf(String video) {
        anna.Buscar_video(video);
    }    
    
    @When("comparte y selecciona GooglePlus")
    public void comparte_y_selecciona_GooglePlus() {		
    	anna.compartir();
    	anna.CambiarGmail();
	}
    
    @When("el usuario ingresa con el usuario '(.*)' y la clave '(.*)'")
    public void login(String usuario,String clave) {		
    	anna.login(usuario,clave);
	}
    @When("el usuario publica el video buscado con el mensaje '(.*)'")
    public void el_usuario_publica_el_video_buscado_con_el_mensaje(String msg) {
		anna.Post(msg);

	}
    @Given("el usuario esta en la pagina de googleplus")
    public void el_usuario_esta_en_la_pagina_de_googleplus() {
        anna.GooglePlusHomePage();
    }
    @When("el usuario ingresa con el usuario '(.*)' y la clave '(.*)' a googleplus")
    public void loginGP(String user,String pass) {
		anna.loginGP(user, pass);
	}
    @When("login '(.*)''(.*)'")
    public void login2(String user,String pass) {
		anna.loginGP(user, pass);

	}
    @When("inicio")
    public void inicio() {
    	anna.inicio();
    	try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
    


}
