package tpComposite;

import java.util.List;

public class PorcionMixta implements Porcion {
	private List<Porcion> porciones;

	@Override
	public double ganancia() {
		return porciones.stream().mapToDouble(Porcion::ganancia).sum();
	}

	public void add(Porcion p) {
		if (porciones.size() < 4)
			porciones.add(p);
	}

	public void remove(Porcion p) {
		porciones.remove(p);
	}
}
