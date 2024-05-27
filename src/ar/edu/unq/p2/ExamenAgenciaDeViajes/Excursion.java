package ar.edu.unq.p2.ExamenAgenciaDeViajes;

import java.time.LocalDate;

public class Excursion extends Producto {
    protected double precioImpuesto;

    public Excursion(double precioPorPersona, double precioImpuesto, LocalDate fechaInicio, LocalDate fechaFin) {
        super(precioPorPersona, fechaInicio, fechaFin);
        this.precioImpuesto = precioImpuesto;
    }

    public double getPrecioImpuesto() {
        return precioImpuesto;
    }

    public void setPrecioImpuesto(double precioImpuesto) {
        this.precioImpuesto = precioImpuesto;
    }

    @Override
    public double calcularPrecioFinal() {
        return this.getPrecioPorPersona() + getPrecioImpuesto();
    }
}
