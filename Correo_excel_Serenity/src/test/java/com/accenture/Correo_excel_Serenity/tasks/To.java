package com.accenture.Correo_excel_Serenity.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;

import com.accenture.Correo_excel_Serenity.ui.SendFields;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class To implements Task {	
	private final String To;

	protected To(String To) {
        
        this.To = To;
       
    }

    @Step("To")
    public <T extends Actor> void performAs(T actor) {
       
        actor.attemptsTo(
                Enter.theValue(To)
                     .into(SendFields.ToField)
                     .thenHit(ENTER)
        );
       
    }
    

    public static To to(String To) {
        return instrumented(To.class, To);
    }

}
