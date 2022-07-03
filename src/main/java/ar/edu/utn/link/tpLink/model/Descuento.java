package ar.edu.utn.link.tpLink.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;


//@Entity
//@Table(name="descuento")
public abstract class Descuento {
	//protected LocalDate comienzo;
	//protected LocalDate fin;
//		@Id @GeneratedValue(strategy = GenerationType.AUTO)
//		@Column(name="descuento_id")
//		private Integer id_Descuento;
//		
//		@NotBlank
//		@Column(name="descuento_nombre")
//		private String nombre;
//		
//		@Min(0)
//		@Column(name="descuento_monto")
//		private Integer monto;
		
		protected void aplicarDescuento(int base) {
		this.descuento(base);
	}
	
	public abstract int descuento (int base);
}
