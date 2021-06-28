package ejercicioBridge;

public class InstalacionAgua implements IEmpresa {
	String nombre;
	double precio;
	Pago pago;

	public InstalacionAgua(String nombre, double precio, Pago pago) {
		this.nombre = nombre;
		this.precio = precio;
		this.pago = pago;
	}

	@Override
	public void pago() {
		pago.pagar(precio);
	}
}
