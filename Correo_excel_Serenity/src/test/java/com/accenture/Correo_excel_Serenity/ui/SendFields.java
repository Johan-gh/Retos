package com.accenture.Correo_excel_Serenity.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class SendFields {	
	public static Target Redact = Target.the("redact").located(By.xpath("//*[@role='button' and text()='Redactar']"));
	public static Target ToField = Target.the("To field").located(By.xpath("//textarea[@name='to']"));
	public static Target SubjectField = Target.the("Subject field").located(By.xpath("//input[@name='subjectbox']"));
	public static Target MessageField = Target.the("Message field").located(By.xpath("//*[@aria-label='Cuerpo del mensaje' and@role='textbox']"));
	public static Target Send = Target.the("Send").located(By.xpath("//*[text()='Enviar']"));
	public static Target Sent = Target.the("Sent").located(By.xpath("//a[contains(text(),'Enviados')]"));
	
	

}
