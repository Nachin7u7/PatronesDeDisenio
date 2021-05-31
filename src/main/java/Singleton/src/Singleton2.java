
public class Singleton2 {

	private static Singleton2 instancia = null;

	private Singleton2() {
		System.out.println("Accediendo a notas Estudiante 2...");
	}

	public static Singleton2 getInstance() {
		if (instancia == null)
			instancia = new Singleton2();
		return instancia;
	}

	public void print() {
		System.out.println("	NOTAS:");
		System.out.println("MATEMATICAS: 85");
		System.out.println("LITERATURA: 70");
		System.out.println("ARTES: 90");
		System.out.println("SOCIALES: 70");
	}

	public void restartInstancia() {
		instancia = null;
	}

}
