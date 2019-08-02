package pe.cybermetro.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.Keys;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.targets.Target;

public class WriteProductAndSearch implements Interaction{
	private String product;
	private Target element;
	
public WriteProductAndSearch(String product, Target element) {
	
		this.product = product;
		this.element = element;
	}
@Override
public <T extends Actor> void performAs(T actor) {

	   actor.attemptsTo(
               Enter.theValue(product).into(element),
               Hit.the(Keys.ENTER).into(element)
       );
	

	
}
public static WriteProductAndSearch inThePage(String  product , Target element) {
	return instrumented(WriteProductAndSearch.class,product,element);
	
}
}
