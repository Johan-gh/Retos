package co.com.bancolombia.factoring.google.user_interfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class FacebookHomePage {
	public static final Target Input_Search = Target.the("Facebook email").located(By.name("q"));
	public static final Target search = Target.the("Facebook pass").located(By.xpath("//button[@aria-label='Buscar']"));
	public static final Target result = Target.the("Facebook pass").located(By.xpath("//div[@class=\"_52eh _5bcu\"][@style=\"-webkit-line-clamp: 2;\"]"));
	public static final Target title = Target.the("Facebook pass").located(By.xpath("//*[@id='fb-timeline-cover-name']/a"));
	//
}
