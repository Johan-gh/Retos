package co.com.bancolombia.factoring.google.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class GoogleApps {
	public static final Target GOOGLE_APPS_BUTTON = Target.the("Google Apps Button").locatedBy("//*[@id=\"gbwa\"]/div[1]/a");
	public static final Target GOOGLE_TRANSLATE = Target.the("Google Translate Button").locatedBy("//*[@id=\"gb51\"]/span[1]");
}
