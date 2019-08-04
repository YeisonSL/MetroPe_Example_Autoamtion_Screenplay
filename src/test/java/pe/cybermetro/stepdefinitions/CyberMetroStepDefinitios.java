package pe.cybermetro.stepdefinitions;

import pe.cybermetro.exceptions.*;
import pe.cybermetro.interactions.GoTo;
import pe.cybermetro.questions.*;
import pe.cybermetro.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static pe.cybermetro.exceptions.UnexpectedProduct.UNEXPECTED_PRODUCT_CART;
import static pe.cybermetro.userinterfaces.CyberMetroHomePage.SEARCH;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CyberMetroStepDefinitios {

	@Before
	public void setTheStage() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("^that (.*) wants to add a product$")
	public void thatMikeWantsToWatchAVideo(String name) throws Exception {
		theActorCalled(name).attemptsTo(GoTo.theWeb(SEARCH));
	}

	@When("^he searches the product (.*) add it to the cart$")
	public void heSearchesTheProducto(String producto) throws Exception {
		theActorInTheSpotlight().attemptsTo(SearchAndAdd.seachTheProduct(producto));
	}

	@Then("^he should see at least (.*) product listed$")
	public void heShouldSeeAtLeastVideoListed(String theProductName) throws Exception {
		theActorInTheSpotlight().attemptsTo(ValidateProductCart.validateProduct(theProductName));
		theActorInTheSpotlight().should(seeThat(ValidateProduct.validate(theProductName))
				.orComplainWith(UnexpectedProduct.class, UNEXPECTED_PRODUCT_CART));
	}

}
