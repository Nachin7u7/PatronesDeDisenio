package ejercicioExtra;

public class Laptop implements Computadora {
	private int tamano;
	private String modelo;

	public Laptop(int tamano, String modelo) {
		this.tamano = tamano;
		this.modelo = modelo;
	}

	public int getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public void mostrarInfo() {
		System.out.println("Caracteristicas de Laptop");
		System.out.println("Modelo: " + modelo);
		System.out.println("Tamaño: " + tamano);
	}

	@Override
	public int tamano() {
		return tamano;
	}

	@Override
	public int recivirReparacion(Reparacion reparacion) {
		return reparacion.reparar(this);

	}

}