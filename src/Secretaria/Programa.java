package Secretaria;

import java.util.List;

public class Programa extends Actividad {
	private List<Actividad> actividades;
	private double costoFijo;
	@Override
	public Double inversionTotal() {
		// TODO Auto-generated method stub
		return this.actividades.stream().mapToDouble(a -> a.inversionTotal()).sum() + this.costoFijo;
	}

}
