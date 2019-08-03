package pe.cybermetro.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class SelectProduct implements Interaction {

	private Target element;
	private String product;
	

	public SelectProduct(Target element, String product) {
		this.element = element;
		this.product = product;
		
	}
	
@Override
public <T extends Actor> void performAs(T actor) {
	actor.attemptsTo(WaitForElement.visibility(element, 3));
	if (element.resolveAllFor(actor).size() > 0 || !element.resolveAllFor(actor).isEmpty()) {
		for (int i = 0; i < element.resolveAllFor(actor).size(); i++) {
			if (element.resolveAllFor(actor).get(i).getText().equals(product)) {
				actor.attemptsTo(Click.on(element));
			}
		}
	}else {
		System.out.println("Producto no encontrado");
	}
}


public static SelectProduct selectProduct(Target element, String product) {
return instrumented(SelectProduct.class,element, product);

   }
}
