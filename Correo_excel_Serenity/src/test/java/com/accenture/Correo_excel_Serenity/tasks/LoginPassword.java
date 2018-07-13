package com.accenture.Correo_excel_Serenity.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;

import com.accenture.Correo_excel_Serenity.ui.PasswordField;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class LoginPassword implements Task{
	 private final String loginpassword;

	    protected LoginPassword(String searchTerm) {
	        this.loginpassword = searchTerm;
	    }

	    @Step("Login pass")
	    public <T extends Actor> void performAs(T actor) {
	        actor.attemptsTo(
	                Enter.theValue(loginpassword)
	                     .into(PasswordField.Password_Field)
	                     .thenHit(ENTER)
	        );
	    }

	    public static LoginPassword forTheTerm(String loginterms) {
	        return instrumented(LoginPassword.class, loginterms);
	    }

}
