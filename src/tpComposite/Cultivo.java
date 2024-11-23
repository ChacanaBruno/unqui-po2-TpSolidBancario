package tpComposite;

public class Cultivo implements Porcion {
	private String nombre;
	private double precio;

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
