package EmpresaIngenieria;

public class Operario {
	private int horasTrabajadas;
	private double valorPorHora;
	private int aniosDeAntiguedad;

	public Operario(int horasTrabajadas, double valorPorHora, int aniosDeAntiguedad) {
		super();
		this.horasTrabajadas = horasTrabajadas;
		this.valorPorHora = valorPorHora;
		this.aniosDeAntiguedad = aniosDeAntiguedad;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	public int getAniosDeAntiguedad() {
		return aniosDeAntiguedad;
	}

	public void setAniosDeAntiguedad(int aniosDeAntiguedad) {
		this.aniosDeAntiguedad = aniosDeAntiguedad;
	}

}
