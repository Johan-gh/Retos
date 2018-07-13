package com.accenture.Correo_excel_Serenity.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;

import com.accenture.Correo_excel_Serenity.ui.AccountField;


public class LoginAccount implements Task {

    private final String loginaccount;

    protected LoginAccount(String searchTerm) {
        this.loginaccount = searchTerm;
    }

    @Step("Account")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(loginaccount)
                     .into(AccountField.Account_Field)
                     .thenHit(ENTER)
        );
    }

    public static LoginAccount forTheTerm(String loginterms) {
        return instrumented(LoginAccount.class, loginterms);
    }

}
