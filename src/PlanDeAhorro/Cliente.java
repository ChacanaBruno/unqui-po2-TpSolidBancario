package PlanDeAhorro;

public class Cliente {
	private String nombre;
	private String CBU;
	
	public Cliente () {}
	public Cliente(String nombre, String cBU) {
		super();
		this.nombre = nombre;
		CBU = cBU;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCBU() {
		return CBU;
	}

	public void setCBU(String cBU) {
		CBU = cBU;
	}

}
