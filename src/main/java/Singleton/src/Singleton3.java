
public class Singleton3 {

	private static Singleton3 instancia = null;

	private Singleton3() {
		System.out.println("Accediendo a notas Estudiante 3...");
	}

	public static Singleton3 getInstance() {
		if (instancia == null)
			instancia = new Singleton3();
		return instancia;
	}

	public void print() {
		System.out.println("	NOTAS:");
		System.out.println("MATEMATICAS: 86");
		System.out.println("LITERATURA: 70");
		System.out.println("ARTES: 75");
		System.out.println("SOCIALES: 100");
	}

	public void restartInstancia() {
		instancia = null;
	}

}
