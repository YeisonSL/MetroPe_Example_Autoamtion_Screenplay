package pe.cybermetro.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

public class SearchProductInTheCart implements Interaction {

	private Target element;
	private String product;

	

	public SearchProductInTheCart(Target element, String product) {
		this.element = element;
		this.product = product;
		
	}
	
@Override
public <T extends Actor> void performAs(T actor) {
	actor.attemptsTo(WaitForElement.visibility(element, 3));
	if (element.resolveAllFor(actor).size() > 0 || !element.resolveAllFor(actor).isEmpty()) {
		for (int i = 0; i < element.resolveAllFor(actor).size(); i++) {
			if (element.resolveAllFor(actor).get(i).getText().equals(product)) {
				System.out.println("Nombre text"+element.resolveAllFor(actor).get(i).getText());
				product = element.resolveAllFor(actor).get(i).getText();
			}
		}
	}else {
		System.out.println("Producto no encontrado");
	}

}


public static SelectNameProduct selectNameProduct(Target element, String product) {
return instrumented(SelectNameProduct.class,element, product);

   }
}
