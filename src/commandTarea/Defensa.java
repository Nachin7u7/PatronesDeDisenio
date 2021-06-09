package commandTarea;

public class Defensa implements IOperacionBuild {
	private Personaje personaje;

	public Defensa(Personaje personaje) {
		this.personaje = personaje;
	}

	@Override
	public void execute() {
		this.personaje.defensa();
	}
}