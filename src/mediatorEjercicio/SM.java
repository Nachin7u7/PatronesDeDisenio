package mediatorEjercicio;

public class SM extends Collage {

	String name;
	String certificaciones;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLenguaje() {
		return certificaciones;
	}

	public void setLenguaje(String lenguaje) {
		this.certificaciones = lenguaje;
	}

	public String getCi() {
		return certificaciones;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}

	public SM(IMediator mediator, String name, String lenguaje, String ci) {
		super(mediator);
		this.name = name;
		this.certificaciones = lenguaje;
		this.ci = ci;
	}

	@Override
	public void send(String message) {
		mediator.send(message, this);
	}

	@Override
	public void messageReceived(String message) {
		System.out.println("SM");
		System.out.println("Nombre:" + name);
		System.out.println("Ci:" + ci);
		System.out.println("Certificaciones:" + certificaciones);
		System.out.println("Mensaje:" + message);
	}

}
