package pe.cybermetro.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static pe.cybermetro.userinterfaces.CyberMetroCartPage.*;
import static pe.cybermetro.userinterfaces.CyberMetroHomePage.*;
import static pe.cybermetro.userinterfaces.CyberMetroProductPage.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import pe.cybermetro.interactions.GoToCart;
import pe.cybermetro.interactions.WaitForElement;

public class ValidateProductCart implements Task {

	 private String product;

	    public ValidateProductCart(String product){
	        this.product=product;
	    }

	@Step("the actor searchs the product called #product")
	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(GoToCart.the(CART_BUTTON, TOGOCART));
		actor.attemptsTo(WaitForElement.visibility(PRODUCT_IN_THE_CART, 3));
		if (PRODUCT_IN_THE_CART.resolveAllFor(actor).size() > 0
				|| !PRODUCT_IN_THE_CART.resolveAllFor(actor).isEmpty()) {
			System.out.println("ENTRE AL IF");
			for (int i = 0; i < PRODUCT_IN_THE_CART.resolveAllFor(actor).size(); i++) {
				System.out.println("ENTRE AL FOR ");
				System.out.println(PRODUCT_IN_THE_CART.resolveAllFor(actor).get(i).getText());
				System.out.println(product);
				if (PRODUCT_IN_THE_CART.resolveAllFor(actor).get(i).getText().equals(product)) {
					System.out.println("ENTRE VALIDACION");
					actor.attemptsTo(Click.on(CHECKBOX_PRODUCT_CART));
				}
			}

		}
	}

	public static Performable the(String product) {
		return instrumented(ValidateProductCart.class, product);
	}
}