package LoggerExamen;

import java.util.List;

public class Produccion implements Regla {
	private List<Severidad> nivelesDeSeveridad;

	@Override
	public void enviarMensaje(SistemaEscucha s, String msg, Severidad severidad) {
		if (nivelesDeSeveridad.contains(severidad)) {
			s.getMonitor().printSreen(msg, IMonitor.RED);
		}

	}

	public void agregarNivelDeSeveridad(Severidad severidad) {

		nivelesDeSeveridad.add(severidad);
	}

	public void eliminarNivelDeSeveridad(Severidad severidad) {

		nivelesDeSeveridad.remove(severidad);
	}

	public List<Severidad> getNivelesDeSeveridad() {
		return nivelesDeSeveridad;
	}

	public void setNivelesDeSeveridad(List<Severidad> nivelesDeSeveridad) {
		this.nivelesDeSeveridad = nivelesDeSeveridad;
	}

}
