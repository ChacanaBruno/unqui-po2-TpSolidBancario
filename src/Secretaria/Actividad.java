package Secretaria;

import java.time.LocalDate;

public abstract class Actividad {
	protected String nombre;
	protected LocalDate fechaInicio;
	protected Empleado lider;

	public Actividad(String nombre, LocalDate fechaInicio, Empleado lider) {
		super();
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.lider = lider;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Empleado getLider() {
		return lider;
	}

	public void setLider(Empleado lider) {
		this.lider = lider;
	}

	public abstract Double inversionTotal();
}
