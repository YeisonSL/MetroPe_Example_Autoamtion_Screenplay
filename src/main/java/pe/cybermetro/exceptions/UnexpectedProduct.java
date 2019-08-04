package pe.cybermetro.exceptions;

import static pe.cybermetro.userinterfaces.CyberMetroCartPage.*;

public class UnexpectedProduct extends Error {

	public static final String UNEXPECTED_PRODUCT_CART = "No se agrego el producto" + PRODUCT_IN_THE_CART
			+ " al carrito";

	// Mensaje que se retorna cuando no se cumple la ccondicion que el producto no
	// se agregro al carrito
	public UnexpectedProduct(String message, Throwable cause) {
		super(message, cause);
	}
}
