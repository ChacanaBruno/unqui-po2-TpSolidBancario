package PlanDeAhorro;

public class Creado implements Estado{

	@Override
	public void actualizar(PlanAhorro planAhorro) {
		planAhorro.setEstado(new Vigente());
		
	}

	@Override
	public boolean esPlanPendiente() {
			return false ;
		
	}

	@Override
	public void pagarCuotaDe(PlanAhorro planAhorro) {
		planAhorro.restarCuota();
		this.actualizar(planAhorro);
		
	}



	@Override
	public void darRetribucion(PlanAhorro planAhorro, Retribucion retribucion) {
		// TODO Auto-generated method stub
		
	}

}
