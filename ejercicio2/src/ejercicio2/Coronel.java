package ejercicio2;

public class Coronel implements IEjercito {
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
		if (accion.equals("Desbloqueos")) {
			System.out.println("El Coronel esta debloquenado caminos...");
		} else if (accion.equals("Manifestaciones")) {
			System.out.println("El Coronel esta lidiando con manifestaciones...");
		} else {
			this.next.accion(accion);
		}

	}

}
