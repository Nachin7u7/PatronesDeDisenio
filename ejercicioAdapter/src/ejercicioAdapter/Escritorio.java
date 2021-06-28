package ejercicioAdapter;

public class Escritorio implements Empresa2 {

	@Override
	public void iniciarSesion() {
		System.out.println("Login en escritorio");
	}

	@Override
	public void cerrarSesion() {
		System.out.println("Logout en escritorio");
	}

	@Override
	public void generarDatos() {
		System.out.println("generando datos en escritorio");
	}
}