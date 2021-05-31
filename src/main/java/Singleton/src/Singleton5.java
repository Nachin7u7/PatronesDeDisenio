
public class Singleton5 {

	private static Singleton5 instancia = null;

	private Singleton5() {
		System.out.println("Accediendo a notas Estudiante 5...");
	}

	public static Singleton5 getInstance() {
		if (instancia == null)
			instancia = new Singleton5();
		return instancia;
	}

	public void print() {
		System.out.println("	NOTAS:");
		System.out.println("MATEMATICAS: 40");
		System.out.println("LITERATURA: 80");
		System.out.println("ARTES: 60");
		System.out.println("SOCIALES: 70");
	}

	public void restartInstancia() {
		instancia = null;
	}

}
