package LoggerExamen;

public interface Sistema { // Observador
	public void suscribirseALogger(Logger logger);

	public  void notificacion(String msg, Severidad s);
	
}
