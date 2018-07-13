package com.accenture.Correo_excel_Serenity.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AccountField {
	public static Target Account_Field = Target.the("account field").located(By.xpath("//*[@id='identifierId']"));

}
