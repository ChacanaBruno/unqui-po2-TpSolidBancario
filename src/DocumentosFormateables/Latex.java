package DocumentosFormateables;

public class Latex extends Formateador {

	@Override
	protected String fechaPara(Documento d) {
		return "\\date{" + d.getFecha() + "}";
	}

	@Override
	protected String tituloPara(Documento d) {
		return "\\title{" + d.getTitulo() + "}";
	}

	@Override
	protected String cuerpoPara(Documento d) {
		return "\\begin{document}" + d.getCuerpo() + "\\end{document}";
	}

	@Override
	protected String firmaPara(Documento d) {
		return "\\footer{" + d.getFirma() + "}";
	}
}
