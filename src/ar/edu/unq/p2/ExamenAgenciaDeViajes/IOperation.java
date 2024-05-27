package ar.edu.unq.p2.ExamenAgenciaDeViajes;

import java.time.LocalDate;

public interface IOperation {
	public double taxes(String aeroportName, LocalDate date);
}
