package ejercicio2;

public class Teniente implements IEjercito {
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
		if (accion.equals("Disciplina")) {
			System.out.println("El teniente esta disciplinando a sus inferiores");
		} else {
			this.next.accion(accion);
		}

	}

}
