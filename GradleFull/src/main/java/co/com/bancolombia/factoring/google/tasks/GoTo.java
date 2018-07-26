package co.com.bancolombia.factoring.google.tasks;

import co.com.bancolombia.factoring.google.user_interfaces.GoogleApps;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoTo implements Task {
	
	private Target googleApp;
	
	public GoTo(Target googleApp) {
		this.googleApp = googleApp;
	}
	
	@Override
	@Step("{0} goes to #googleApp")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(GoogleApps.GOOGLE_APPS_BUTTON));	
		actor.attemptsTo(Click.on(googleApp));
	}

	public static GoTo theApp(Target googleApp) {		
		return instrumented(GoTo.class, googleApp);
	}

}
