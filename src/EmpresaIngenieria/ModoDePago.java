package EmpresaIngenieria;

public abstract class ModoDePago {
	private double ajuste;
	
	ModoDePago(double ajuste) {
		this.ajuste = ajuste;
	} 
	
	 public abstract double getMonto(Actividad a);
	 
	 public double getAjuste() {
		 return ajuste;
	 }
}
