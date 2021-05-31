//libros(tipo, autor), computadora(marca, os).
public class Libro {

	private String tipo;
	private String autor;

	public Libro(String tipo, String autor) {
		super();
		this.tipo = tipo;
		this.autor = autor;
	}

	public void getLibro() {
		System.out.println("Tipo: " + tipo);
		System.out.println("Autor: " + autor);
	}

}
