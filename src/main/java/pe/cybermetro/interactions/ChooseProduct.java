package pe.cybermetro.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import pe.cybermetro.exceptions.WaitFor;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ChooseProduct implements Interaction{
	private Target element;

	
	public ChooseProduct(Target element) {
		this.element  = element;
	}

	
	@Override
	public <T extends Actor> void performAs (T actor) {
		
	}
	
	public static ChooseProduct visibility(Target element) {
		return instrumented(ChooseProduct.class, element);
		
	}
}

