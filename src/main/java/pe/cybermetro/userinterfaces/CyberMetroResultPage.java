package pe.cybermetro.userinterfaces;


import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class CyberMetroResultPage {
	public static final Target LIST_OF_PRODUCTS = Target.the("List result").located(By.className("product-item__name"));
	
}
