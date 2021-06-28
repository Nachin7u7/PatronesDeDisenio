package ejercicioBridge;

public class PagoEfectivo implements Pago {

	@Override
	public void pagar(double monto) {
		System.out.println("Pagando por efectivo...");
		System.out.println("monto: " + monto);
	}

}
