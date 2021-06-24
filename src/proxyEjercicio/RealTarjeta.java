package proxyEjercicio;

public class RealTarjeta implements ITarjeta {

	public RealTarjeta(TarjetaDebito tarjeta) {
		super();
		this.tarjeta = tarjeta;
	}

	TarjetaDebito tarjeta;

	public TarjetaDebito getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(TarjetaDebito tarjeta) {
		this.tarjeta = tarjeta;
	}

	@Override
	public void comprar(double monto, String moneda) {
		if (moneda.equals("bolivianos")) {
			tarjeta.comprar(monto, moneda);
		} else if (moneda.equals("dolares")) {
			tarjeta.comprar((monto * 6.96), "bolivianos");
		} else if (moneda.equals("euros")) {
			tarjeta.comprar((monto * 8.23), "bolivianos");
		} else {
			System.out.println("Error en el tipo de moneda ingresada");
		}

	}

	@Override
	public void ingresarFondos(double monto, String moneda) {
		if (moneda.equals("bolivianos")) {
			tarjeta.ingresarFondos(monto, moneda);
		} else if (moneda.equals("dolares")) {
			tarjeta.ingresarFondos((monto * 6.96), "bolivianos");
		} else if (moneda.equals("euros")) {
			tarjeta.ingresarFondos((monto * 8.23), "bolivianos");
		} else {
			System.out.println("Error en el tipo de moneda ingresada");
		}
	}

}
