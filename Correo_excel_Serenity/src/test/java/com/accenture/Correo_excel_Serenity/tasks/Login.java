package com.accenture.Correo_excel_Serenity.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;

import com.accenture.Correo_excel_Serenity.ui.AccountField;
import com.accenture.Correo_excel_Serenity.ui.PasswordField;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task{
	private final String loginaccount;
	private final String loginpassword;
	
	protected Login(String loginaccount,String loginpassword) {
        this.loginaccount = loginaccount;
        this.loginpassword = loginpassword;
    }

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(loginaccount)
                .into(AccountField.Account_Field)
                .thenHit(ENTER),
                Enter.theValue(loginpassword)
                .into(PasswordField.Password_Field)
                .thenHit(ENTER)
				
				);		
	}
	
	public static Login login(String Account, String Pass) {
        return instrumented(Login.class, Account,Pass);
    }

}
