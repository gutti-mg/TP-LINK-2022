package ar.edu.utn.tpIntegrador;

import java.util.Objects;

public class ItemCarrito {

	private Producto producto;
	private int cantidad;
	
	public ItemCarrito (Producto producto, int cantidad) {
		super();
		this.setProducto(producto);
		this.setCantidad(cantidad);
	}
	
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(producto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemCarrito other = (ItemCarrito) obj;
		return Objects.equals(producto, other.producto);
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	public Producto getProducto() {
		return producto;
	}
	
	//Para mostrar
	
	@Override
	public String toString() {
		return "ItemCarrito [producto=" + producto + ", cantidad=" + cantidad + "]";
	}
	
	public double obtenerPrecio() {
		return this.getProducto().getPrecio() * this.getCantidad());
	}
	
	
	
}
