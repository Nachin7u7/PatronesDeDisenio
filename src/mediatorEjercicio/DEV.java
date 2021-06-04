package mediatorEjercicio;

public class DEV extends Collage {

	String name;
	String lenguaje;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLenguaje() {
		return lenguaje;
	}

	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}

	public String getCi() {
		return lenguaje;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}

	public DEV(IMediator mediator, String name, String lenguaje, String ci) {
		super(mediator);
		this.name = name;
		this.lenguaje = lenguaje;
		this.ci = ci;
	}

	@Override
	public void send(String message) {
		mediator.send(message, this);
	}

	@Override
	public void messageReceived(String message) {
		System.out.println("DEV");
		System.out.println("Nombre:" + name);
		System.out.println("Ci:" + ci);
		System.out.println("Lenguaje:" + lenguaje);
		System.out.println("Mensaje:" + message);
	}
}
