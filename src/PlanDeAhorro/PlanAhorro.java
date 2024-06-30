package PlanDeAhorro;

public class PlanAhorro {
	private Cliente titular;
	private String marca;
	private String modelo;
	private Integer cuotas;
	private Estado estadoActual;
	private String cbu;
	private Retribucion retribucion;

	public PlanAhorro(Cliente titular, String marca, String modelo, Integer cuotas,
			Retribucion retribucion) {
		super();
		this.titular = titular;
		this.marca = marca;
		this.modelo = modelo;
		this.cuotas = cuotas;
		this.cbu = titular.getCBU();
		this.estadoActual = new Creado();
		this.retribucion = retribucion;
	}


	public Integer getCuotas() {
		return cuotas;
	}

	public void setCuotas(Integer cuotas) {
		this.cuotas = cuotas;
	}

	public boolean esPlanPendiente() {
		return this.estadoActual.esPlanPendiente();
	}

	public void pagarCuota() {
		estadoActual.pagarCuotaDe(this);
	}

	public void restarCuota() {
		this.cuotas = this.cuotas - 1;
	}

	public void setEstado(Estado estado) {
		this.estadoActual = estado;

	}

    public Retribucion getRetribucion() {
        return this.retribucion;
    }

    public void ejecutarRetribucion() {
        this.estadoActual.darRetribucion(this, this.getRetribucion());
    }

	public Estado getEstado() {

		return this.estadoActual;
	}

	public String getMarca() {
		// TODO Auto-generated method stub
		return this.marca;
	}

	public String getModelo() {
		// TODO Auto-generated method stub
		return this.modelo;
	}
	
	public String getCBU() {
		return this.cbu;
	}
}