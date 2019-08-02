package pe.cybermetro.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CyberMetroProductPage extends PageObject {
	
	public static final Target PRODUCT = Target.the("Product").located(By.cssSelector("product-add-to-cart product-add-to-cart--product-view btn red add-to-cart"));
	
}
