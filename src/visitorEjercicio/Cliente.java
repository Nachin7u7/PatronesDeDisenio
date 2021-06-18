package visitorEjercicio;

public class Cliente {

	public static void main(String[] sss) {

		Notepad notepad = new Notepad();
		Word word = new Word();
		Sublime sublime = new Sublime();
		Visitor visitor = new Visitor();

		notepad.setContenido("documento1");

		word.setContenido("documento2");

		notepad.accept(visitor);
		word.accept(visitor);
		sublime.accept(visitor);

	}

}
