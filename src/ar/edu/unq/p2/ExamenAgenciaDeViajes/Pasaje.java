package ar.edu.unq.p2.ExamenAgenciaDeViajes;

import java.time.LocalDate;

public class Pasaje extends Producto implements IOperation {
	protected String nombreAeropuerto;

	public Pasaje(String nombreAeropuerto) {
		super();
		this.nombreAeropuerto = nombreAeropuerto;
	}

	public Pasaje() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pasaje(double precioPorPersona, LocalDate fechaInicio, LocalDate fechaFin) {
		super(precioPorPersona, fechaInicio, fechaFin);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double taxes(String aeroportName, LocalDate date) {
		// TODO Auto-generated method stub
		return 10;
	}

	
	
	
	public String getNombreAeropuerto() {
		return nombreAeropuerto;
	}

	public void setNombreAeropuerto(String nombreAeropuerto) {
		this.nombreAeropuerto = nombreAeropuerto;
	}

	@Override
	public double calcularPrecioFinal() {
		return this.getPrecioPorPersona() + this.taxes(this.getNombreAeropuerto(), this.getFechaInicio());
	}

}
