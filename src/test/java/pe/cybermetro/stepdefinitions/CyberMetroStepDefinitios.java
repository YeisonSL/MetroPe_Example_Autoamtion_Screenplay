package pe.cybermetro.stepdefinitions;


import pe.cybermetro.exceptions.*;
import pe.cybermetro.interactions.GoTo;
import pe.cybermetro.questions.*;
import pe.cybermetro.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static pe.cybermetro.exceptions.UnexpectedProduct.UNEXPECTED_ARTICLE;
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
	        theActorCalled(name).attemptsTo(GoTo.theApp(SEARCH));
	    }
	   
	    @When("^he searches the product (.*) add it to the cart$")
	    public void heSearchesTheProducto(String producto) throws Exception {
	        theActorInTheSpotlight().attemptsTo(SearchAndAdd.the(producto));
	    }
	    
//	    @And("^add it to the cart$")
//	    public void AddInToTheCart( ) throws Exception {
//	        theActorInTheSpotlight().attemptsTo(AddProduct.the());
//	    }

	    @Then("^he should see at least (\\d+) product listed$")
	    public void heShouldSeeAtLeastVideoListed(int theProductName) throws Exception {
	        theActorInTheSpotlight().should(seeThat(SelectedArticle.are(theProductName))
	                .orComplainWith(UnexpectedProduct.class, UNEXPECTED_ARTICLE));
	}

}
