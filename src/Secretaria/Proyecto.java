package Secretaria;

import java.time.LocalDate;
import java.util.List;

public class Proyecto extends Actividad {
	private int duracion;
	private List<Empleado> empleados;



	public Proyecto(String nombre, LocalDate fechaInicio, Empleado lider, int duracion, List<Empleado> empleados) {
		super(nombre, fechaInicio, lider);
		this.duracion = duracion;
		this.empleados = empleados;
	}

	@Override
	public Double inversionTotal() {

		return calcularMontoPorDiasDelProyecto() + calcularMontoLider();
	}

	public Double calcularMontoPorDiasDelProyecto() {
		return this.calcularSueldoEmpleados() * this.duracion;
	}

	public Double calcularSueldoEmpleados() {
		return this.empleados.stream().mapToDouble(empleados -> empleados.sueldoDiario()).sum();
	}

	private Double calcularMontoLider() {

		return (this.lider.sueldoDiario() * this.duracion) * 1.3;
	}

}
