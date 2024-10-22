package TarjetaYBancoExamen;

import java.sql.Date;

public class Banco { // Segun Patron Adapter: Cliente (Client)

	private InstitucionAntifraude institucionAntifraude; // notar que el banco CONOCE a la interfaz, no la implementa. 

	
	

	public Banco(InstitucionAntifraude institucionAntifraude) { // OJO ESTO NO SE SI ESTA BIEN PERO ES NECESARIO PARA EL EJERCIO 3
																// ESTAMOS MODIFICANDO LA CLASE BANCO PARA, MODOFICAR BANCO ESTA MAL
																// Preguntar durante el examen, si se llega a dar una situacin asi.
		super();
		this.institucionAntifraude = institucionAntifraude;
	}

	public void setinstituciónAntifraude(InstitucionAntifraude institucionAntifraude) {
		this.institucionAntifraude = institucionAntifraude; // podemos deducir que banci tiene un colaborador interno (atributo) que es una instancia
															// de la interfaz dada.
	}

	public void alertaDeFraude(String númeroTarjeta, Date fecha, String CUIT) {
		institucionAntifraude.accionarFraude(númeroTarjeta, fecha, CUIT);
	}

}
