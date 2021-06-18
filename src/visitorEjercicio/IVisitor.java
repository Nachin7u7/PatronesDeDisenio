package visitorEjercicio;

public interface IVisitor {

	void guardarArchivos(Word word);

	void guardarArchivos(Notepad notepad);

	void guardarArchivos(Sublime sublime);

}
