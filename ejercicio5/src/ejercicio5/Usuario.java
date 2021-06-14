package ejercicio5;

public abstract class Usuario {

	protected CanalDeComunicacion mediator;

	public Usuario(CanalDeComunicacion mediator) {
		this.mediator = mediator;
	}

	public abstract void sendPerson(String message, Usuario destino);

	public abstract void sendGroup(String message, String grupo);

	public abstract void messageReceived(String message);

}
