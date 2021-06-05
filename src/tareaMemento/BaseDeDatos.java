package tareaMemento;

import java.util.*;

public class BaseDeDatos {

	private List<Persona> state = new ArrayList<Persona>();

	void setState(List<Persona> state) {
		System.out.println("GUARDANDO ESTADO...");
		System.out.println("Ultima persona adherida:");
		state.get(state.size()).show();
		this.state = state;
	}

	void addPersona(Persona persona) {
		System.out.println("Persona:");
		persona.show();
		state.add(persona);
	}

	void removePersona(int pos) {
		System.out.println("Eliminando...");
		state.remove(pos);
	}

	String backUp;
	List<Persona> baseDeDatos;

	public BaseDeDatos() {
		baseDeDatos = new LinkedList<Persona>();
	}

	public BaseDeDatos(String name, List<Persona> baseDeDatos) {
		this.backUp = name;
		this.baseDeDatos = baseDeDatos;
	}

	public String getBackUp() {
		return backUp;
	}

	public void setBackUp(String backUp) {
		this.backUp = backUp;
	}

	public List<Persona> getBaseDeDatos() {
		return baseDeDatos;
	}

	public void setBaseDeDatos(List<Persona> baseDeDatos) {
		this.baseDeDatos = baseDeDatos;
	}

	public void showInfo() {
		System.out.println("Alias: " + backUp);
		for (Persona p : baseDeDatos) {
			p.show();
			System.out.println("");
		}
	}

}
