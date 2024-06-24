package EmpresaIngenieria;

public class ModoEfectivo implements ModoDePago {

	@Override
	public double getMonto(Actividad a) {

		return a.getPrecio();
	}

	@Override
	public double calcularMontoPara(Actividad a) {
		// TODO Auto-generated method stub
		return 0;
	}


}
