package observerDeportes;

public interface Sujeto {
	public void add(String eventType, intereados i);
	public void remove(String eventType, intereados i);
	public notify(String eventType, String Resultado);
	
}
