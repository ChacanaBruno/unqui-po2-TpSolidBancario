package EmpresaIngenieria;

import java.util.List;

public class Proyecto implements Actividad {
	private double costoDeGestion;
	private List<Actividad> actividades;

	public Proyecto(double costoDeGestion, List<Actividad> actividades) {
		super();
		this.costoDeGestion = costoDeGestion;
		this.actividades = actividades;
	}

	public double getCostoDeGestion() {
		return costoDeGestion;
	}

	public void setCostoDeGestion(double costoDeGestion) {
		this.costoDeGestion = costoDeGestion;
	}

	public List<Actividad> getActividades() {
		return actividades;
	}

	public void setActividades(List<Actividad> actividades) {
		this.actividades = actividades;
	}

	public void add(Actividad a) {
		actividades.add(a);
	}

	public void remove(Actividad a) {
		actividades.remove(a);
	}

	@Override
	public double getPrecio() {
		double precioDeActividades = this.actividades.stream().mapToDouble(actividades -> actividades.getPrecio()).sum();
		return precioDeActividades + costoDeGestion;
	}
}
