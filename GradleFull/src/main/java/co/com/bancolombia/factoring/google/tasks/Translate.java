package co.com.bancolombia.factoring.google.tasks;

import co.com.bancolombia.factoring.google.model.TranslateExpression;
import co.com.bancolombia.factoring.google.user_interfaces.GoogleTranslatePage;
import co.com.bancolombia.factoring.google.util.StringToTarget;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class Translate implements Task{
	
	TranslateExpression translateExpression;
	
    // Clase: CamelCaseUp ; Metodos y variables: camelCaseDown ; Constantes: ESTO_ES_CONSTANTE ; Feature: esto_es_feature

	public Translate(TranslateExpression translateExpression) {
		this.translateExpression = translateExpression;
	}
	
	@Override
	@Step("{0} translate #TranslateExpression")
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(GoogleTranslatePage.SOURCE_LANGUAGE_BUTTON));
		actor.attemptsTo(Click.on(StringToTarget.getSourceLanguageTarget(translateExpression.getSourceLanguage())));
		actor.attemptsTo(Click.on(GoogleTranslatePage.TARGET_LANGUAGE_BUTTON));
		actor.attemptsTo(Click.on(StringToTarget.getTargetLanguageTarget(translateExpression.getTargetLanguage())));
		actor.attemptsTo(Enter.theValue(translateExpression.getWord()).into(GoogleTranslatePage.TEXT_AREA));
		actor.attemptsTo(Click.on(GoogleTranslatePage.TRANSLATE_BUTTON));
	}

	public static Translate the(TranslateExpression translateExpression) {
		// TODO Auto-generated method stub
		return instrumented(Translate.class, translateExpression);
	}

}
