package PlanDeAhorro;

public class Vigente implements Estado {

	@Override
	public boolean esPlanPendiente() {
		return true;
	}

	@Override
	public void actualizar(PlanAhorro planAhorro) {
		if (planAhorro.getCuotas() < 1) {
			planAhorro.setEstado(new Finalizado());
			planAhorro.ejecutarRetribucion();
		}
	}

	@Override
	public void pagarCuotaDe(PlanAhorro planAhorro) {
		planAhorro.pagarCuota();
		this.actualizar(planAhorro);
	}

	@Override
	public void darRetribucion(PlanAhorro planAhorro, Retribucion retribucion) {
		// TODO Auto-generated method stub

	}

}
