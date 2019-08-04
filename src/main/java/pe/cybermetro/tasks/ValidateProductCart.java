package pe.cybermetro.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static pe.cybermetro.userinterfaces.CyberMetroCartPage.*;
import static pe.cybermetro.userinterfaces.CyberMetroHomePage.*;
import static pe.cybermetro.userinterfaces.CyberMetroProductPage.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import pe.cybermetro.interactions.GoToCart;
import pe.cybermetro.interactions.WaitForElement;

public class ValidateProductCart implements Task {

	private String product;

	public ValidateProductCart(String product) {
		this.product = product;
	}

	// Buscar producto dentro del carrito por el nombre del producto
	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(GoToCart.the(CART_BUTTON, TOGOCART));
		actor.attemptsTo(WaitForElement.visibility(PRODUCT_IN_THE_CART, 3));
		if (PRODUCT_IN_THE_CART.resolveAllFor(actor).size() > 0
				|| !PRODUCT_IN_THE_CART.resolveAllFor(actor).isEmpty()) {
			for (int i = 0; i < PRODUCT_IN_THE_CART.resolveAllFor(actor).size(); i++) {
				if (PRODUCT_IN_THE_CART.resolveAllFor(actor).get(i).getText().equals(product)) {
					actor.attemptsTo(Click.on(CHECKBOX_PRODUCT_CART));
				}
			}

		}
	}

	public static Performable validateProduct(String product) {
		return instrumented(ValidateProductCart.class, product);
	}
}