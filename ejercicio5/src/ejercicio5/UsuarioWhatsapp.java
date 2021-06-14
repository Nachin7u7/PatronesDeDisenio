package ejercicio5;

public class UsuarioWhatsapp extends Usuario {
	private String nombre;

	public UsuarioWhatsapp(CanalDeComunicacion mediator, String nombre) {
		super(mediator);
		this.nombre = nombre;
	}

	@Override
	public void messageReceived(String message) {
		System.out.println(nombre + " ha recibido el mensaje: ");
		System.out.println(message);

	}

	@Override
	public void sendPerson(String message, Usuario destino) {
		mediator.send(message, destino);

	}

	@Override
	public void sendGroup(String message, String grupo) {
		mediator.sendGroup(message, grupo, this);

	}

}
