package pe.cybermetro.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;

public class GoToCart implements Task {

	private Target elementCarBtn;
	private Target elementGoCart;

	public GoToCart(Target elementCarBtn, Target elementGoCart) {
		this.elementCarBtn = elementCarBtn;
		this.elementGoCart = elementGoCart;
	}

	// Iterraciones para ir al carrito de compras
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(WaitForElement.visibility(elementCarBtn, 3));
		actor.attemptsTo(Scroll.to(elementCarBtn));
		actor.attemptsTo(WaitForElement.visibility(elementCarBtn, 10));
		actor.attemptsTo(Click.on(elementCarBtn));
		actor.attemptsTo(WaitForElement.visibility(elementCarBtn, 10));
		actor.attemptsTo(Click.on(elementGoCart));

	}

	public static GoToCart the(Target elementCarBtn, Target elementGoCart) {
		return instrumented(GoToCart.class, elementCarBtn, elementGoCart);
	}
}
