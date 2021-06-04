package mediatorEjercicio;

public class QA extends Collage {

	String name;
	String grado;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLenguaje() {
		return grado;
	}

	public void setLenguaje(String lenguaje) {
		this.grado = lenguaje;
	}

	public String getCi() {
		return grado;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}

	public QA(IMediator mediator, String name, String lenguaje, String ci) {
		super(mediator);
		this.name = name;
		this.grado = lenguaje;
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
		System.out.println("Grado:" + grado);
		System.out.println("Mensaje:" + message);
	}
}
