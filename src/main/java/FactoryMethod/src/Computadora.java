// libros(tipo, autor), computadora(marca, os).
public class Computadora {

	private String marca;
	private String os;

	public Computadora(String marca, String os) {
		this.marca = marca;
		this.os = os;
	}

	public void getComputadora() {
		System.out.println("Marca: " + marca);
		System.out.println("OS: " + os);
	}

}
