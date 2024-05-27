package ar.edu.unq.p2.ExamenAgenciaDeViajesTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.p2.ExamenAgenciaDeViajes.Excursion;

class ExcursionTest {
	
	private Excursion excursionTest;
	private LocalDate fechaInicio = LocalDate.of(2023, 5, 27);
	private LocalDate fechaFin = LocalDate.of(2023, 5, 30);
	
	
	@BeforeEach
	public void setUp() {
		excursionTest = new Excursion(100.00, 10.00, fechaInicio, fechaFin);
	}
	
	@Test
	void testCalcularPrecioFinal() {
		double montoAEvaluar = excursionTest.calcularPrecioFinal();
		double montoEsperado = 110.00;
		double delta = 0.01;

		if (Math.abs(montoAEvaluar - montoEsperado) < delta) {
			System.out.println("Test passed: El monto calculado (" + montoAEvaluar + ") es igual al monto esperado (" + montoEsperado + ")");
		} else {
			System.out.println("Test failed: El monto calculado (" + montoAEvaluar + ") no es igual al monto esperado (" + montoEsperado + ")");
		}
	}
}