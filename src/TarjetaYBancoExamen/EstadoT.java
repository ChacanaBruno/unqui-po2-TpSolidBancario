package TarjetaYBancoExamen;


//Segun patron State: Estado
public abstract class EstadoT {
    protected TarjetaDeCredito tarjeta; // Referencia a la tarjeta de crédito asociada

    public EstadoT(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
    }

    // Métodos con implementación predeterminada o vacía
    public void activar() {
        // Implementación vacía o predeterminada, si se necesita.
    }

    public void pausar() {
        // Implementación vacía o predeterminada, si se necesita.
    }

    // Método abstracto que debe ser implementado por los estados concretos
    public abstract void realizarCompra(Compra compra);
}
