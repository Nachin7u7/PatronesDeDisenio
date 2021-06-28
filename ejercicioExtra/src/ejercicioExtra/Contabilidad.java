package ejercicioExtra;

public class Contabilidad extends Duenos {
	String nombre;

	public Contabilidad(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void messageReceived(String mensaje) {
		System.out.println("El trabajador de contabilidad " + nombre + " ha recibido el mensaje " + mensaje);

	}
}