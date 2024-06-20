package enumsYstreams;

public enum LesionsDermatologic {
	ROJO("Lesión roja", 1), GRIS("Lesión gris", 2), AMARILLO("Lesión amarilla", 3), MIEL("Lesión miel", 4);

	private final String description;
	private final int riskLevel;

	// CONSTRUCTOR ENUM

	LesionsDermatologic(String description, int riskLevel) {
		this.description = description;
		this.riskLevel = riskLevel;
	}

	public String getDescription() {
		return description;
	}

	public int getRiskLevel() {
		return riskLevel;
	}

	// Método para obtener el próximo color en el proceso de maduración

	public LesionsDermatologic getNextColour() {
		LesionsDermatologic[] colours = LesionsDermatologic.values();
		int nextIndex = (this.ordinal() + 1) % colours.length;

		return colours[nextIndex];

		/**
		 * Si el color actual es MIEL:
		 * 
		 * this.ordinal() devuelve 3 (porque MIEL es el cuarto color). this.ordinal() +
		 * 1 es 4. 4 % 4 es 0. colores[0] es ROJO.
		 */
	}

}
