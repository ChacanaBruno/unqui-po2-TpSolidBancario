package Secretaria;

public class AdapterSecretariaInfra implements Secretaria {
	private SecretariaInfraestructura secretaria;
	@Override
	public float montoTotal() {
		
		return secretaria.inversionTotal();
	}

}
