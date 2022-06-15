package ar.edu.utn.tpIntegrador;

import java.util.Objects;

public class Producto {

	private String id_Producto;
	private double precio;
	private Proveedor proveedor;

	public String getId_Producto() {
		return id_Producto;
	}
	public void setId_Producto(String id_Producto) {
		this.id_Producto = id_Producto;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Proveedor getProveedor() {
		return proveedor;
	}
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public Producto (String id_Producto, double precio) {
		super();
		this.id_Producto = id_Producto;
		this.precio = precio;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id_Producto,precio);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(id_Producto, other.id_Producto)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}
	
	
	//Para mostrar
	
	@Override
	public String toString() {
		return "Producto [id_Producto=" + id_Producto + ", precio=" + precio + "]";
	}
	
}
