package Secretaria;

import java.time.LocalDate;

public abstract class Actividad {
	protected String nombre;
	protected LocalDate fechaInicio;
	protected Empleado lider;
	
	
	
	public abstract Double inversionTotal();
}
