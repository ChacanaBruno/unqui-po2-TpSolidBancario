package Secretaria;

import java.util.List;

public class MinisterioDePlanifiacion {
	public float montoTotalAlInvertir(List<Secretaria> secretarias) {
		float total = 0;
		for (Secretaria secretaria : secretarias) {
			total += secretaria.montoTotal();
		}
		return total;
	}
}
