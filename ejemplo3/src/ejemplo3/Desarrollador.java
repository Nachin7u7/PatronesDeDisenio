package ejemplo3;

public class Desarrollador implements ISubscriptor {

	private String nombre;

	public Desarrollador(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void update(String message) {
		System.out.println(nombre + " recibio la actualizaci�n:");
		System.out.println(message);

	}
}
