package ar.edu.utn.tpIntegrador;

public class OrdenCompra {
	
	private double TotalSinDescuento;
	private double TotalConDescuento;
	private int DescuentoPorSocio;
	private String tipoDePago; 
	
	public void visualizarProductos(CarritoDeCompras carrito) {
		carrito.toString();
	}
	
	public void calcularPrecioFinal(CarritoDeCompras carrito, Promocion promocion, Cliente cliente) {
		TotalSinDescuento = carrito.calcularPrecioTotal();
		if(cliente.esSocio()) {	
		DescuentoPorSocio = promocion.getDescuento();
		}
		TotalConDescuento = TotalSinDescuento + DescuentoPorSocio;	
	
	 if(tipoDePago==cliente.getMedioDePago()) {
		 switch (tipoDePago) { 
		    /*case "BilleteraVirtual":
		    if(billeteraVirtual.getMonto())
		     break;
		    case value2:

		     break;

		     break;
		    default:
		  }
		 */
	 }
}
}