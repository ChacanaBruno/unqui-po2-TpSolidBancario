package TarjetaYBancoExamen;

import java.sql.Date;

//Segun Patron Adapter: Adaptada (Adaptee)
public interface ComiteAntifraudeEuropeo {
	//Acciona legalmente a partir del fraude en la tarjeta y en la fecha recibidas.
	public void iniciarInvestigación(String númeroTarjeta, Date fecha); // se ve que java soporta acentos.
}
