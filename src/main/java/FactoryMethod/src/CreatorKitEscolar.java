
public class CreatorKitEscolar extends Creator {
	// k 1 -> mochila, deportivo, cuadernos
	@Override
	public Kit create() {
		Mochila mochila = new Mochila("4", "Mediano");
		Deportivo deportivo = new Deportivo("M", "Azul", "3");
		Cuaderno cuaderno = new Cuaderno("Carpeta", "50");

		KitEscolar escolar = new KitEscolar();
		escolar.setCuaderno(cuaderno);
		escolar.setDeportivo(deportivo);
		escolar.setMochila(mochila);

		return escolar;

	}

}
