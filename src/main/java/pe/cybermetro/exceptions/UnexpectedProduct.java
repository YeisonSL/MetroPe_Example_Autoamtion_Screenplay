package pe.cybermetro.exceptions;

public class UnexpectedProduct extends Error {

    public static final String UNEXPECTED_PRODUCT_CART="No se agrego el producto al carrito";

    public UnexpectedProduct(String message , Throwable cause ){
        super(message, cause);
    }
}
