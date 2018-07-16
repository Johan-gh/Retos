package com.accenture.Correo_excel_Serenity.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.accenture.Correo_excel_Serenity.ui.SendFields;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SendEmail implements Task{
	
	private final String To;
	private final String Subject;
	private final String Message;

	

	public SendEmail(String to, String subject, String message) {				
		To = to;
		Subject = subject;
		Message = message;

	}


	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(SendFields.Redact),
				Enter.theValue(To)
                .into(SendFields.ToField),
                Enter.theValue(Subject)
                .into(SendFields.SubjectField),
                Enter.theValue(Message)
                .into(SendFields.MessageField),
                Click.on(SendFields.Send)
                
				);			
	}
	
	public static SendEmail sendemail(String to, String subject, String message) {
        return instrumented(SendEmail.class, to,  subject,  message);
    }

}
