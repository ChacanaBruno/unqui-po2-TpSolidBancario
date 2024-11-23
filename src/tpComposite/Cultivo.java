package tpComposite;

public class Cultivo implements Porcion {
	private String nombre; // trigo
	private double precio; // 1200


	public Cultivo(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	
	}

	@Override
	public double ganancia() {

		return precio;
	}

}
