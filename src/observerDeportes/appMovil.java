package observerDeportes;

import java.util.List;

public class appMovil implements intereados {
	private List<String> resultadosDeInteres;

	@Override
	public void update(String interes) {
		resultadosDeInteres.add(interes); // comportamiento inventado.
		
	}
}