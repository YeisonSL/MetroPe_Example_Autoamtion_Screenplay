package pe.cybermetro.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static pe.cybermetro.userinterfaces.CyberMetroResultPage.LIST_OF_PRODUCTS;

import org.openqa.selenium.Keys;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.conditions.Check;
import net.thucydides.core.annotations.Step;
import pe.cybermetro.interactions.WaitForElement;
import net.serenitybdd.screenplay.targets.Target;

public class AddProduct implements Task {

	private Target element;
	private Target elementBtn;
	private String product;

	public AddProduct(Target element, String product) {

		this.element = element;
		this.elementBtn = elementBtn;
		this.product = product;
	}

	@Step("the actor add the product to the cart #product")
	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(WaitForElement.visibility(element, 3));
		if (element.resolveAllFor(actor).size() > 0 || !element.resolveAllFor(actor).isEmpty()) {
			for (int i = 0; i < element.resolveAllFor(actor).size(); i++) {
				if (element.resolveAllFor(actor).get(i).getText().equals(product)) {
					actor.attemptsTo(Click.on(element));
					actor.attemptsTo(Click.on(elementBtn));
				}else {
					System.out.println("ERROR");
				}
			}
			
		}

	}

	public static AddProduct the(Target element,Target elementBtn, String product) {
		return instrumented(AddProduct.class, element, elementBtn, product);
	}
}
