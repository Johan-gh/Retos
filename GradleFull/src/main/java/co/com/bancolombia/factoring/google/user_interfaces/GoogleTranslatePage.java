package co.com.bancolombia.factoring.google.user_interfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleTranslatePage {
	
	public static final Target SOURCE_LANGUAGE_BUTTON = Target.the("Botón de opciones de lenguaje de origen").located(By.id("gt-sl-gms"));
	public static final Target TARGET_LANGUAGE_BUTTON = Target.the("Botón de opciones de lenguaje de destino").located(By.id("gt-tl-gms"));
	public static final Target SOURCE_LANGUAGE = Target.the("Lenguajes a seleccionar origen").locatedBy("//*[@id='gt-sl-gms-menu']/table/tbody/tr/td/div/div/div[contains(text(),'{0}')]");
	public static final Target TARGET_LANGUAGE = Target.the("Lenguajes a seleccionar destino").locatedBy("//*[@id='gt-tl-gms-menu']/table/tbody/tr/td/div/div/div[contains(text(),'{0}')]");
	public static final Target TEXT_AREA = Target.the("Caja de texto para traducir").located(By.id("source"));
	public static final Target TRANSLATE_BUTTON = Target.the("Botón traducir").located(By.id("gt-submit"));
	public static final Target TEXT_AREA_TRANSLATED = Target.the("Caja de texto traducido").located(By.id("result_box"));
}
