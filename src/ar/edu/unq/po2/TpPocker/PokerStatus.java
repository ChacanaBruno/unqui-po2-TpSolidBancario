package ar.edu.unq.po2.TpPocker;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

/**
 * Clase que verifica distintos tipos de manos en un juego de póquer.
 */
public class PokerStatus {

	/**
	 * Verifica el tipo de mano de póquer dadas cinco cartas.
	 * 
	 * @param carta1 Representación de la primera carta (valor + palo).
	 * @param carta2 Representación de la segunda carta (valor + palo).
	 * @param carta3 Representación de la tercera carta (valor + palo).
	 * @param carta4 Representación de la cuarta carta (valor + palo).
	 * @param carta5 Representación de la quinta carta (valor + palo).
	 * @return El tipo de mano de póquer ("Poquer", "Color", "Trio", "Nada").
	 */
	public String verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {
		// Mapa para contar la frecuencia de cada valor de carta
		Map<String, Integer> valorCount = new HashMap<>();
		// Mapa para contar la frecuencia de cada palo de carta
		Map<Character, Integer> paloCount = new HashMap<>();
		// Conjunto para almacenar todos los palos únicos encontrados
		Set<Character> palos = new HashSet<>();

		// Array de cartas para iterar fácilmente
		String[] cartas = { carta1, carta2, carta3, carta4, carta5 };
		for (String carta : cartas) {
			// Extrae el valor (todo excepto el último carácter)
			String valor = carta.substring(0, carta.length() - 1);
			// Extrae el palo (último carácter)
			char palo = carta.charAt(carta.length() - 1);

			// Actualiza el conteo de frecuencias de valores y palos
			valorCount.put(valor, valorCount.getOrDefault(valor, 0) + 1);
			paloCount.put(palo, paloCount.getOrDefault(palo, 0) + 1);
			// Agrega el palo al conjunto de palos únicos
			palos.add(palo);
		}

		if (esPoquer(valorCount))
			return "Poquer";
		if (esColor(paloCount, palos))
			return "Color";
		if (esTrio(valorCount))
			return "Trio";
		return "Nada";
	}

	private boolean esPoquer(Map<String, Integer> valorCount) {
		return valorCount.containsValue(4);
	}

	private boolean esColor(Map<Character, Integer> paloCount, Set<Character> palos) {
		return paloCount.containsValue(5) && palos.size() == 1;
	}

	private boolean esTrio(Map<String, Integer> valorCount) {
        return valorCount.containsValue(3);
    }
}