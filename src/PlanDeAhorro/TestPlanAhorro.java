package PlanDeAhorro;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPlanAhorro {

    private PlanAhorro plan;
    private Cliente c;
    private Retribucion a;

    @BeforeEach
    public void setUp() {
        // Inicialización de objetos antes de cada prueba
        c = new Cliente();  // Asegúrate de inicializar correctamente tu Cliente
        a = new Auto();  // Asegúrate de inicializar correctamente tu Retribucion
        plan = new PlanAhorro(c, "marca", "modelo", 3, a);
    }

    @Test
    public void testPagarCuota() {
        plan.pagarCuota();  // Ejecutar acción a probar

        assertEquals(2, plan.getCuotas());  // Verificar resultado esperado
    }
    //
}
