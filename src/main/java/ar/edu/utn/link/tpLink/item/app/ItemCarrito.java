package ar.edu.utn.link.tpLink.item.app;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import ar.edu.utn.link.tpLink.producto.app.Producto;

@Entity
@Table(name="ItemCarrito")

public class ItemCarrito {

	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="item_id")
	private Integer item_id;
	
	@OneToOne
	private Producto producto;
	
	@Column(name="item_cant")
	private int cantidad;
	
	public Integer getItem_id() {
		return item_id;
	}

	public void setItem_id(Integer item_id) {
		this.item_id = item_id;
	}

	
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
		return this.getProducto().getPrecio_Pesos() * this.getCantidad();
	}
	
	
	
}
