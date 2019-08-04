package pe.cybermetro.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static pe.cybermetro.userinterfaces.CyberMetroCartPage.*;

public class ValidateProduct implements Question<Boolean> {

	private String product;

	public ValidateProduct(String product) {
		this.product = product;

	}

	@Override
	public Boolean answeredBy(Actor actor) {

		return PRODUCT_IN_THE_CART.resolveFor(actor).getText().equals(product);

	}

	public static Question<Boolean> are(String product) {
		return new ValidateProduct(product);
	}

}