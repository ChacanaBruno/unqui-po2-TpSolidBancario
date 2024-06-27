package LoggerExamen;

public interface Sujeto {

	public void add(Sistema s);

	public void remove(Sistema s);

	public void enviarMensaje(String msg, Severidad s);
}
