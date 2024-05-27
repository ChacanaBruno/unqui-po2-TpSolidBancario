package ar.edu.unq.p2.ExamenAgenciaDeViajes;

import java.util.List;

public class Paquete extends Producto {
	protected double costoGestion;
	protected List<Producto> productosIntegrados;

	public double getCostoGestion() {
		return costoGestion;
	}

	public void setCostoGestion(double costoGestion) {
		this.costoGestion = costoGestion;
	}

	public List<Producto> getProductosIntegrados() {
		return productosIntegrados;
	}

	public void setProductosIntegrados(List<Producto> productosIntegrados) {
		this.productosIntegrados = productosIntegrados;
	}

	public Paquete(double costoGestion, List<Producto> productosIntegrados) {
		super();
		this.costoGestion = costoGestion;
		this.productosIntegrados = productosIntegrados;
	}

	@Override
	public double calcularPrecioFinal() {
		// TODO Auto-generated method stub
		return 0;
	}

}
