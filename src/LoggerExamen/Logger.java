package LoggerExamen;

import java.util.List;

public class Logger implements Sujeto {
	private List<Sistema> sistemaDeEscucha;

	public Logger(List<Sistema> sistemaDeEscucha) {
		super();
		this.sistemaDeEscucha = sistemaDeEscucha;
	}

	public List<Sistema> getSistemaDeEscucha() {
		return sistemaDeEscucha;
	}

	public void setSistemaDeEscucha(List<Sistema> sistemaDeEscucha) {
		this.sistemaDeEscucha = sistemaDeEscucha;
	}
/*
	 @Override
	public void enviarMensaje(String msg, Severidad s) {
		for (Sistema sistema : sistemaDeEscucha) {
			sistema.mostrarMensaje( msg,  s);
		}
	}
	*/

	
	public void enviarMensaje(String msg, Severidad s) {
		getSistemaDeEscucha().forEach(sistema -> sistema.notificacion(msg, s));
	}
	
	
	@Override
	public void add(Sistema s) {
		this.sistemaDeEscucha.add(s);

	}

	@Override
	public void remove(Sistema s) {
		this.sistemaDeEscucha.remove(s);

	}

}
