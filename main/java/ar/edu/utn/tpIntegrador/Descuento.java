package ar.edu.utn.tpIntegrador;

import java.time.LocalDate;

public abstract class Descuento {
	protected LocalDate comienzo;
	protected LocalDate fin;
	
	public void aplicarDescuento(int base) {
		this.descuento(base);
	}
	
	protected abstract int descuento (int base);
}
