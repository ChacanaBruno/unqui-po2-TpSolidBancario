package PlanDeAhorro;

public class Efectivo implements Retribucion {
	private Operador operador;

	@Override
	public void realizarAccionPara(PlanAhorro planAhorro) {

		float montoDeAuto = operador.valorAutomovil(planAhorro.getMarca(), planAhorro.getModelo());
		operador.depositar(montoDeAuto, planAhorro.getCBU());

	}

}
