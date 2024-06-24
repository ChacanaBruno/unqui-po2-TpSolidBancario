package EmpresaIngenieria;

public class Empresa {
	private String nombre;
	private String cuit;
	private Actividad actividadActual;
	private ModoDePago modoDePagoActual;


	Empresa(String nombre, String cuit, Actividad actividadActual, ModoDePago modoDePagoActual) {
		this.nombre = nombre;
		this.cuit = cuit;
		this.actividadActual = actividadActual;
		this.modoDePagoActual = modoDePagoActual;
	}

	public Actividad getActividad() {
		return actividadActual;
	}

	public void establecerDeModoDePago(ModoDePago m) {
		this.setModoDePago(m);
	}

	public void setModoDePago(ModoDePago m) {
		this.modoDePagoActual = m;
	}
}
