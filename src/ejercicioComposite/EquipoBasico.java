package ejercicioComposite;

public class EquipoBasico extends Equipo {

	public EquipoBasico(String nombre) {
		super(nombre);
	}

	@Override
	public void precio() {
		this.getPrecio();
	}

	@Override
	public void add(Equipo component) {
		System.out.println("No aplicable");

	}

	@Override
	public void remove(Equipo component) {
		System.out.println("No aplicable");
	}

	@Override
	public void getChild(int position) {
		System.out.println("No aplicable");
	}
}