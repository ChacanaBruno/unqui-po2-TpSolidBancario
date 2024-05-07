package ar.edu.unq.po2.TpPocker;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

/**
 * Clase que verifica distintos tipos de manos en un juego de póquer. Utiliza un
 * conjunto de cartas para determinar si la mano es un "Poquer", "Color",
 * "Trio", o "Nada".
 */
public class PokerStatus {

	/**
	 * Verifica el tipo de mano de póquer dadas cinco cartas. Analiza las cartas
	 * para determinar si conforman una mano especial como Poquer, Color o Trio.
	 *
	 * @param carta1 Primera carta de la mano.
	 * @param carta2 Segunda carta de la mano.
	 * @param carta3 Tercera carta de la mano.
	 * @param carta4 Cuarta carta de la mano.
	 * @param carta5 Quinta carta de la mano.
	 * @return El tipo de mano de póquer ("Poquer", "Color", "Trio", "Nada").
	 */
	public String verificar(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		Map<Integer, Integer> valorCount = new HashMap<>(); // Mapa para contar las frecuencias de cada valor de carta.
		Map<String, Integer> paloCount = new HashMap<>(); // Mapa para contar las frecuencias de cada palo de carta.
		Set<String> palos = new HashSet<>(); // Conjunto para almacenar todos los palos únicos encontrados.

		Carta[] cartas = { carta1, carta2, carta3, carta4, carta5 }; // Array de cartas para facilitar la iteración.
		for (Carta carta : cartas) {
			int valor = carta.getValor(); // Obtiene el valor de la carta.
			String palo = carta.getPalo(); // Obtiene el palo de la carta.

			valorCount.put(valor, valorCount.getOrDefault(valor, 0) + 1); // Incrementa el conteo de este valor.
			paloCount.put(palo, paloCount.getOrDefault(palo, 0) + 1); // Incrementa el conteo de este palo.
			palos.add(palo); // Agrega el palo al conjunto de palos únicos.
		}

		// Evalúa las condiciones para determinar el tipo de mano.
		if (esPoquer(valorCount))
			return "Poquer";
		if (esColor(paloCount, palos))
			return "Color";
		if (esTrio(valorCount))
			return "Trio";
		return "Nada";
	}

	private boolean esPoquer(Map<Integer, Integer> valorCount) {
		return valorCount.containsValue(4); // Verifica si algún valor aparece exactamente 4 veces.
	}

	private boolean esColor(Map<String, Integer> paloCount, Set<String> palos) {
		return paloCount.containsValue(5) && palos.size() == 1; // Verifica si todas las cartas son del mismo palo.
	}

	private boolean esTrio(Map<Integer, Integer> valorCount) {
		return valorCount.containsValue(3); // Verifica si algún valor aparece exactamente 3 veces.
	}
}
