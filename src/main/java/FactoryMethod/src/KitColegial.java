
public class KitColegial implements Kit {

	private Mochila mochila;
	private Libro libro;
	private Computadora computadora;

	public KitColegial() {
	}

	public void setMochila(Mochila mochila) {
		this.mochila = mochila;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public void setComputadora(Computadora computadora) {
		this.computadora = computadora;
	}

	@Override
	public void create() {
		mochila.getMochila();
		libro.getLibro();
		computadora.getComputadora();
	}

}
