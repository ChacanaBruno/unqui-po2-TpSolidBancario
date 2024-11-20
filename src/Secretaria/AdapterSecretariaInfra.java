package Secretaria;

public class AdapterSecretariaInfra implements Secretaria {
	private SecretariaInfraestructura secretariaInfra;
	@Override
	public float montoTotal() {
		
		return secretariaInfra.inversionTotal();
	}
}
