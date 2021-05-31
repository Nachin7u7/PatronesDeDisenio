//k 2 -> mochila, libros, computadora
public class CreatorKitColegial extends Creator {

	@Override
	public Kit create() {
		Mochila mochila = new Mochila("5", "Grande");
		Libro libro = new Libro("Ciencias", "Serway");
		Computadora computadora = new Computadora("Lenovo", "Windows");

		KitColegial colegial = new KitColegial();
		colegial.setComputadora(computadora);
		colegial.setLibro(libro);
		colegial.setMochila(mochila);

		return colegial;
	}

}
