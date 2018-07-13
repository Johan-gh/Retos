package com.accenture.Correo_excel_Serenity.ui;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PasswordField {
	public static Target Password_Field = Target.the("password field").located(By.xpath("//*[@name='password']")); 

}
