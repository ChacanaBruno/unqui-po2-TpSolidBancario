package ar.edu.unq.po2.TpSolidBancario;

/**
 * Solicitud de crédito hipotecario que evalúa criterios específicos para este tipo de crédito, incluyendo propiedades como garantía.
 */
public class SolicitudCreditoHipotecario extends SolicitudCredito {
    private Propiedad propiedad;

    public SolicitudCreditoHipotecario(Cliente cliente, double monto, int plazo, Propiedad propiedad) {
        super(cliente, monto, plazo);
        this.propiedad = propiedad;
    }

    @Override
    public boolean esAceptable() {
        double cuotaMensual = montoSolicitado / plazo;
        return cuotaMensual <= cliente.getSueldoMensual() * 0.5
            && montoSolicitado <= propiedad.getValorFiscal() * 0.7
            && cliente.getEdad() + (plazo / 12) <= 65;
    }
}
