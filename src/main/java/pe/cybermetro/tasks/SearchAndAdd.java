package pe.cybermetro.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;
import pe.cybermetro.interactions.AddProduct;
import pe.cybermetro.interactions.ClosePopUp;
import pe.cybermetro.interactions.WaitForElement;
import pe.cybermetro.interactions.WriteProductAndSearch;

import static pe.cybermetro.userinterfaces.CyberMetroHomePage.POP_UP;
import static pe.cybermetro.userinterfaces.CyberMetroHomePage.SEARCH;
import static pe.cybermetro.userinterfaces.CyberMetroResultPage.LIST_OF_PRODUCTS;
import static pe.cybermetro.userinterfaces.CyberMetroProductPage.*;


import static net.serenitybdd.screenplay.Tasks.instrumented;


public class SearchAndAdd implements Task {

    private String product;

    public SearchAndAdd(String product){
        this.product=product;
    }

    @Step("the actor searchs the product called #product")
    @Override
    public <T extends Actor> void performAs(T actor) {
    	
    	actor.attemptsTo(WaitForElement.visibility(POP_UP, 3));
    	actor.attemptsTo(ClosePopUp.inThePage(POP_UP));
        actor.attemptsTo(WriteProductAndSearch.inThePage(product, SEARCH));
        actor.attemptsTo(AddProduct.the(LIST_OF_PRODUCTS, PRODUCT,product, ADD_PRODUCT));
        
    }

    public static Performable the(String product){
        return  instrumented(SearchAndAdd.class, product);
    }
}