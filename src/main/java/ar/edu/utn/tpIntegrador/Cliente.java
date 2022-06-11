package ar.edu.utn.tpIntegrador;

import java.util.List;

public class Cliente {

	private String nombre;
	private Number fechaNacimiento;
	private Enum<tipoDocumento> tipoDocumento;
	private String nroDocumento;
	private String telefono;
	private String email;
	private List<OrdenCompra> comprasRealizadas;
	private Enum<medioDePago> medioDePago;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
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

}
