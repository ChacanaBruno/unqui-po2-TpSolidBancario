package DeportesObserverAgus;

import java.util.List;

public class Partido {
	private String resultado;
	private List<String> contrincantes;
	private String deporte;

	public Partido(String resultado, List<String> contrincantes, String deportes) {
		super();
		this.resultado = resultado;
		this.contrincantes = contrincantes;
		this.deporte = deportes;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public List<String> getContrincantes() {
		return contrincantes;
	}

	public void setContrincantes(List<String> contrincantes) {
		this.contrincantes = contrincantes;
	}

	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deportes) {
		this.deporte = deportes;
	}

}
