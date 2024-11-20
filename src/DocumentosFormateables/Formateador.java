package DocumentosFormateables;

public abstract class Formateador {
	// METODO PLANTILLA
	public final String darFormato(Documento d) {
		return this.fechaPara(d) + "\n" + this.tituloPara(d) + "\n" + this.cuerpoPara(d) + "\n" + this.firmaPara(d);
	}

	// pasos...
	protected abstract String fechaPara(Documento d);

	protected abstract String tituloPara(Documento d);

	protected abstract String cuerpoPara(Documento d);

	protected abstract String firmaPara(Documento d);

}
