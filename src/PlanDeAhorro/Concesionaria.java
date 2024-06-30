package PlanDeAhorro;

import java.util.ArrayList;
import java.util.List;

public class Concesionaria {
	List<PlanAhorro> planesAhorro = new ArrayList<PlanAhorro>();

    public void crearPlanDeAhorro(Cliente titular, String marca, String modelo, Integer cuotas, Retribucion r) {
        PlanAhorro plan = new PlanAhorro(titular, marca, modelo, cuotas, r);
        planesAhorro.add(plan);
    }

	public long cantidadDeCuotasPendientesDeCobro() {
		return planesAhorro.stream().filter(plan -> plan.esPlanPendiente()).count();
	}

}
