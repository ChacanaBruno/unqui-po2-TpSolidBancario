package LoggerExamen;

import java.util.List;

public class Verbose implements Regla {
	private IEmailApp apiEmail;
	private List<String> mensajesRecibidos;

	public Verbose(IEmailApp apiEmail, List<String> mensajesRecibidos) {
		super();
		this.apiEmail = apiEmail;
		this.mensajesRecibidos = mensajesRecibidos;
	}

	public Verbose(List<String> mensajesRecibidos) {

		this.mensajesRecibidos = mensajesRecibidos;
	}

	@Override
	public void enviarMensaje(SistemaEscucha s, String msg, Severidad severidad) {

		if (this.getMensajesRecibidos().size() < 100) {
			s.getMonitor().printSreen(msg, IMonitor.GRAY);
			this.agregarMensaje(msg);

		} else {
			s.getMonitor().printSreen(msg, IMonitor.GRAY);
			this.enviarMail();
			this.getMensajesRecibidos().clear(); // reinicia el contador
		}
	}

	private void enviarMail() {
		// Crear un StringBuilder para concatenar todos los mensajes
		StringBuilder contenido = new StringBuilder();

		// Iterar sobre todos los mensajes y agregarlos al StringBuilder
		for (String msg : mensajesRecibidos) {
			contenido.append(msg).append("\n"); // Agregar cada mensaje y un salto de línea
		}

		// Enviar un único correo electrónico con todos los mensajes concatenados
		this.apiEmail.sendEmail("AUTORIDAD", "Se llego a los 100 msj", contenido.toString());
	}

	public List<String> getMensajesRecibidos() {
		return mensajesRecibidos;
	}

	public void setMensajesRecibidos(List<String> mensajesRecibidos) {
		this.mensajesRecibidos = mensajesRecibidos;
	}

	public void agregarMensaje(String msg) {
		this.getMensajesRecibidos().add(msg);
	}

}
