package ar.edu.unq.po2.TpPocker;

import java.util.ArrayList;
import java.util.List;

public class ManoDeCartas {
	private List<Carta> cartas;

	public ManoDeCartas() {
		this.cartas = new ArrayList<>();
	}

	public void agregarCarta(Carta carta) {
		cartas.add(carta);
	}

	// Método para agregar múltiples cartas desde una lista
	public void agregarCartas(List<Carta> nuevasCartas) {
		cartas.addAll(nuevasCartas);
	}

}