package com.accenture.Correo_excel_Serenity.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;

import com.accenture.Correo_excel_Serenity.ui.SendFields;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class Message implements Task {	
	private final String Message;

	protected Message(String Message) {
        
        this.Message = Message;
       
    }

    @Step("Message")
    public <T extends Actor> void performAs(T actor) {
       
        actor.attemptsTo(
                Enter.theValue(Message)
                     .into(SendFields.MessageField)
                     .thenHit(ENTER)
        );
       
    }
    

    public static Message message(String Message) {
        return instrumented(Message.class, Message);
    }

}
