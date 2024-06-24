package EmpresaIngenieria;

public class ModoTarjeta implements ModoDePago {
	@Override
	public double getMonto(Actividad a) {

		return a.getPrecio() + this.calcularMontoPara(a);
	}

	public double calcularMontoPara(Actividad a) {
		return a.getPrecio() * 0.04;
	}
}