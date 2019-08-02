package pe.cybermetro.userinterfaces;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CyberMetroHomePage extends PageObject {
	
	public static final Target POP_UP = Target.the("Privacy Pop Up").located(By.id("onesignal-popover-cancel-button"));
	
	public static final Target SEARCH = Target.the("Search Input").located(By.id("search-autocomplete-input"));
	

}
