package DeportesObserverAgus;

import java.util.ArrayList;
import java.util.List;

public class ServidorResultados { // Sujeto
	private List<Suscripcion> suscripciones = new ArrayList<>();

	public void agregarSuscripcion(Suscripcion suscripcion) {
		suscripciones.add(suscripcion);
	}

	public void eliminarSuscripcion(Suscripcion suscripcion) {
		suscripciones.remove(suscripcion);
	}

	public void agregarPartido(Partido partido) { // notificar
		for (Suscripcion suscripcion : suscripciones) {

			suscripcion.notificar(partido);
		}
	}
}
