package ar.edu.utn.link.tpLink.proveedor.app.copy;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import ar.edu.utn.link.tpLink.producto.app.Producto;



@Entity
@Table(name="proveedor")
public class Proveedor {
		
		@Id @GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name="proveedor_id")
		private Integer id_Proveedor;
		
		@NotBlank
		@Column(name="proveedor_nombre")
		private String nombre;
		
		@OneToMany
		private Collection<Producto> productos;

	}
