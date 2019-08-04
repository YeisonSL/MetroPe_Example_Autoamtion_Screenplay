package pe.cybermetro.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;

public class AddProduct implements Task {

	private String product;
	private Target element;
	private Target elementBtn;
	private Target elementCarBtn;

	public AddProduct(Target element, Target elementBtn, String product, Target elementCarBtn) {

		this.product = product;
		this.element = element;
		this.elementBtn = elementBtn;
		this.elementCarBtn = elementCarBtn;

	}

	// Interacciones que se realizan para agregar el producto al carrito
	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(SelectNameProduct.selectProduct(element, product));
		actor.attemptsTo(WaitForElement.visibility(elementBtn, 3));
		actor.attemptsTo(Scroll.to(elementBtn));
		actor.attemptsTo(WaitForElement.visibility(elementBtn, 3));
		actor.attemptsTo(Click.on(elementCarBtn));

	}

	public static AddProduct theProduct(Target element, Target elementBtn, String product, Target elementCarBtn) {
		return instrumented(AddProduct.class, element, elementBtn, product, elementCarBtn);
	}
}
