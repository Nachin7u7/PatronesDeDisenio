package ejercicioBridge;

public class PagoApp implements Pago {

	@Override
	public void pagar(double monto) {
		System.out.println("Pagando por aplicacion...");
		System.out.println("monto: " + monto * 0.9);
	}

}
