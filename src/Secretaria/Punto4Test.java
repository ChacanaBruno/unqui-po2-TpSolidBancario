package Secretaria;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;

public class Punto4Test {
	Proyecto ConexionARed;
	Proyecto ConstruccionPozoExtraccion;
	Programa MasExtraccion;
	Proyecto AmpliacionRed;
	Programa MasAguaPotable;
	List<EmpleadoTest> empleados;
	List<Actividad> actividadesMaxExtraccion;
	List<Actividad> actividadesMasAguaPotable;
	@BeforeEach
	public void setUp() {
		LocalDate fechaInicio = LocalDate.of(2023, 6, 25);
		EmpleadoTest empleado1 = new EmpleadoTest();
		EmpleadoTest empleado2 = new EmpleadoTest();
		empleados.add(empleado2);
		empleados.add(empleado1);
		
		double costoFijo = 150.00;
		
		ConexionARed = new Proyecto(fechaInicio,empleados);
		
		ConstruccionPozoExtraccion = new Proyecto(fechaInicio,empleados);

		AmpliacionRed = new Proyecto(fechaInicio,empleados);
		
		actividadesMaxExtraccion.add(ConexionARed);
		actividadesMaxExtraccion.add(ConstruccionPozoExtraccion);
		
		MasExtraccion = new Programa(actividadesMaxExtraccion, costoFijo);
		
		actividadesMasAguaPotable.add(AmpliacionRed);
		MasAguaPotable = new Programa(actividadesMasAguaPotable, costoFijo);
}

