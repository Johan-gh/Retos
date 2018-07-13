package com.accenture.Correo_excel_Serenity.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;

import com.accenture.Correo_excel_Serenity.ui.SendFields;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class Subject implements Task {	
	private final String Subject;

	protected Subject(String Subject) {
        
        this.Subject = Subject;
       
    }

    @Step("Subject")
    public <T extends Actor> void performAs(T actor) {
       
        actor.attemptsTo(
                Enter.theValue(Subject)
                     .into(SendFields.SubjectField)
                     .thenHit(ENTER)
        );
       
    }
    

    public static Subject subject(String Subject) {
        return instrumented(Subject.class, Subject);
    }

}
