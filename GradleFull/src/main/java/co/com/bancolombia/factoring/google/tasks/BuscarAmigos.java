package co.com.bancolombia.factoring.google.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.ArrayList;
import java.util.List;

import co.com.bancolombia.factoring.google.questions.TheResult;
import co.com.bancolombia.factoring.google.user_interfaces.FacebookHomePage;
import co.com.bancolombia.factoring.google.util.agendaDB;
import co.com.bancolombia.factoring.google.util.readexcel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;

public class BuscarAmigos implements Task{	
	private static String n;
	readexcel ex = new readexcel();	
	List<String> nombres =  ex.Obtenernombres();
	List<String> nombresdb =  agendaDB.ObtenerNombresAgenda();
	static ArrayList<String> x = new ArrayList<>();
	TheResult r = new TheResult();
	
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		System.out.println("consulta"+nombresdb);
		
		for (String nombre : nombresdb) {	
			actor.attemptsTo(
					Enter.theValue(nombre).into(FacebookHomePage.Input_Search),
					Click.on(FacebookHomePage.search),
					Click.on(FacebookHomePage.result)
					);
			
			n = Text.of(FacebookHomePage.title).viewedBy(actor).asString();
			if (nombre.equals(n)) {
				System.out.println(nombre+" === "+n);
				agendaDB.insertarcomprobacion("iguales", nombre);
			}else {
				System.out.println(nombre+" <> "+n);
				agendaDB.insertarcomprobacion("diferentes", nombre);
			}
			
		}		
	}
//	public static List<String> getnombresExcel() {
//		readexcel ex = new readexcel();
//		List<String> ListaNombres =  ex.Obtenernombres();
//		return ListaNombres;
//
//	}
//	public static String getNombresFacebook() {
//		return n;		
//	}

	public static BuscarAmigos buscaramigos(String nombre) {
		return instrumented(BuscarAmigos.class,nombre);	
	}
}
