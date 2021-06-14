package ejercicio1;

public class Tesis {

	public Tesis(String fecha, String contenido) {
		this.fecha = fecha;
		this.contenido = contenido;
	}

	String fecha;
	String contenido;

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public void show() {

		System.out.println("Fecha: " + fecha);
		System.out.println("Contenido: " + contenido);

	}

}
