package ar.edu.unq.po2.TpSolidBancario;

public class Cliente {
	protected String nombre;
	protected String apellido;
	protected String direccion;
	protected int edad;
	protected double sueldoMensual;
	protected double sueldoAnual;

	// Constructor y métodos getters/setters...
	public Cliente(String nombre, String apellido, String direccion, int edad, double sueldoMensual,
			double sueldoAnual) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoMensual = sueldoMensual;
		this.sueldoAnual = sueldoAnual;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSueldoMensual() {
		return sueldoMensual;
	}

	public void setSueldoMensual(double sueldoMensual) {
		this.sueldoMensual = sueldoMensual;
	}

	public double getSueldoAnual() {
		return sueldoAnual;
	}

	public void setSueldoAnual(double sueldoAnual) {
		this.sueldoAnual = sueldoAnual;
	}

	/**
	 * Crea y envía una solicitud de crédito hipotecario al banco.
	 * 
	 * @param banco     El banco al que se solicita el crédito.
	 * @param monto     El monto del crédito solicitado.
	 * @param plazo     El plazo en meses para devolver el crédito.
	 * @param propiedad La propiedad que se utiliza como garantía.
	 */
	/**
	 * Crea y envía una solicitud de crédito personal al banco.
	 * 
	 * @param banco El banco al que se solicita el crédito.
	 * @param monto El monto del crédito solicitado.
	 * @param plazo El plazo en meses para devolver el crédito.
	 */
	public void solicitarCreditoPersonal(Banco banco, double monto, int plazo) {
		Verificable solicitud = new SolicitudCreditoPersonal(this, monto, plazo);
		banco.registrarVerificable(solicitud);
	}

	public void solicitarCreditoHipotecario(Banco banco, double monto, int plazo, Propiedad propiedad) {
		Verificable solicitud = new SolicitudCreditoHipotecario(this, monto, plazo, propiedad);
		banco.registrarVerificable(solicitud);
	}
}
