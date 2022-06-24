package ar.edu.utn.link.tpLink.carrito.app;

import java.util.Collection;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ar.edu.utn.link.tpLink.item.app.ItemCarrito;
import ar.edu.utn.link.tpLink.producto.app.ProductoRepetidoException;

import java.util.ArrayList;


@Entity
@Table(name="carrito")
public class Carrito {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="carrito_id")
	private Integer  carrito_Id;
	
	@OneToMany
	private Collection<ItemCarrito> items;

	protected Carrito(){
		super();
	}
	
	public Carrito(Collection<ItemCarrito> items) {
		super();
		this.items = new ArrayList<ItemCarrito>();
	}
	
	public Collection<ItemCarrito> getItems(){
		Collection<ItemCarrito> items2= new ArrayList<ItemCarrito>();
		items2.addAll(this.items);
		return items2;
	}

	
	public void setItems(Collection<ItemCarrito> items) {
		this.items = items;
	}

	public void agregarItem(ItemCarrito item) throws ProductoRepetidoException{
		if(tieneProductoRepetido(item)) {
			throw new ProductoRepetidoException();
		}
		items.add(item);
	}

	public boolean tieneProductoRepetido (ItemCarrito item) {
		return(this.getItems().stream().anyMatch(itemX->itemX.getProducto().equals(itemX.getProducto())))? true : false;
		
	}
	
	/*
	public void solucionarCantidadProductoRepetido(ItemCarrito item) {
		ItemCarrito itemEncontrado = this.getItems().stream().filter(x->x.equals(item)). findFirst().get();
		int cantTotal = item.getCantidad() + itemEncontrado.getCantidad();
		itemEncontrado.setCantidad(cantTotal);
	}
	
	public boolean tieneItem(ItemCarrito item) {
		return (this.getItems().contains(item))? true : false ;
	}
	
	
	public double calcularPrecioTotal() {	
		return this.getItems().stream().mapToDouble(item->item.obtenerPrecio()).sum();	
	}

	@Override
	public String toString() {
		return "CarritoDeCompras [items=" + items + "]";
	}*/
	
	
}
	