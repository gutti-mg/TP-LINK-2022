package ar.edu.utn.tpIntegrador.exception;

import ar.edu.utn.tpIntegrador.ItemCarrito;

public class tieneProductoRepetidoException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private ItemCarrito item;

	public tieneProductoRepetidoException(ItemCarrito item) {
		this.item = item;
	}

	public tieneProductoRepetidoException() {
		super();
	}

	public tieneProductoRepetidoException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public tieneProductoRepetidoException(String message, Throwable cause) {
		super(message, cause);
	}

	public tieneProductoRepetidoException(String message) {
		super(message);
	}

	public tieneProductoRepetidoException(Throwable cause) {
		super(cause);
	}

	public ItemCarrito getMateria() {
		return item;
	}
	
	
	
}
