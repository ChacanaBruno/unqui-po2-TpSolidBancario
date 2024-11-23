package DeportesObserverAgus;

import java.util.List;

public class Suscripcion {
	private List<Observador> observadores; // Uno o varios observadores
	private List<String> contrincantes;
	private List<String> deportes;

	public Suscripcion(List<Observador> observadores, List<String> contrincantes, List<String> deportes) {
		super();
		this.observadores = observadores;
		this.contrincantes = contrincantes;
		this.deportes = deportes;
	}
	public boolean coincideCon(Partido partido) {
		return deportes.contains(partido.getDeporte()) || partido.getContrincantes().stream().anyMatch(contrincantes::contains);
	}

	public void notificar(Partido partido) {
		for (Observador observador : observadores) {
			observador.update(partido);
		}
	}
}
