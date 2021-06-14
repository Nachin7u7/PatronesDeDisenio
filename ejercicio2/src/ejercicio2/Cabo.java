package ejercicio2;

public class Cabo implements IEjercito {
	private IEjercito next;

	@Override
	public void setNext(IEjercito iejercito) {
		this.next = iejercito;

	}

	@Override
	public IEjercito next() {
		return next;
	}

	@Override
	public void accion(String accion) {
		if (accion.equals("Limpiezas")) {
			System.out.println("El Cabo se encargara de la limpieza...");
		} else {
			System.out.println("El Cabo se encargara de la tarea...");
		}
	}
}