package ar.edu.unq.p2.ExamenAgenciaDeViajes;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PasajeTest {

	private Pasaje pasajeTest;
	private LocalDate fechaInicio = LocalDate.of(2023, 5, 27);
	private LocalDate fechaFin = LocalDate.of(2023, 5, 30);

	@BeforeEach
	public void setUp() {
		pasajeTest = new Pasaje(100.00, fechaInicio, fechaFin);
	}

	@Test
	void testCalcularPrecioFinal() {
		double precioPorPersona = pasajeTest.getPrecioPorPersona();
		double precioPorImpuesto = pasajeTest.taxes(pasajeTest.getNombreAeropuerto(), pasajeTest.getFechaInicio());
		double montoEsperado = precioPorPersona + precioPorImpuesto;
		assertEquals(montoEsperado, pasajeTest.calcularPrecioFinal(), 0.01); // Se añade un delta para precisión
	}

}
