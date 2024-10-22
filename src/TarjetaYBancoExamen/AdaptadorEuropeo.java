package TarjetaYBancoExamen;

import java.sql.Date;

//Segun Patron Adapter: Adaptador (Adapter)
public class AdaptadorEuropeo implements InstitucionAntifraude {

	private ComiteAntifraudeEuropeo institucionEuropea; 
	// notar que se usa la interfaz implicitamente en el mensaje de abajo
	// aparentemene no se hace falta crear un objeto que implicitamente implemente a la interfaz Europea.
	// tal vez si sea necesario para test! 
	// EXPLICACION DE ADAPTER; al tipar el AdaptadorEuropeo con la interfaz que usa el banco " InstitucionAntifraude " 
	// podemos pasar el Adaptador de forma dinamica, utilizando el setter que si conoce banco, RECORDAR QUE
	// no podemos modificar en absoluto la clase banco. 

	@Override // adaptamos el mensaje de la interfaz que utliza banco orignal, con el mensaje que usa la interfaz europea. 
	public void accionarFraude(String numeroTarjeta, Date fecha, String comercio) {
		institucionEuropea.iniciarInvestigación(numeroTarjeta, fecha); // se ve que no importa el comercio? con tal de que todo funcione.
																		

	}

}
