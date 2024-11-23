package videojuegoState;

public class Maquina {
	private Estado estado;

	private void iniciar() {
		estado.ejecutar();
	}

	public void terminarJuego() {
		this.estado.terminar();
	}
	public void ingresarMoneda() {
		this.estado.nuevaFicha();
	}
	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

}
