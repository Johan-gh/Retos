package com.accenture.Calculadora_excel;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

/**
 * Hello world!
 *
 */
public class App {

	public static AppiumDriver<MobileElement> driver; //Este driver es el que contralara los eventos de la automatizacion
	DesiredCapabilities capabilities = new DesiredCapabilities(); //caracteristicas de la automatizacion

	@BeforeMethod
	public void setUpAppium() throws MalformedURLException, InterruptedException {
		String packagename = "com.google.android.calculator"; //Paquete principal de la aplicacion a automatizar
		String URL = "http://127.0.0.1:4723/wd/hub"; //IP y puerto de Appium
		String activityname = "com.android.calculator2.CalculatorGoogle"; //Nombre de la actividad (o vista) en donde empezara la automatizacion
		capabilities.setCapability("deviceName", "Moto G (5) Plus"); //No es obligatorio que este nombre coincida
		capabilities.setCapability("udid", "ZY22448CDW"); //Serial del dispositivo, se obtiene activando la depuración USB y con el comando adb devices
		capabilities.setCapability("platformVersion", "7.0"); //No es obligatorio que la version coincida
		capabilities.setCapability("platformName", "Android"); //Nombre del sistema operativo
		capabilities.setCapability("appPackage", packagename);
		capabilities.setCapability("appActivity", activityname);
		driver = new AndroidDriver<MobileElement>(new URL(URL), capabilities);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	}

	@AfterTest
	public void CleanUpAppium() {
		driver.quit();
	}

	@Test
	public void mytest() throws InterruptedException {
		
		LeerExcel leerexcel = null;
		try {
			leerexcel = new LeerExcel();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<Operacion> operaciones = leerexcel.ObtenerOperaciones();
		
		Thread.sleep(2000);
		
		for (Operacion operacion : operaciones) {
			writeDigit(operacion.getNum1());
			writeOperation(operacion.getOperacione());
			writeDigit(operacion.getNum2());			
			MobileElement igual = driver.findElement(By.id("com.google.android.calculator:id/eq"));
			igual.click();
			
		}
		
	
	}
	
	public void writeDigit(int number) {
		MobileElement element;
		String path = "";
			switch (number) {
			case 0:{
				path = "com.google.android.calculator:id/digit_0";
				break;
			}case 1:
				path = "com.google.android.calculator:id/digit_1";
				break;
			case 2:{
				path = "com.google.android.calculator:id/digit_2";
				break;
			}case 3:
				path = "com.google.android.calculator:id/digit_3";
				break;
			case 4:{
				path = "com.google.android.calculator:id/digit_4";
				break;
			}case 5:
				path = "com.google.android.calculator:id/digit_5";
				break;
			case 6:{
				path = "com.google.android.calculator:id/digit_6";
				break;
			}case 7:
				path = "com.google.android.calculator:id/digit_7";
				break;
			case 8:{
				path = "com.google.android.calculator:id/digit_8";
				break;
			}case 9:{
				path = "com.google.android.calculator:id/digit_9";
				break;
				}
			}
			System.out.println(path);
			element = driver.findElement(By.id(path));
			element.click();
			
	}
	public void writeOperation(String operation) {
		MobileElement element;
		String path = "";
		System.out.println(operation);
		if (operation.compareTo("+") == 0) {
			path = "com.google.android.calculator:id/op_add";
		}else if(operation.compareTo("-") == 0){
			path = "com.google.android.calculator:id/op_sub";
		}else if(operation.compareTo("*") == 0){
			path = "com.google.android.calculator:id/op_mul";
		}else if(operation.compareTo("/") == 0){
			path = "com.google.android.calculator:id/op_div";
		}
		System.out.println(path);
		element = driver.findElement(By.id(path));
		element.click();
	}
}
