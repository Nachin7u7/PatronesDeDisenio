package ejercicioComposite;

public class Cliente {

	public static void main(String[] args) {
		CompositeEquipo equipo1 = new CompositeEquipo("PC");
		CompositeEquipo equipo2 = new CompositeEquipo("PC");
		CompositeEquipo equipo3 = new CompositeEquipo("PC");

		CompositeEquipo labo = new CompositeEquipo("Laboratorio");

		labo.add(equipo3);
		labo.add(equipo2);
		labo.add(equipo1);

		CompositeEquipo labo2 = new CompositeEquipo("Laboratorio");

		labo2.add(equipo3);
		labo2.add(equipo2);
		labo2.add(equipo1);

		CompositeEquipo labo3 = new CompositeEquipo("Laboratorio");

		labo3.add(equipo3);
		labo3.add(equipo2);
		labo3.add(equipo1);

		CompositeEquipo contenedor = new CompositeEquipo("Contenedor");

		contenedor.add(labo);
		contenedor.add(labo2);
		contenedor.add(labo3);

		contenedor.precio();

	}

}
