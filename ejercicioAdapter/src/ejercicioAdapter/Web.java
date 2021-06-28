package ejercicioAdapter;

public class Web implements Empresa2 {

	@Override
	public void iniciarSesion() {
		System.out.println("Login en web");
	}

	@Override
	public void cerrarSesion() {
		System.out.println("Logout en web");
	}

	@Override
	public void generarDatos() {
		System.out.println("generando datos en web");
	}
}