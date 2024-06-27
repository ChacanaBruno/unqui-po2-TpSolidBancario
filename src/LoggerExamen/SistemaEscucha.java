package LoggerExamen;

public class SistemaEscucha implements Sistema {
	private Monitor monitor;
	private Regla reglaActual;

	public SistemaEscucha(Monitor monitor, Regla reglaActual) {
		super();
		this.monitor = monitor;
		this.reglaActual = reglaActual;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public Regla getReglaActual() {
		return reglaActual;
	}

	public void setReglaActual(Regla reglaActual) {
		this.reglaActual = reglaActual;
	}

	@Override
	public void suscribirseALogger(Logger logger) {
		logger.add(this);

	}

	public void notificacion(String msg, Severidad s) {
		getReglaActual().enviarMensaje(this, msg, s);
	}

	public void mostrarMensaje(String msg, Severidad s) {

		monitor.printSreen("holaMundo", IMonitor.RED);
	}

	public void setRegla(Regla regla) {
		reglaActual = regla;
	}
}
