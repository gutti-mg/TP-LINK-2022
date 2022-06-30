package ar.edu.utn.link.tpLink.producto.app;


import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name="productos")
public class Producto {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="prod_id")
	private Integer id_Producto;
	
	@NotBlank
	@Column(name="prod_nombre")
	private String nombre;
	
	@Min(0)
	@Column(name="prod_precio_Pesos")
	private Integer precio_Pesos;
	
	/*private double precio_Dolares;
	private int stock_Producto;
	private String id_Vendedor;
	//private double precio;

	
	//@ManyToOne
	private Proveedor proveedor;*/

	
	protected Producto() {
		super();
	}
	
	public Producto (String nombre, Integer precio) {
		super();
		this.nombre= nombre;
		this.precio_Pesos = precio;
	}
	
	
	public Integer getId_Producto() {
		return id_Producto;
	}
	public void setId_Producto(Integer id_Producto) {
		this.id_Producto = id_Producto;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre_Producto) {
		this.nombre = nombre_Producto;
	}

	public Integer getPrecio_Pesos() {
		return precio_Pesos;
	}
	
	public void setPrecio_Pesos(Integer precio_Pesos) {
		this.precio_Pesos = precio_Pesos;
	}
	
	/*public Proveedor getProveedor() {
		return proveedor;
	}
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public Producto (String id_Producto, double precio, String nombre, int stock) {
		super();
		this.id_Producto = id_Producto;
		this.nombre_Producto= nombre;
		this.stock_Producto = stock;
		this.precio = precio;
	}*/
	
	//@Override
	//public int hashCode() {
		//return Objects.hash(id_Producto,precio_Pesos);
	//}
	//@Override
	/*public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(id_Producto, other.id_Producto)
				&& Double.doubleToLongBits(precio_Pesos) == Double.doubleToLongBits(other.precio_Pesos);
	}
	
	
	//Para mostrar
	
	//@Override
	public String toString() {
		return "Producto [id_Producto=" + id_Producto + ", precio=" + precio_Pesos + "]";
	}

	public int getStock_Producto() {
		return stock_Producto;
	}
	public void setStock_Producto(int stock_Producto) {
		this.stock_Producto = stock_Producto;
	}
	public double getPrecio_Dolares() {
		return precio_Dolares;
	}
	public void setPrecio_Dolares(double precio_Dolares) {
		this.precio_Dolares = precio_Dolares;
	}
	public String getId_Vendedor() {
		return id_Vendedor;
	}
	public void setId_Vendedor(String id_Vendedor) {
		this.id_Vendedor = id_Vendedor;
	}
	*/
}
