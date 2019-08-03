package pe.cybermetro.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static pe.cybermetro.userinterfaces.CyberMetroHomePage.*;
import static pe.cybermetro.userinterfaces.CyberMetroProductPage.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;
import pe.cybermetro.interactions.GoToCart;

public class ValidateProductCart implements Task {

	@Step("the actor searchs the product called #product")
	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(GoToCart.the(CART_BUTTON, TOGOCART));

	}

	public static Performable the() {
		return instrumented(ValidateProductCart.class);
	}
}