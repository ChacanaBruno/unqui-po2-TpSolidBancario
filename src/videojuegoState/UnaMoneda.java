package videojuegoState;

public class UnaMoneda extends Estado {

	@Override
	public void ejecutar() {
		System.out.println("Juego iniciado en solitario");

	}

	@Override
	void nuevaFicha() {
		m.setEstado(new DosMonedas());

	}

}
