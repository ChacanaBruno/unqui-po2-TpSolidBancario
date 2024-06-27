package LoggerExamen;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LoggerTest {
	private Logger loggerSUT;
	private SistemaEscucha s1;
	List<Sistema> sistemaDeEscucha = new ArrayList<Sistema>();
	@BeforeEach
	public void setUp() {
		loggerSUT = new Logger(sistemaDeEscucha);
		s1 = mock(SistemaEscucha.class);
	}
	@Test
	void test() {
		loggerSUT.add(s1);
		loggerSUT.enviarMensaje("new mensaje", Severidad.DEBUG);
		
		assertEquals(loggerSUT.getSistemaDeEscucha().size(),1);
		verify(s1, times(1)).notificacion("new mensaje", Severidad.DEBUG);
	}
}
