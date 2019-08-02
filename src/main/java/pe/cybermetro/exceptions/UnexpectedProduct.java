package pe.cybermetro.exceptions;

public class UnexpectedProduct extends Error {

    public static final String UNEXPECTED_ARTICLE="Los articulos listados no es igual al que espero";

    public UnexpectedProduct(String message , Throwable cause ){
        super(message, cause);
    }
}
