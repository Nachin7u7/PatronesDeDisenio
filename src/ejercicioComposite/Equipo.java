package ejercicioComposite;

public abstract class Equipo {
	private String nombre;
	private int precio;

	public Equipo(String nombre) {
		this.nombre = nombre;
		if (nombre.equals("Computadora")) {
			this.precio = 100;
		} else {
			this.precio = 0;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public abstract void precio();

	public abstract void add(Equipo component);

	public abstract void remove(Equipo component);

	public abstract void getChild(int position);
}