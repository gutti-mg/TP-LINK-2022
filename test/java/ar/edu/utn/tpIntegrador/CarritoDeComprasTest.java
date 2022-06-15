package ar.edu.utn.tpIntegrador;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;


public class CarritoDeComprasTest {

	@Test
	public void testAgregarItemCarritoOk() throws Exception {
		
		//Precondición
		
		Collection<ItemCarrito> items = new ArrayList<ItemCarrito>();
		CarritoDeCompras  carritoDeCompras =  new CarritoDeCompras(items);
		carritoDeCompras.agregarItem(new ItemCarrito(new Producto("Cartuchera",5),6));
		carritoDeCompras.agregarItem(new ItemCarrito(new Producto("Tornillo",7),6));
		ItemCarrito lapiz = new ItemCarrito(new Producto("Lapiz",3),6);
		
		//Operatoria
		carritoDeCompras.agregarItem(lapiz);
		
		//Postcondicion
		assertTrue(carritoDeCompras.tieneItem(lapiz));
		
	}


	@Test 
	public void testAgregarItemRepetido() throws Exception{
		
		//Precondición
	
		Cliente cliente = new Cliente("Antonio");
		Collection<ItemCarrito> items = new ArrayList<ItemCarrito>();
		CarritoDeCompras  carritoDeCompras =  new CarritoDeCompras(items);
		carritoDeCompras.agregarItem(new ItemCarrito(new Producto("Cartuchera",5),6));
		carritoDeCompras.agregarItem(new ItemCarrito(new Producto("Tornillos",7),6));
		ItemCarrito lapiz = new ItemCarrito(new Producto("Lapiz",3),6);
		
		//Operatoria
		Producto producto1 = new Producto ("Tornillo", 2);
		
		//Postcondicion
	}
	}
