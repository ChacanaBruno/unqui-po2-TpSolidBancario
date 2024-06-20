package enumsYstreams;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LesionsDermatologicTest {
	
    @Test
    public void theNextColourOfRedIsGrey() {
    	LesionsDermatologic colorRed = LesionsDermatologic.RED;
    	LesionsDermatologic expectedNextColor = LesionsDermatologic.GREY;
        
    	LesionsDermatologic actualNextColor = colorRed.getNextColour();
        
        assertEquals(expectedNextColor, actualNextColor);
    }
}