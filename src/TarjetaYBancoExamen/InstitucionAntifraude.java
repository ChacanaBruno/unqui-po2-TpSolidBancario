package TarjetaYBancoExamen;

import java.sql.Date;

//Segun Patron Adapter: Objetivo (Target)
public interface InstitucionAntifraude {
	public void accionarFraude(String numeroTarjeta, Date fecha, String comercio);
}