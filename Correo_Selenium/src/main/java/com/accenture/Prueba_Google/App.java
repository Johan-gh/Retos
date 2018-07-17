package com.accenture.Prueba_Google;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



/**
 * Hello world!
 *
 */
public class App 
{
	static WebDriver driver; //declara variable driver 
    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        System.out.print("Web driver inicializado");
        driver = new ChromeDriver(); //driver del navegador
        driver.manage().window().maximize();//abrir navegador
        driver.get("http://www.google.com.co"); //acceder a google
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);// tiempo de espera de 50 segundos 
        
   
        WebElement Buscar;
        WebElement clickgmail;
        WebElement correo;
        WebElement password;
        WebElement redactar;
        WebElement para;
        WebElement asunto;
        WebElement mensaje;
        WebElement enviar;
        
      
        //Busqueda "Gmail"
        Buscar=driver.findElement(By.xpath("//*[@id=\"lst-ib\"]"));
        Buscar.sendKeys("gmail \n");
        //Click en el primer resultado
        clickgmail = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/h3/a"));
        clickgmail.click();
        
        //Autenticación
        
        //correo
        correo = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
        correo.sendKeys("aquie el correo  \n");
        //password
        password = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
        password.sendKeys("aqui la clave \n");
        //click en redactar
        redactar = driver.findElement(By.xpath("//*[@role='button' and text()='Redactar']"));
        redactar.click();
        //para
        para = driver.findElement(By.xpath("//textarea[@name='to']"));
        para.sendKeys("correo destino");
        //asunto
        asunto = driver.findElement(By.xpath("//input[@name='subjectbox']"));
        asunto.sendKeys("Prueba automatizada");
        //mensaje
        mensaje = driver.findElement(By.xpath("//*[@aria-label='Cuerpo del mensaje' and@role='textbox']"));        
        mensaje.sendKeys("Este correo fue enviado por medio de selenium incluyendo un mensaje");
        //enviar
        enviar = driver.findElement(By.xpath("//*[@role='button' and text()='Enviar']"));
        enviar.click();

//        
        
        
    }
}
