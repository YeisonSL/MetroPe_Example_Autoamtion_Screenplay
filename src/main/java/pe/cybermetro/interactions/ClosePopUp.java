package pe.cybermetro.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static pe.cybermetro.userinterfaces.CyberMetroHomePage.POP_UP;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.targets.Target;

public class ClosePopUp implements Interaction{
private Target element;

public ClosePopUp(Target element) {

	this.element = element;
}

@Override
	public <T extends Actor> void performAs(T actor) {
	actor.attemptsTo(Check.whether(element.resolveFor(actor).isPresent()).andIfSo(Click.on(element)));
		
	}

public static ClosePopUp inThePage(Target element ) {
	return instrumented(ClosePopUp.class,element);
	
}
}
