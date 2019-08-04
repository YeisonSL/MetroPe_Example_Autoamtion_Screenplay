package pe.cybermetro.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

//Mapeo de los elemetos dentro del carrito
public class CyberMetroCartPage extends PageObject {
	public static final Target PRODUCT_IN_THE_CART = Target.the("Product in the cart")
			.located(By.className("product-item__name"));
	public static final Target CHECKBOX_PRODUCT_CART = Target.the("Check product cart")
			.located(By.className("product-item__checkbox"));

}
