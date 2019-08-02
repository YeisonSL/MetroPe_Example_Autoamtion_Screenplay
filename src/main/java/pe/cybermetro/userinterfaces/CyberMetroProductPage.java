package pe.cybermetro.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CyberMetroProductPage extends PageObject {
	
	public static final Target PRODUCT_PAGE = Target.the("Produuct Page").located(By.id("image"));
	public static final Target PRODUCT = Target.the("Product").located(By.xpath("//*[@class='product-add-to-cart__text desktop']"));
	
}
