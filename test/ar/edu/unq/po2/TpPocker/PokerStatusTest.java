package ar.edu.unq.po2.TpPocker;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PokerStatusTest {

	private PokerStatus pokerAppTest;
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;

	@BeforeEach
	public void setUp() {
		pokerAppTest = new PokerStatus();
	}

	@Test
	void verificarSiNoHayNadaTest() {
		carta1 = new Carta(3, "H");
		carta2 = new Carta(1, "Q");
		carta3 = new Carta(1, "2J");
		carta4 = new Carta(7, "J");
		carta5 = new Carta(3, "J");

		assertEquals("Nada", pokerAppTest.verificar(carta1, carta2, carta3, carta4, carta5), "Retorno algo con valor");
	}

	@Test
	void verificarSiHayPokerTest() {
		carta1 = new Carta(1, "D");
		carta2 = new Carta(1, "P");
		carta3 = new Carta(1, "F");
		carta4 = new Carta(1, "Q");
		carta5 = new Carta(3, "J");
		// Verificar que hay póquer y retorna "Poquer"
		assertEquals("Poquer", pokerAppTest.verificar(carta1, carta2, carta3, carta4, carta5),
				"No esta retornando póquer");

	}

	@Test
	void verificarSiHayTrioTest() {
		carta1 = new Carta(3, "J");
		carta2 = new Carta(1, "J");
		carta3 = new Carta(3, "D");
		carta4 = new Carta(7, "J");
		carta5 = new Carta(3, "C");
		assertEquals("Trio", pokerAppTest.verificar(carta1, carta2, carta3, carta4, carta5), "No esta retornando Trio");
	}

	@Test
	void verificarSiHayColorTest() {
		carta1 = new Carta(3, "J");
		carta2 = new Carta(1, "J");
		carta3 = new Carta(3, "J");
		carta4 = new Carta(7, "J");
		carta5 = new Carta(3, "J");
		assertEquals("Color", pokerAppTest.verificar(carta1, carta2, carta3, carta4, carta5),
				"No esta retornando Color");
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
