package mediatorEjercicio;

public abstract class Collage {
	protected IMediator mediator;
	protected String ci;

	public Collage(IMediator mediator) {
		this.mediator = mediator;
	}

	public abstract void send(String message);

	public abstract void messageReceived(String message);

}
