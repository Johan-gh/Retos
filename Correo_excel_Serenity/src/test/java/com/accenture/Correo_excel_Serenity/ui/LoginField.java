package com.accenture.Correo_excel_Serenity.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class LoginField {
	public static Target Account_Field = Target.the("account field").located(By.xpath("//*[@id='identifierId']"));
	public static Target Password_Field = Target.the("password field").located(By.xpath("//*[@name='password']"));

}
