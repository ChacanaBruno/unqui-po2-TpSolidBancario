package EmpresaIngenieria;

import java.util.List;

import java.util.List;

public class Obra implements Actividad{
	
	private List<Material> materiales;
	private List<Operario> operarios;
	

	public Obra(List<Operario> operarios, List<Material> materiales) {
		this.materiales = materiales;
		this.operarios = operarios;
	}

	@Override
	public double getPrecio() {
		
		return this.calcularCostoMateriales() + this.calcularSueldoOperarios();
	}

	private Double calcularSueldoOperarios() {
		
		return this.operarios.stream().mapToDouble(operario -> operario.getSueldo()).sum();
	}

	private Double calcularCostoMateriales() {
		return this.materiales.stream().mapToDouble(material -> material.getPrecio()).sum();
	}

}
