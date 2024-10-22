package TarjetaYBancoExamen;


//Segun patron State: Estado Concreto
public class Inactiva extends EstadoT {
    private MailSender envioDeEmails;

    public Inactiva(TarjetaDeCredito tarjeta, MailSender envioDeEmails) {
        super(tarjeta); // Inicializa la tarjeta en el estado actual
        this.envioDeEmails = envioDeEmails;
    }

    @Override
    public void activar() {
        tarjeta.setEstadoActual(new Activa(tarjeta)); // Cambia al estado activo
    }

    @Override
    public void realizarCompra(Compra compra) {
        envioDeEmails.sendMail(tarjeta.getEmail(), tarjeta.getTitular(),
            "Alguien intentó usar su tarjeta. Si fue Ud., primero debe activarla.");
    }
}