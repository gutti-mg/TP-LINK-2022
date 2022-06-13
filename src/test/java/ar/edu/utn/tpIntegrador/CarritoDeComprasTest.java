package ar.edu.utn.tpIntegrador;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.ArrayList;
import java.util.Collection;


public class CarritoDeComprasTest {

	@Test
	public void testAgregarItemCarritoOk() throws Exception {
		
		
		Collection<ItemCarrito> items = new ArrayList<ItemCarrito>();
		Empleado empleado = new Empleado();
		CarritoDeCompras  carritoDeCompras =  new CarritoDeCompras(items);
		carritoDeCompras.agregarItem(new ItemCarrito(new Producto("Lapicera",70),6));
		
		
	}
}
