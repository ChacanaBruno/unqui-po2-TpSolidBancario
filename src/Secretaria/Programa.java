package Secretaria;

import java.time.LocalDate;
import java.util.List;

public class Programa extends Actividad {
	private List<Actividad> actividades;
	private double costoFijo;

	public Programa(String nombre, LocalDate fechaInicio, Empleado lider, List<Actividad> actividades,
			double costoFijo) {
		super(nombre, fechaInicio, lider);
		this.actividades = actividades;
		this.costoFijo = costoFijo;
		this.fechaInicio = identificarFechaMastemprana();
	}

	public Programa(List<Actividad> actividades2, double costoFijo2) {
		// TODO Auto-generated constructor stub
	}

	private LocalDate identificarFechaMastemprana() {
		return actividades.stream()
				.map(Actividad :: getFechaInicio).
				min(LocalDate::compareTo)
				.orElse(this.fechaInicio);
	}

	@Override
	public Double inversionTotal() {
		// TODO Auto-generated method stub
		return this.actividades.stream().mapToDouble(a -> a.inversionTotal()).sum() + this.costoFijo;
	}

	public void add(Actividad a) {
		actividades.add(a);
	}

	public void remove(Actividad a) {
		actividades.remove(a);
	}

	public List<Actividad> getActividades() {
		return actividades;
	}

	public void setActividades(List<Actividad> actividades) {
		this.actividades = actividades;
	}

	public double getCostoFijo() {
		return costoFijo;
	}

	public void setCostoFijo(double costoFijo) {
		this.costoFijo = costoFijo;
	}

}
