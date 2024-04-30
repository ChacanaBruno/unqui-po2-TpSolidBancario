package ar.edu.unq.po2.TpSolidBancario;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SumaTest {
    @Test
    public void testSumar() {
        Suma suma = new Suma();
        assertEquals(5, suma.sumar(2, 3)); // Esperamos que 2 + 3 sea igual a 5
    }
}