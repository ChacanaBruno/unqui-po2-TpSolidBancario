package TarjetaYBancoExamen;

import java.sql.Date;

public class Compra {
	private String cuit;
	private Date fecha;
	private Double monto;

	public Compra(String cuit, Date fecha, Double monto) {
		super();
		this.cuit = cuit;
		this.fecha = fecha;
		this.monto = monto;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

}
