
public class LibreCambista {
	public double DtoB(double monto) {
		Cambiar cambio = new Cambiar();
		double total = cambio.cambiar(monto, 0);
		System.out.println("Cambio de libre cambista: " + total);
		return total;

	}

	public double BtoD(double monto) {
		Cambiar cambio = new Cambiar();
		double total = cambio.cambiar(monto, 1);
		System.out.println("Cambio de libre cambista: " + total);
		return total;
	}

	public double EtoB(double monto) {
		Cambiar cambio = new Cambiar();
		double total = cambio.cambiar(monto, 2);
		System.out.println("Cambio de libre cambista: " + total);
		return total;
	}

	public double BtoE(double monto) {
		Cambiar cambio = new Cambiar();
		double total = cambio.cambiar(monto, 3);
		System.out.println("Cambio de libre cambista: " + total);
		return total;
	}

	public double EtoD(double monto) {
		Cambiar cambio = new Cambiar();
		double total = cambio.cambiar(monto, 4);
		System.out.println("Cambio de libre cambista: " + total);
		return total;
	}

	public double DtoE(double monto) {
		Cambiar cambio = new Cambiar();
		double total = cambio.cambiar(monto, 5);
		System.out.println("Cambio de libre cambista: " + total);
		return total;
	}
}
