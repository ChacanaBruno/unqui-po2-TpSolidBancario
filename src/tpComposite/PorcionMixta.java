package tpComposite;

import java.util.List;

public class PorcionMixta implements Porcion {
	private List<Porcion> porciones;

	public PorcionMixta(List<Porcion> subPorciones) {
		if (subPorciones.size() != 4) {
			throw new IllegalArgumentException("Una porción mixta debe tener exactamente 4 sub-porciones");
		}
		this.porciones = subPorciones;
	}

	@Override
	public double ganancia() {
		if (porciones.isEmpty()) {
			return 0;
		} else {

			int gananciaTotal = 0;
			for (Porcion porcion : porciones) {
				gananciaTotal += porcion.ganancia();
			}
			return gananciaTotal / porciones.size(); // Dividir la ganancia total entre el número de subdivisiones
		}
	}
}