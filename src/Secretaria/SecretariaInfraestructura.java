package Secretaria;

import java.util.List;

public class SecretariaInfraestructura {
	private List<Actividad> actividades;
	public SecretariaInfraestructura(List<Actividad> actividades) {
		super();
		this.actividades = actividades;
	}

	public double inversionTotal() {
		return this.actividades.stream().mapToDouble(a -> a.inversionTotal()).sum();
	} 
	
	
}
