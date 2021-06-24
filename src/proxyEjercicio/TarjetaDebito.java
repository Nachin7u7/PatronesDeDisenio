package proxyEjercicio;

public class TarjetaDebito implements ITarjeta {

	public TarjetaDebito(double ahorro) {
		super();
		this.ahorro = ahorro;
	}

	double ahorro;

	public double getAhorro() {
		return ahorro;
	}

	public void setAhorro(double ahorro) {
		this.ahorro = ahorro;
	}

	@Override
	public void comprar(double monto, String moneda) {
		if (ahorro > monto) {
			System.out.println("Ahorro:" + ahorro);
			System.out.println("Comprando...");
			ahorro -= monto;
			System.out.println("Saldo: " + ahorro);
		} else {
			System.out.println("Saldo insuficiente");
		}
	}

	@Override
	public void ingresarFondos(double monto, String moneda) {
		ahorro += monto;
		System.out.println("Saldo: " + ahorro);
	}

}
