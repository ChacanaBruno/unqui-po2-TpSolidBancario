package ar.edu.unq.po2.TpPocker;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PokerStatusTest {

    private PokerStatus pokerAppTest;
    
    @BeforeEach
    public void setUp() {
        pokerAppTest = new PokerStatus();
    }
    
    @Test
    void verificarSiNoHayNadaTest() {
    	 assertEquals("Nada", pokerAppTest.verificar("3H", "1Q", "2J", "7J", "3J"), "No esta retornando Color");
    }
    @Test
    void verificarSiHayPokerTest() {
 
        // Verificar que hay póquer y retorna "Poquer"
        assertEquals("Poquer", pokerAppTest.verificar("1D", "1P", "1D", "1Q", "2C"), "No esta retornando póquer");

    }
    @Test
    void verificarSiHayTrioTest() {
    	 assertEquals("Trio", pokerAppTest.verificar("3J", "1J", "3D", "7J", "3C"), "No esta retornando Trio");
    }
    
    @Test
    void verificarSiHayColorTest() {
    	 assertEquals("Color", pokerAppTest.verificar("3J", "1J", "2J", "7J", "3J"), "No esta retornando Color");
    }
}
