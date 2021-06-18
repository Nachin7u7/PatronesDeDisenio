package visitorEjercicio;

public class Visitor implements IVisitor {

	@Override
	public void guardarArchivos(Word word) {
		System.out.println("Guardando Word");
		System.out.println("Generando PDF...");
		System.out.println("La cantidad de caracteres es: " + word.getContenido().length());
	}

	@Override
	public void guardarArchivos(Notepad notepad) {
		System.out.println("Guardando Word");
		System.out.println("Generando PDF...");
		int cont = notepad.getContenido().length();
		System.out.println("La cantidad de caracteres es: " + cont);
	}

	@Override
	public void guardarArchivos(Sublime sublime) {
		System.out.println("Guardando Word");
		System.out.println("Generando PDF...");
		int cont = sublime.getContenido().length();
		System.out.println("La cantidad de caracteres es: " + cont);
	}
}
