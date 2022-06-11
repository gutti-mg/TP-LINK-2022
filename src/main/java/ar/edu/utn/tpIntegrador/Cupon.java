package ar.edu.utn.tpIntegrador;

public class Cupon {
	private Proveedor proveedor;
	private boolean disponible = true;
	private Descuento tipoDescuento;
	
	public Cupon(Descuento tipoDescuento, Proveedor proveedor) {
	super();
	this.proveedor = proveedor;
	this.tipoDescuento= tipoDescuento;
	}

	protected int promo (int base) {
		disponible = false;
		return base - tipoDescuento.descuento(base);
	}
}
