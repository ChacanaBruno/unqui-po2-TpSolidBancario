package DocumentosFormateables;

public class HTML extends Formateador {

	@Override
	protected String fechaPara(Documento d) {
		return ""; // en este formato devuelve un string vacio porque el html no pide la fecha en
					// el documento...
	}

	@Override
	protected String tituloPara(Documento d) {

		return "<title>" + d.getTitulo() + "</title>";
	}

	@Override
	protected String cuerpoPara(Documento d) {

		return "<body>" + d.getCuerpo() + "</body>";
	}

	@Override
	protected String firmaPara(Documento d) {
		// TODO Auto-generated method stub
		return "<footer>" + d.getFirma() + "</footer>";
	}

}
