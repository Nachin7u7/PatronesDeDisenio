package ejercicioBridge;

public class Paquete implements Implementor {

	IAbstraction implementor;

	public Paquete(double precio, String nombreDelPaquete, IAbstraction implementor) {
		super();
		this.precio = precio;
		this.nombreDelPaquete = nombreDelPaquete;
		this.implementor = implementor;
	}

	double precio;
	String nombreDelPaquete;

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNombreDelPaquete() {
		return nombreDelPaquete;
	}

	public void setNombreDelPaquete(String nombreDelPaquete) {
		this.nombreDelPaquete = nombreDelPaquete;
	}

	@Override
	public void tipoDeEnvio(Implementor.envio envio) {

		implementor.tipoDeEnvio();

		if (envio == Implementor.envio.Aire) {
			precio = precio + (precio * 0.1);
		} else if (envio == Implementor.envio.Tierra) {
			precio = precio + (precio * 0.05);
		} else {
			precio = precio + (precio * 0.25);
		}

		System.out.println("Costo del envio: " + precio);
		System.out.println("Nombre del paquete: " + nombreDelPaquete);
	}

}
