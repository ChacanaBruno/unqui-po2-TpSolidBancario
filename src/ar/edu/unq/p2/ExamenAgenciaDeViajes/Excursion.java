package ar.edu.unq.p2.ExamenAgenciaDeViajes;

public class Excursion extends Producto{

	
	
	
	@Override
	public double calcularPrecioFinal() {
		// TODO Auto-generated method stub
		return precioPorPersona + precioImpuesto;  
	}

}
