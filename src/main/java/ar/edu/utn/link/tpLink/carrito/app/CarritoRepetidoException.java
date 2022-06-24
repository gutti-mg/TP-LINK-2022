package ar.edu.utn.link.tpLink.carrito.app;

public class CarritoRepetidoException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private Carrito carrito;

	public CarritoRepetidoException(Carrito carrito) {
		this.carrito = carrito;
	}

	public CarritoRepetidoException() {
		super();
	}

	public CarritoRepetidoException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public CarritoRepetidoException(String message, Throwable cause) {
		super(message, cause);
	}

	public CarritoRepetidoException(String message) {
		super(message);
	}

	public CarritoRepetidoException(Throwable cause) {
		super(cause);
	}

	public Carrito getProducto() {
		return carrito;
	}
	
	
	
}
