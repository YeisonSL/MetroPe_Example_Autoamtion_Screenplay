package pe.cybermetro.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;
import pe.cybermetro.interactions.SelectProduct;
import pe.cybermetro.interactions.WaitForElement;

public class AddProduct implements Task {
	
	private String product;
	private Target element;
	private Target elementBtn;

	public AddProduct(Target element, Target elementBtn, String product) {
		
		this.product = product;
		this.element = element;
		this.elementBtn = elementBtn;
	}

	@Step("the actor add the product to the cart #product")
	@Override
	public <T extends Actor> void performAs(T actor) {

					actor.attemptsTo(SelectProduct.selectProduct(element, product));
					actor.attemptsTo(WaitForElement.visibility(elementBtn, 3));
					actor.attemptsTo(Scroll.to(elementBtn));
//					actor.attemptsTo(Click.on(elementBtn));
//					
//					actor.attemptsTo(Click.on(elementBtn));
//					actor.attemptsTo(Click.on(elementBtn));
					
				}
			
		
		
//	}
//		
//		while (!elementBtn.resolveAllFor(actor).isEmpty()) {
//			System.out.println(elementPage.resolveAllFor(actor).size());
			
		
				
		
		

	

	public static AddProduct the(Target element,Target elementBtn, String product) {
		return instrumented(AddProduct.class, element, elementBtn, product);
	}
}
