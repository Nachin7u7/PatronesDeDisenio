package ejercicio2;

public interface IEjercito {

	void setNext(IEjercito iejercito);

	IEjercito next();

	void accion(String accion);

}
