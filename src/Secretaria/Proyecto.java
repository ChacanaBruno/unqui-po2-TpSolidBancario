package Secretaria;

import java.util.List;

public class Proyecto extends Actividad {
	private int duracion;
	private List<Empleado> empleados;

	public Proyecto(int duracion, List<Empleado> empleados) {
		super();
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
