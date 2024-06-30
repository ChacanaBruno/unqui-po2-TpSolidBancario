package PlanDeAhorro;

public interface Estado {

	public boolean esPlanPendiente();

	public void actualizar(PlanAhorro planAhorro);

	public void pagarCuotaDe(PlanAhorro planAhorro);

	public void darRetribucion(PlanAhorro planAhorro, Retribucion retribucion);
}
