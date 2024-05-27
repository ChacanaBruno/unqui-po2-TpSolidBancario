package ar.edu.unq.p2.ExamenAgenciaDeViajes;

import java.time.LocalDate;

public class Pasaje implements IOperation {
	protected String nombreAeropuerto;

	public Pasaje(String nombreAeropuerto) {
		super();
		this.nombreAeropuerto = nombreAeropuerto;
	}

	public String getNombreAeropuerto() {
		return nombreAeropuerto;
	}

	public void setNombreAeropuerto(String nombreAeropuerto) {
		this.nombreAeropuerto = nombreAeropuerto;
	}

	@Override
	public double taxes(String aeroportName, LocalDate date) {
		// TODO Auto-generated method stub
		return 10;
	}

}
