package ar.edu.unq.po2.TpSolidBancario;

/**
 * Clase abstracta que representa una solicitud de crédito.
 * Implementa la interfaz Verificable para asegurar que todas las solicitudes puedan ser evaluadas.
 */
public abstract class SolicitudCredito implements Verificable {
    protected Cliente cliente;
    protected double montoSolicitado;
    protected int plazo;

    public SolicitudCredito(Cliente cliente, double montoSolicitado, int plazo) {
        this.cliente = cliente;
        this.montoSolicitado = montoSolicitado;
        this.plazo = plazo;
    }

    public Cliente getCliente() {
        return cliente;
    }
}