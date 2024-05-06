package ar.edu.unq.po2.TpPocker;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class PokerStatusTest {

	//Declaracion de variables
	private PokerStatus pokerAppTest;
	
	// creacion del tipo de objeto.
	@BeforeEach
    public void setUp() {
		pokerAppTest = new PokerStatus();
	}
	
	
	@Test
	void verificarSiHayPokerTest() {
		//figura de la carta (P = picas, C = corazones, D = diamantes, T = tréboles
		assertFalse(pokerAppTest.verificar("1D", "2D","3D","4D","5Q"), "no hay poker");
		assertTrue(pokerAppTest.verificar("1D", "1P","4D","1Q","1C"), "no hay poker");
		assertFalse(pokerAppTest.verificar("10D", "QD","4D","1Q","1C"), "no hay poker");
	}
}
