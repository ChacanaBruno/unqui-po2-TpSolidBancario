package DeportesObserverAgus;

import java.util.List;

public class Suscripcion {
	private Observador observador; 
	private List<String> contrincantes;
	private List<String> deportes;

	public Suscripcion(Observador observador, List<String> contrincantes, List<String> deportes) {
		super();
		this.observador = observador;
		this.contrincantes = contrincantes;
		this.deportes = deportes;
	}

	public boolean coincideCon(Partido partido) {
		return deportes.contains(partido.getDeporte())
				|| partido.getContrincantes().stream().anyMatch(contrincantes::contains);
	}

	public void notificar(Partido partido) {
		if (this.coincideCon(partido)) {

			observador.update(partido);
		}
	}
}
