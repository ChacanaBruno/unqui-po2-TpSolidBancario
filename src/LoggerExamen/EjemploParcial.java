package LoggerExamen;

import java.util.ArrayList;
import java.util.List;

public class EjemploParcial {

	public void configurar() {
		List<Sistema> sistemaDeEscucha = new ArrayList<Sistema>();
		List<String> mensajesRecibidos = new ArrayList<String>();
		List<Severidad> nivelesDeSeveridad = new ArrayList<Severidad>();

		Monitor MiMonitor = new Monitor();
		Verbose verbose = new Verbose(mensajesRecibidos);
		Produccion produccion = new Produccion(nivelesDeSeveridad);

		produccion.agregarNivelDeSeveridad(Severidad.ERROR);
		produccion.agregarNivelDeSeveridad(Severidad.FATAL);

		Logger logger = new Logger(sistemaDeEscucha);

		SistemaEscucha s1 = new SistemaEscucha(MiMonitor, verbose);
		SistemaEscucha s2 = new SistemaEscucha(MiMonitor, produccion);

		s2.setRegla(verbose);

	}
}
