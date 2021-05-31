
public class Singleton4 {

	private static Singleton4 instancia = null;

	private Singleton4() {
		System.out.println("Accediendo a notas Estudiante 4...");
	}

	public static Singleton4 getInstance() {
		if (instancia == null)
			instancia = new Singleton4();
		return instancia;
	}

	public void print() {
		System.out.println("	NOTAS:");
		System.out.println("MATEMATICAS: 95");
		System.out.println("LITERATURA: 70");
		System.out.println("ARTES: 100");
		System.out.println("SOCIALES: 70");
	}

	public void restartInstancia() {
		instancia = null;
	}

}
