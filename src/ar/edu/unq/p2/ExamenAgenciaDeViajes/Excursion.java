package ar.edu.unq.p2.ExamenAgenciaDeViajes;

import java.time.LocalDate;

public class Excursion extends Producto {

	public Excursion() {
		super();
	}

	public Excursion(double precioPorPersona, double precioImpuesto, LocalDate fechaInicio, LocalDate fechaFin) {
		super(precioPorPersona, precioImpuesto, fechaInicio, fechaFin);
	}

	@Override
	public double calcularPrecioFinal() {
		// TODO Auto-generated method stub
		return precioPorPersona + precioImpuesto;
	}

}
