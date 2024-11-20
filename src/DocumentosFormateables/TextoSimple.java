package DocumentosFormateables;

public class TextoSimple extends Formateador {

	@Override
	protected String fechaPara(Documento d) {

		return "Fecha de Creación: " + d.getFecha();
	}

	@Override
	protected String tituloPara(Documento d) {
		// TODO Auto-generated method stub
		return "Titulo " + d.getTitulo();
	}

	@Override
	protected String cuerpoPara(Documento d) {
		// TODO Auto-generated method stub
		return "Texto: " + d.getCuerpo();
	}

	@Override
	protected String firmaPara(Documento d) {
		// TODO Auto-generated method stub
		return "Pie: " + d.getFirma();
	}

}
