package TarjetaYBancoExamen;

import java.sql.Date;
import java.time.LocalDate;

//Segun patron State: Estado Concreto
public class Pausada extends EstadoT {

	public Pausada(TarjetaDeCredito tarjeta) {
		super(tarjeta); // Inicializa la tarjeta en el estado actual
	}

	@Override
	public void activar() {
		tarjeta.setEstadoActual(new Activa(tarjeta)); // Cambia al estado activo
	}


	@Override
	 public void realizarCompra(Compra compra) {
		Date fechaActual = new Date(); // ojo Date: Obsoleto para muchas operaciones; usar principalmente para
										// interoperabilidad con código antiguo.
										// java.time: API recomendada para manipulación de fechas y horas en código
										// moderno.
		tarjeta.getBanco().alertaDeFraude(tarjeta.getNumero(), fechaActual, compra.getCuit());
// MENSAJE PARA EL BANCO, EL BANCO PUEDE OPERAR CON LA INTERFAZ ORIGINAL O CON LA EUROPEA. SEGUN LA INSTANCIA CREADA, PERO ESO NO DEPENDE DE NOSOTROS!
	}

}
