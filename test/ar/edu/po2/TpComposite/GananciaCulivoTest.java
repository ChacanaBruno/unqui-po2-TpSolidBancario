package ar.edu.po2.TpComposite;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GananciaCulivoTest {

	Parcela parcelaTest;

	Trigo trigoMock;
	Soja sojaMock;
	List<Gananciable> spyListaDeGananciaCulivo;

	@BeforeEach
	public void setUp() {
		// Creamos el mock de Estacionamiento
		trigoMock = mock(Trigo.class);
		sojaMock = mock(Soja.class);

		spyListaDeGananciaCulivo = spy(new ArrayList<Gananciable>());

		parcelaTest = new Parcela(spyListaDeGananciaCulivo);

	}

	@Test
	void testUnaParcelaIndicaSuGanancia() {
		fail("Not yet implemented");
	}

}
