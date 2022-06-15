package ar.edu.utn.tpIntegrador;

public class Cupon {
	private Proveedor proveedor;
	private boolean disponible = true;
	private Descuento tipoDescuento;
	
	public Cupon(Descuento tipoDescuento, Proveedor proveedor) {
	super();
	this.setProveedor(proveedor);
	this.tipoDescuento= tipoDescuento;
	}

	protected int promo (int base) {
		setDisponible(false);
		return base - tipoDescuento.descuento(base);
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
}
