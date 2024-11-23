package tpComposite;

import java.util.List;

public class Sistema {
	private List<Porcion> porciones;

	public double calcularMontoDePorciones() {
		return porciones.stream().mapToDouble(Porcion::ganancia).sum();
	}
}
