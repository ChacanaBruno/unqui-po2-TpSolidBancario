package observerDeportes;

import java.util.ArrayList;
import java.util.List;

import DeportesObserverAgus.Partido;

// Encuentros deportivos
public class App implements Sujeto { // Sujeto simple
	// private EventManager suscripciones = new EventManager();
	private Sujeto manager;

	public void notificarEncuentroDeportivo(Partido p) {
		// Crear una nueva lista para los intereses
		// List<String> intereses = new ArrayList<>(p.getContrincantes()); // Copiar los
		// contrincantes

		// intereses.add(p.getDeporte()); // Agregar el deporte a la lista

		// manager.notify(intereses, p.getResultado());

		manager.notify(p.getDeporte(), p.getResultado());
		manager.notify(p.getContrincantes(), p.getResultado());

	}

	public void add(String eventType, intereados i) { // cualquier servidor o appBo
		manager.add(eventType, i);
	}

	public void remove(String eventType, intereados i) {
		manager.remove(eventType, i);
	}

	/**
	 * public void notificarEncuentroDeportivo(Partido p) { // Notificar a los
	 * equipos contrincantes notificarContrincantesDe(p.getContrincantes(), p);
	 * 
	 * // Notificar sobre el deporte notificarDeporteDe(p.getDeporte(), p); /
	 * 
	 * public void notificarContrincantesDe(List<String> equipos, Partido p) { if
	 * (equipos == null) return; // Manejar lista nula
	 * 
	 * for (String equipo : equipos) { suscripciones.notify(equipo, "Nuevo partido:
	 * " + p); } }
	 * 
	 * public void notificarDeporteDe(String deporte, Partido p) { if (deporte ==
	 * null || deporte.isEmpty()) return;
	 * 
	 * suscripciones.notify(deporte, "Nuevo partido de " + deporte + ": " + p); }
	 */
}
