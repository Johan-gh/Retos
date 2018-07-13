package com.accenture.Correo_excel_Serenity.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.accenture.Correo_excel_Serenity.ui.SendFields;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class Send implements Task{			

    @Step("Send")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SendFields.Send)
        );               
    }
    
    public static Send send() {
        return instrumented(Send.class);
    }

}
