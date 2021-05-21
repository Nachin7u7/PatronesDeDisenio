package factoryMethodTarea3;

public class PasajeStandart implements  Pasaje {

	private String numeroVuelo;
	private Destino destino;
	private Origen origen;
	private Avion avion;
	private Pasajero pasajero;
	private String numeroAsiento;
	private String costoPasaje;

	public PasajeStandart() {
		destino = new Destino();
		origen = new Origen();
		avion = new Avion();
		pasajero = new Pasajero();
	}

	@Override
	public void create() {
		System.out.println("Pasaje Estandar, avion: " + avion);
		System.out.println("Pasaje Estandar, pasajero: " + pasajero);
		System.out.println("Pasaje Estandar, destino: " + destino);
		System.out.println("Pasaje Estandar, origen: " + origen);
		destino.showInfo();
		origen.showInfo();
		avion.showInfo();
		pasajero.showInfo();

	}

	public String getNumeroVuelo() {
		return numeroVuelo;
	}

	public void setNumeroVuelo(String numeroVuelo) {
		this.numeroVuelo = numeroVuelo;
	}

	public Destino getDestino() {
		return destino;
	}

	public void setDestino(Destino destino) {
		this.destino = destino;
	}

	public Origen getOrigen() {
		return origen;
	}

	public void setOrigen(Origen origen) {
		this.origen = origen;
	}

	public Pasajero getPasajero() {
		return pasajero;
	}

	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public String getNumeroAsiento() {
		return numeroAsiento;
	}

	public void setNumeroAsiento(String numeroAsiento) {
		this.numeroAsiento = numeroAsiento;
	}

	public String getCostoPasaje() {
		return costoPasaje;
	}

	public void setCostoPasaje(String costoPasaje) {
		this.costoPasaje = costoPasaje;
	}
}
