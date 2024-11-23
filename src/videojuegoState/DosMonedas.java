package videojuegoState;

public class DosMonedas extends Estado {

	@Override
	public void ejecutar() {
		System.out.println("Juego iniciado en dos jugadores");

	}

	@Override
	void nuevaFicha() {
		System.out.println("Se llego al maximo de fichas, para reinicar terminar juego");
		
	}

}
