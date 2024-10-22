package TarjetaYBancoExamen;

import java.util.List;

public class TarjetaDeCredito { // Segun patron State: Contexto
	private String numero;
	private String titular;
	private String email;
	private Banco banco;
	private List<Compra> compras;
	private Integer maxCompra;
	private EstadoT estadoActual; // Estado actual de la tarjeta

	public TarjetaDeCredito(String numero, String titular, String email, Banco banco, List<Compra> compras,
			Integer maxCompra, EstadoT estadoInicial) {
		this.numero = numero;
		this.titular = titular;
		this.email = email;
		this.banco = banco;
		this.compras = compras;
		this.maxCompra = maxCompra;
		this.estadoActual = estadoInicial;
	}

    public void realizarCompra(Compra compra) { // puede que se tenga que pasar los arguemtnos de compra para recien ahi crear la compra dentro del metodo
        estadoActual.realizarCompra(compra); // El estado actual decide cómo manejar la compra
    }

	public void reset() {
		this.setMaxCompra(0); // resetea el contador de compras al llegar al final del mes
	}

	public void activar() {
        estadoActual.activar(); // El estado actual decide cómo activar la tarjeta
    }

    public void pausar() {
        estadoActual.pausar(); // El estado actual decide cómo pausar la tarjeta
    }

	public EstadoT getEstadoActual() {
		return estadoActual;
	}

	public void setEstadoActual(EstadoT estadoActual) {
		this.estadoActual = estadoActual;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public List<Compra> getCompras() {
		return compras;
	}

	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}

	public Integer getMaxCompra() {
		return maxCompra;
	}

	public void setMaxCompra(Integer maxCompra) {
		this.maxCompra = maxCompra;
	}

}