package videojuegoState;

public class SinMoneda extends Estado {

	@Override
	public void ejecutar() {
		System.out.println("Ingrese una moneda");

	}

	@Override
	public void terminar() {
		System.out.println("El juego no a comenzado.");

	}

	@Override
	void nuevaFicha() {
		m.setEstado(new UnaMoneda());
	
	}

}
