package PlanDeAhorro;

public class Finalizado implements Estado {

	@Override
	public boolean esPlanPendiente() {
		return true;
	}

	@Override
	public void actualizar(PlanAhorro planAhorro) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pagarCuotaDe(PlanAhorro planAhorro) {
		// TODO Auto-generated method stub

	}

	@Override
	public void darRetribucion(PlanAhorro planAhorro, Retribucion retribucion) {
		
		retribucion.realizarAccionPara(planAhorro);
	}


}
