package ar.edu.po2.TpComposite;

import java.util.List;

public class Parcela implements Gananciable {
	private List<Gananciable> cultivos;

	public Parcela(List<Gananciable> cultivosGanancia) {
		super();
		this.cultivos = cultivosGanancia;
	}

	public double calcularGanancia() {

		double gananciaPorParcela = 0;

		for (Gananciable cultivo : cultivos) {
			gananciaPorParcela += cultivo.calcularGanancia();
		}
		return gananciaPorParcela;
	}

}
