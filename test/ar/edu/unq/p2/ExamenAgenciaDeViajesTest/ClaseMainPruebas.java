package ar.edu.unq.p2.ExamenAgenciaDeViajesTest;

import java.time.LocalDate;

import ar.edu.unq.p2.ExamenAgenciaDeViajes.Excursion;

public class ClaseMainPruebas {

	public static void main(String[] args) {
		LocalDate fechaInicio = LocalDate.of(2023, 5, 27);
		LocalDate fechaFin = LocalDate.of(2023, 5, 30);
		Excursion excursionTest = new Excursion(100.00, 10.00, fechaInicio, fechaFin);

		double montoAEvaluar = excursionTest.calcularPrecioFinal();
		double montoEsperado = 110.00;
		double delta = 0.01;

		if (Math.abs(montoAEvaluar - montoEsperado) < delta) {
			System.out.println("Test passed: El monto calculado (" + montoAEvaluar + ") es igual al monto esperado ("
					+ montoEsperado + ")");
		} else {
			System.out.println("Test failed: El monto calculado (" + montoAEvaluar + ") no es igual al monto esperado ("
					+ montoEsperado + ")");
		}
	}

}
