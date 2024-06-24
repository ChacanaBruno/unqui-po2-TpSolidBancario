package EmpresaIngenieria;

public class Materiales {
	private int cantidad;
	private double precio;

	public Materiales(int cantidad, double precio) {
		super();
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
