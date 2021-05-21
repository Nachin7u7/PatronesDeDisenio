package factoryMethodTarea3;

public class Avion {

	private String marca;
	private String capacidad;
	private String modelo;
	private String numeroAsientos;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getNumeroAsientos() {
		return numeroAsientos;
	}

	public void setNumeroAsientos(String numeroAsientos) {
		this.numeroAsientos = numeroAsientos;
	}

	public void showInfo() {
		System.out.println("marca: " + marca);
		System.out.println("numero de asientos: " + numeroAsientos);
		System.out.println("capacidad: " + capacidad);
		System.out.println("modelo: " + modelo);
	}

}
