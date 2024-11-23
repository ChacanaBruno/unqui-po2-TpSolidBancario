package tpComposite;

import java.util.List;

public class Sistema {
	private List<Porcion> porciones;

	public Sistema(List<Porcion> porciones) {
		super();
		this.porciones = porciones;
	}

	public double calcularMontoDePorciones() {
		return porciones.stream().mapToDouble(Porcion::ganancia).sum();
	}

}
