package tpComposite;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class testCultivo {

	@Test
	public void testCalcularMontoDePorcionesConPorcionesPuras() {
		// Crear porciones puras
		Soja soja = new Soja("soja", 1200);
		Trigo trigo = new Trigo("trigo", 2000);

		// Crear el sistema con estas porciones
		Sistema sistema = new Sistema(Arrays.asList(soja, trigo));

		// Verificar la ganancia total
		assertEquals(3200, sistema.calcularMontoDePorciones(), 0.01);
	}

	@Test
	public void testCalcularMontoDePorcionesConPorcionMixta() {
		// Crear porciones puras
		Soja soja = new Soja("soja", 1200);
		Trigo trigo = new Trigo("trigo", 2000);
		Soja soja2 = new Soja("soja", 1200);
		Trigo trigo2 = new Trigo("trigo", 2000);
		// Crear una porción mixta
		Porcion mixta = new PorcionMixta(Arrays.asList(soja, trigo, soja2, trigo2));

		// Crear el sistema con la porción mixta
		Sistema sistema = new Sistema(Arrays.asList(mixta));

		// Verificar la ganancia total
		assertEquals(1.700, sistema.calcularMontoDePorciones(), 0.01); // (500 + 300 + 500 + 300) / 4
	}
	/*
	 * @Test public void testCalcularMontoDePorcionesConPorcionesMixtasYCombinadas()
	 * { // Crear porciones puras Porcion soja = new PorcionPura("soja"); Porcion
	 * trigo = new PorcionPura("trigo");
	 * 
	 * // Crear una porción mixta Porcion mixta1 = new
	 * PorcionMixta(Arrays.asList(soja, trigo, soja, trigo));
	 * 
	 * // Crear otra porción mixta que contiene la primera mixta y más porciones
	 * puras Porcion mixta2 = new PorcionMixta(Arrays.asList(mixta1, soja, trigo,
	 * soja));
	 * 
	 * // Crear el sistema con esta configuración Sistema sistema = new
	 * Sistema(Arrays.asList(mixta2));
	 * 
	 * // Verificar la ganancia total assertEquals(400,
	 * sistema.calcularMontoDePorciones(), 0.01); }
	 */
}
