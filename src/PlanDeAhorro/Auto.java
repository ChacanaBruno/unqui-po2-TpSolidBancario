package PlanDeAhorro;

public class Auto implements Retribucion{
	private Operador operadorAuto;
	@Override
	public void realizarAccionPara(PlanAhorro planAhorro) {
		operadorAuto.comprarAutomovil(planAhorro.getMarca(), planAhorro.getModelo());
		
	}

}
