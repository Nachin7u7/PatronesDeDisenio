package ejercicioComposite;

import java.util.*;

public class CompositeEquipo extends Equipo {
	private List<Equipo> list = new ArrayList<>();

	public CompositeEquipo(String nombre) {
		super(nombre);
	}

	@Override
	public void precio() {
		Global.totalPrecio = Global.totalPrecio + this.getPrecio();
		for (Equipo entidad : list) {
			entidad.precio();
		}
		System.out.println(Global.totalPrecio);
	}

	public void showTotalPrecio() {
		System.out.println("Precio: " + Global.totalPrecio + " |");
	}

	@Override
	public void add(Equipo entidad) {
		list.add(entidad);
	}

	@Override
	public void remove(Equipo entidad) {
		list.remove(entidad);
	}

	@Override
	public void getChild(int position) {
		System.out.println();
	}

}