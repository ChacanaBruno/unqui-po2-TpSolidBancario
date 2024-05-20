package ar.edu.po2.TpComposite;

public class Cultivo implements Gananciable {
	protected double precio;

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Cultivo(double precio) {
		super();
		this.precio = precio;
	}

	@Override
	public double calcularGanancia() {
		
		return getPrecio();
	}

}
