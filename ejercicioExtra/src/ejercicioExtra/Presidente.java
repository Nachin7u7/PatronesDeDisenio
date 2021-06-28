package ejercicioExtra;

public class Presidente extends Duenos {
	String nombre;

	public Presidente(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void messageReceived(String mensaje) {
		System.out.println("El presidente " + nombre + " ha recibido el mensaje " + mensaje);

	}

}