package visitorEjercicio;

public interface IEditor {

	void crear();

	void editar();

	void eliminar();

	void accept(IVisitor visitor);

}
