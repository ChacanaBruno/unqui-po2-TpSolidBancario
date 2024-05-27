package ar.edu.unq.p2.ExamenAgenciaDeViajes;

import java.time.LocalDate;

public abstract class Producto implements Calculable {
	protected double precioPorPersona;
	protected double precioImpuesto;
	protected LocalDate fechaInicio;
	protected LocalDate fechaFin;
	
	public Producto() {
		
	}
	public Producto(double precioPorPersona, double precioImpuesto, LocalDate fechaInicio, LocalDate fechaFin) {
		super();
		this.precioPorPersona = precioPorPersona;
		this.precioImpuesto = precioImpuesto;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}
	public double getPrecioPorPersona() {
		return precioPorPersona;
	}
	public void setPrecioPorPersona(double precioPorPersona) {
		this.precioPorPersona = precioPorPersona;
	}
	public double getPrecioImpuesto() {
		return precioImpuesto;
	}
	public void setPrecioImpuesto(double precioImpuesto) {
		this.precioImpuesto = precioImpuesto;
	}
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public LocalDate getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	
	
	
	
	
	
}
