package com.accenture.Correo_excel_Serenity.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import com.accenture.Correo_excel_Serenity.ui.GmailPage;;

public class OpenTheApplication implements Task {

    GmailPage gmailpage;

    @Step("Open the application")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(gmailpage)
        );
    }
}
