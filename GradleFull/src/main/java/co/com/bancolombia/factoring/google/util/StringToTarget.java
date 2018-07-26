package co.com.bancolombia.factoring.google.util;

import co.com.bancolombia.factoring.google.user_interfaces.GoogleTranslatePage;
import net.serenitybdd.screenplay.targets.Target;

public class StringToTarget {

	public static Target getSourceLanguageTarget(String sourceLanguage) {
		// TODO Auto-generated method stub
		System.out.println(sourceLanguage);
		return GoogleTranslatePage.SOURCE_LANGUAGE.of(sourceLanguage);
	}

	public static Target getTargetLanguageTarget(String targetLanguage) {
		// TODO Auto-generated method stub
		System.out.println(targetLanguage);
		return GoogleTranslatePage.TARGET_LANGUAGE.of(targetLanguage);
	}
}
