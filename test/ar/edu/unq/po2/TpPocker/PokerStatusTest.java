package ar.edu.unq.po2.TpPocker;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.*;

class PokerStatusTest {

	private PokerStatus pokerAppTest;

	/**
	 * Método de configuración que se ejecuta antes de cada prueba. Inicializa la
	 * instancia de PokerStatus que se utilizará en todos los tests.
	 */
	@BeforeEach
	public void setUp() {
		pokerAppTest = new PokerStatus();
	}

	/**
	 * Método auxiliar para crear y configurar un objeto Carta simulado.
	 * 
	 * @param valor el valor de la carta a simular.
	 * @param palo  el palo de la carta a simular.
	 * @return un objeto Carta simulado con los valores especificados.
	 */
	private Carta mockCarta(int valor, String palo) {
		Carta carta = mock(Carta.class);
		when(carta.getValor()).thenReturn(valor); // Simula el método getValor() para retornar el valor especificado.
		when(carta.getPalo()).thenReturn(palo); // Simula el método getPalo() para retornar el palo especificado.
		return carta;
	}

	/**
	 * Test para verificar si la función identifica correctamente un "Poquer".
	 * Utiliza cartas simuladas para forzar la condición de un "Poquer".
	 */
	@Test
	void verificarSiHayPokerTest() {
		Carta carta1 = mockCarta(1, "D");
		Carta carta2 = mockCarta(1, "P");
		Carta carta3 = mockCarta(1, "F");
		Carta carta4 = mockCarta(1, "Q");
		Carta carta5 = mockCarta(3, "J");

		// Comprueba que el método verificar retorna "Poquer" cuando debería.
		assertEquals("Poquer", pokerAppTest.verificar(carta1, carta2, carta3, carta4, carta5),
				"No está retornando póquer");
	}

	/**
	 * Test para verificar si la función identifica correctamente un "Trio". Utiliza
	 * cartas simuladas para forzar la condición de un "Trio".
	 */
	@Test
	void verificarSiHayTrioTest() {
		Carta carta1 = mockCarta(3, "J");
		Carta carta2 = mockCarta(1, "J");
		Carta carta3 = mockCarta(3, "D");
		Carta carta4 = mockCarta(7, "J");
		Carta carta5 = mockCarta(3, "C");

		// Comprueba que el método verificar retorna "Trio" cuando debería.
		assertEquals("Trio", pokerAppTest.verificar(carta1, carta2, carta3, carta4, carta5), "No está retornando Trio");
	}

	/**
	 * Test para verificar si la función identifica correctamente un "Color".
	 * Utiliza cartas simuladas para forzar la condición de un "Color".
	 */
	@Test
	void verificarSiHayColorTest() {
		Carta carta1 = mockCarta(3, "J");
		Carta carta2 = mockCarta(1, "J");
		Carta carta3 = mockCarta(3, "J");
		Carta carta4 = mockCarta(7, "J");
		Carta carta5 = mockCarta(3, "J");

		// Comprueba que el método verificar retorna "Color" cuando debería.
		assertEquals("Color", pokerAppTest.verificar(carta1, carta2, carta3, carta4, carta5),
				"No está retornando Color");
	}

	@Test
	void unaCartaSabeIdentificarSuValor() {
		Carta cartaDePrueba = new Carta(1, "Q");
		assertEquals(1, cartaDePrueba.getValor());

	}

	@Test
	void unaCartaSabeIdentificarSuPalo() {
		Carta cartaDePrueba = new Carta(1, "Q");
		assertEquals("Q", cartaDePrueba.getPalo());

	}
}
