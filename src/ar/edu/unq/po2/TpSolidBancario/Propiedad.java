package ar.edu.unq.po2.TpSolidBancario;

/**
 * Clase que representa una propiedad inmobiliaria. Utilizada como garantía en
 * las solicitudes de crédito hipotecario.
 */
public class Propiedad {
	private String descripcion;
	private String direccion;
	private double valorFiscal;

	/**
	 * Constructor para crear una nueva propiedad.
	 * 
	 * @param descripcion Descripción breve de la propiedad.
	 * @param direccion   Dirección de la propiedad.
	 * @param valorFiscal Valor fiscal estimado de la propiedad.
	 */
	public Propiedad(String descripcion, String direccion, double valorFiscal) {
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.valorFiscal = valorFiscal;
	}

	// Getters y setters

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getValorFiscal() {
		return valorFiscal;
	}

	public void setValorFiscal(double valorFiscal) {
		this.valorFiscal = valorFiscal;
	}
}