package ar.edu.utn.tpIntegrador;

import java.util.Collection;
import java.util.ArrayList;

import ar.edu.utn.tpIntegrador.exception.tieneProductoRepetidoException;

public class CarritoDeCompras {

	private Collection<ItemCarrito> items;


	public CarritoDeCompras(Collection<ItemCarrito> items) {
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

	public void agregarItem(ItemCarrito item) throws tieneProductoRepetidoException{
		if(tieneProductoRepetido(item)) {
			throw new tieneProductoRepetidoException();
		}
		items.add(item);
	}
	
	public void solucionarCantidadProductoRepetido(ItemCarrito item) {
		ItemCarrito itemEncontrado = this.getItems().stream().filter(x->x.equals(item)). findFirst().get();
		int cantTotal = item.getCantidad() + itemEncontrado.getCantidad();
		itemEncontrado.setCantidad(cantTotal);
	}
	
	public boolean tieneItem(ItemCarrito item) {
		return (this.getItems().contains(item))? true : false ;
	}
	
	public boolean tieneProductoRepetido (ItemCarrito item) {
		return(this.getItems().stream().anyMatch(itemX->itemX.getProducto().equals(itemX.getProducto())))? true : false;
		
	}
	
	public double calcularPrecioTotal() {	
		return this.getItems().stream().mapToDouble(item->item.obtenerPrecio()).sum();	
	}

	@Override
	public String toString() {
		return "CarritoDeCompras [items=" + items + "]";
	}
	
	
}
	