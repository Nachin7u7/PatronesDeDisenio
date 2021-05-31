
public class Singleton1 {

	private static Singleton1 instancia = null;

	private Singleton1() {
		System.out.println("Accediendo a notas Estudiante 1...");
	}

	public static Singleton1 getInstance() { // Singleton1.getInstance().print() <- Singleton1 s = Singleton1.getInstance(); s.print()
		if (instancia == null)
			instancia = new Singleton1();
		return instancia;
	}
	
	public void print() {
		System.out.println("	NOTAS:");
		System.out.println("MATEMATICAS: 95");
		System.out.println("LITERATURA: 80");
		System.out.println("ARTES: 60");
		System.out.println("SOCIALES: 70");
	}

	public void restartInstancia() {
		instancia = null;
	}
	
}
