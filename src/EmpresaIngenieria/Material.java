package EmpresaIngenieria;

public class Material {
	private int cantidad;
	private double precio;

	public Material(int cantidad, double precio) {
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
		return precio * cantidad;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
