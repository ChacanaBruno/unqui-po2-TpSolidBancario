package ar.edu.unq.p2.ExamenAgenciaDeViajes;

import java.util.List;

public class PaqueteMixto implements Calculable {

	protected List<Calculable> productos;

	public PaqueteMixto(List<Calculable> productos) {
		super();
		this.productos = productos;
	}

	public List<Calculable> getProductos() {
		return productos;
	}

	public void setProductos(List<Calculable> productos) {
		this.productos = productos;
	}

	public void add(Calculable producto) {

		productos.add(producto);

	}

	public void remove(Calculable producto) {

		productos.remove(producto);

	}

	@Override

	public double calcularPrecioFinal() {
		// TODO Auto-generated method stub
		return 0;
	}

}
