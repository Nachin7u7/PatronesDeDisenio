package ejercicio1;

public class Originator {

	Tesis state;

	public void setState(Tesis state) {
		this.state = state;
		System.out.println("Set state...");
		this.state.show();
	}

	public TesisVersion crearVersion() {
		System.out.println("Creando version...");
		state.show();
		return new TesisVersion(this.state);
	}

	public void restoreFromMemento(TesisVersion state) {
		System.out.println("Rstaurando...");
		this.state = state.getState();
		this.state.show();
	}

}
