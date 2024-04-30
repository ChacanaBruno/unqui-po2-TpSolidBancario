package ar.edu.unq.po2.TpSolidBancario;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList; // Importar ArrayList para inicializar listas
import java.util.List;

public class BancoTest {
    protected Banco banco;
    protected Cliente cliente;
    protected List<Cliente> clientesDelBanco; // Lista de clientes
    protected List<Verificable> solicitudesPenditeVerificaicon; // Lista de verificables

    @BeforeEach
    public void setUp() {
        clientesDelBanco = new ArrayList<>(); // Inicializar como lista vacía
        solicitudesPenditeVerificaicon = new ArrayList<>(); // Inicializar como lista vacía

        banco = new Banco(clientesDelBanco, solicitudesPenditeVerificaicon);
        cliente = new Cliente("Diego", "Maradona", "Fiorito", 50, 1.0, 12.0);
    }

    @Test
    public void testCuandoUnBancoNuevoRegistraAUnClienteLaCantidadDeRegistradoEsUno() {
        banco.agregarCliente(cliente); // Ejercicio de la funcionalidad
        assertEquals(1, banco.getClientesDelBanco().size(), "La cantidad de clientes debería ser 1"); // Usar getter si es privado
    }
}

