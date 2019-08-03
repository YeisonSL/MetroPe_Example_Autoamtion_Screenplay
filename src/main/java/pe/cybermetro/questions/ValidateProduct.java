package pe.cybermetro.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static pe.cybermetro.userinterfaces.CyberMetroResultPage.LIST_OF_PRODUCTS;

public class ValidateProduct implements Question<Boolean> {

    private int theProductName;

    public ValidateProduct (int theProductName){
        this.theProductName = theProductName;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        return LIST_OF_PRODUCTS.resolveAllFor(actor).size()>=theProductName;
    }

    public static Question<Boolean> are(int theProductName) {
        return new ValidateProduct(theProductName);
    }

}