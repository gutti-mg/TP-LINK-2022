package ar.edu.utn.link.tpLink.usuario.app;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import ar.edu.utn.link.tpLink.carrito.app.Carrito;


@Entity
@Table(name="cliente")
public class Usuario {

	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="cliente_id")
	private Integer id_Cliente;
	
	@NotBlank
	@Column(name="cliente_nombre")
	private String nombre;
	
	//@Column(name="cliente_carrito")
	//private Carrito carritoCliente;
	
//	@OneToOne
//	private Collection<Producto> carrito;
	@OneToOne
	private Carrito carrito;
	
	//private List<OrdenCompra> comprasRealizadas;
	
	/*
	private Number fechaNacimiento;
	private Enum<tipoDocumento> tipoDocumento;
	private String nroDocumento;
	private String telefono;
	private String email;
	private Enum<medioDePago> medioDePago;
	private String medioDePago;
	private Boolean esSocio;
*/

	
//	public Collection<Producto> getCarrito() {
//		return carrito;
//	}
//
//	public void setCarrito(Collection<Producto> carrito) {
//		this.carrito = carrito;
//	}

	public Carrito getCarrito() {
		return carrito;
	}

	public void setCarrito(Carrito carrito) {
		this.carrito = carrito;
	}

	protected Usuario() {
		super();
	}
	
	public Integer getId_Cliente() {
		return id_Cliente;
	}
	public void setId_Cliente(Integer id_Cliente) {
		this.id_Cliente = id_Cliente;
	}
	public Usuario(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
//	public Carrito getCarritoCliente() {
//		return carritoCliente;
//	}
//
//	public void setCarritoCliente(Carrito carritoCliente) {
//		this.carritoCliente = carritoCliente;
	
	/*
	public Number getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Number fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Enum<tipoDocumento> getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(Enum<tipoDocumento> tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	
	
	public String getNroDocumento() {
		return nroDocumento;
	}
	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<OrdenCompra> getComprasRealizadas() {
		return comprasRealizadas;
	}
	public void setComprasRealizadas(List<OrdenCompra> comprasRealizadas) {
		this.comprasRealizadas = comprasRealizadas;
	}
	
	
	public Enum<medioDePago> getMedioDePago() {
		return medioDePago;
	}
	public void setMedioDePago(Enum<medioDePago> medioDePago) {
		this.medioDePago = medioDePago;
	}
	
	public Boolean esSocio() {
		return esSocio;
	}
	public void setSocio(Boolean socio) {
		this.esSocio = socio;
	}
	public String getMedioDePago() {
		return medioDePago;
	}
	public void setMedioDePago(String medioDePago) {
		this.medioDePago = medioDePago;
	}


	}*/

}
