package TarjetaYBancoExamen;


//Segun patron State: Estado Concreto
public class Activa extends EstadoT {

    public Activa(TarjetaDeCredito tarjeta) {
        super(tarjeta); // Inicializa la tarjeta en el estado actual
    }

    @Override
    public void realizarCompra(Compra compra) {
        if (tarjeta.getCompras().size() < tarjeta.getMaxCompra()) {
            tarjeta.getCompras().add(compra);
        }
    }

    @Override
    public void pausar() {
        tarjeta.setEstadoActual(new Pausada(tarjeta)); // Cambia al estado pausado
    }
}
