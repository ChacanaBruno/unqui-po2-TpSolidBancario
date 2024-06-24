package EmpresaIngenieria;

public class Trasporte implements Actividad {
	private double distancia;
	private double pesoDeCarga;
	private int precio;

	public Trasporte(double distancia, double pesoDeCarga, int precio) {
		super();
		this.distancia = distancia;
		this.pesoDeCarga = pesoDeCarga;
		this.precio = precio;
	}

	public double getPrecio() {
		return distancia * pesoDeCarga * precio;
	}
}
