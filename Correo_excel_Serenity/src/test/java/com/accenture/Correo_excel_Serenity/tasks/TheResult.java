package com.accenture.Correo_excel_Serenity.tasks;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheResult implements Question<String>{

	@Override
	public String answeredBy(Actor anna) {
		return null;
		// TODO Auto-generated method stub
		//return Text.of();
	}
	
	public static TheResult is() {
		// TODO Auto-generated constructor stub
		return new TheResult();
	}

}
