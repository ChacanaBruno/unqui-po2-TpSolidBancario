package ar.edu.unq.po2.TpSolidBancario;

/**
 * Solicitud de crédito personal que evalúa si un cliente cumple con los requisitos para este tipo de crédito.
 */
public class SolicitudCreditoPersonal extends SolicitudCredito {

    public SolicitudCreditoPersonal(Cliente cliente, double monto, int plazo) {
        super(cliente, monto, plazo);
    }

    @Override
    public boolean esAceptable() {
        double cuotaMensual = montoSolicitado / plazo;
        return cliente.getSueldoAnual() >= 15000 && cuotaMensual <= cliente.getSueldoMensual() * 0.7; //ESTO DEBERIA SER UN METODO
    }
}