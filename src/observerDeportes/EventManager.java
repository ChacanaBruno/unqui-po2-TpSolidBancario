package observerDeportes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager implements Sujeto { // Sujeto
	// Map que asocia tipos de eventos con listas de listeners
	private Map<String, List<intereados>> listeners = new HashMap<>();

	// Método para suscribirse a un evento
	public void add(String eventType, intereados listener) {
		listeners.putIfAbsent(eventType, new ArrayList<intereados>());
		/*
		 * "listeners.putIfAbsent" verifica si existe ya una lista asociada al tipo de
		 * evento (eventType) en el map listeners. Si no existe, agrega una nueva lista
		 * vacía asociada a ese evento. Básicamente, garantiza que cada tipo de evento
		 * tenga su propia lista de interesados.
		 * 
		 * Si el evento ya existe en el mapa listeners (es decir, si ya hay una entrada
		 * para ese eventType), la llamada a putIfAbsent no hace nada. No sobrescribe la
		 * lista existente ni modifica su contenido. Simplemente conserva la lista de
		 * interesados que ya estaba asociada a ese tipo de evento.
		 * 
		 */
		listeners.get(eventType).add(listener); // agrega al listener
	}

	// Método para desuscribirse de un evento
	public void remove(String eventType, intereados listener) {
		List<intereados> users = listeners.get(eventType);
		if (users != null) {
			users.remove(listener);
		}
	}

	public void notify(List<String> intereses, String resultado) {
		for (String interes : intereses) { // se notifica por cada equipo
			this.notify(interes, resultado);
		}
	}

	// Método para notificar a todos los listeners de un evento
	public void notify(String eventType, String resultado) { // sobrecarga de metodo.
		List<intereados> users = listeners.get(eventType);
		if (users != null) {
			for (intereados listener : users) {
				listener.update(resultado);
			}
		}
	}

}
