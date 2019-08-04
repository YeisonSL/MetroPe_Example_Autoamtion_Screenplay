package pe.cybermetro.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

//Mapeo de elementos del para agrrgar al carrito
public class CyberMetroProductPage extends PageObject {

	public static final Target PRODUCT_PAGE = Target.the("Produuct Page").located(By.id("image"));
	public static final Target PRODUCT = Target.the("Product")
			.located(By.xpath("//*[@class='product-add-to-cart__text desktop']"));
	public static final Target ADD_PRODUCT = Target.the("Add Product Btn").located(
			By.xpath("//*[@class='product-add-to-cart btn red add-to-cart product-add-to-cart--product-view']"));
	public static final Target TOGOCART = Target.the("To Go Cart")
			.located(By.xpath("//*[@class='minicart__items-wrapper']//*[text()='Ver carrito']"));

}
