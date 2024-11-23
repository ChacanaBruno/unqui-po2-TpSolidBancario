package DeportesObserverAgus;

import java.util.List;

public class Servidor implements Observador {
	private List<Partido> partidos;

	@Override
	public void update(Partido partido) {
		partidos.add(partido);

	}

}
