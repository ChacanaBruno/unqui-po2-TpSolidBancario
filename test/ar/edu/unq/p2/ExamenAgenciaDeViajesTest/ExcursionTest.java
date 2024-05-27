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
        assertEquals(110.00, montoAEvaluar, 0.01); // Se añade un delta para precisión
    }
}
