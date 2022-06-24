package ar.edu.utn.link.tpLink.model;

import java.time.LocalDate;

public abstract class Descuento {
	protected LocalDate comienzo;
	protected LocalDate fin;
	
	public void aplicarDescuento(int base) {
		this.descuento(base);
	}
	
	protected abstract int descuento (int base);
}
