package pe.cybermetro.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

//Mapeo de elementos del resultado de busqueda
public class CyberMetroResultPage extends PageObject {
	public static final Target LIST_OF_PRODUCTS = Target.the("List result").located(By.className("product-item__name"));

}
