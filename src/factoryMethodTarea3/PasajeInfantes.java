package factoryMethodTarea3;

public class PasajeInfantes implements Pasaje {

	private String numeroVuelo;
	private Destino destino;
	private Origen origen;
	private Avion avion;
	private Pasajero pasajero;
	private String numeroAsiento;
	private String costoEspecial;

	public PasajeInfantes() {

		destino = new Destino();
		origen = new Origen();
		avion = new Avion();
		pasajero = new Pasajero();
	}

	@Override
	public void create() {
		System.out.println("Pasaje Infantes, avion: " + avion);
		System.out.println("Pasaje Infantes, pasajero:" + pasajero);
		System.out.println("Pasaje Infantes, destino: " + destino);
		System.out.println("Pasaje Infantes, origen: " + origen);
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

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public Pasajero getPasajero() {
		return pasajero;
	}

	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}

	public String getNumeroAsiento() {
		return numeroAsiento;
	}

	public void setNumeroAsiento(String numeroAsiento) {
		this.numeroAsiento = numeroAsiento;
	}

	public String getCostoEspecial() {
		return costoEspecial;
	}

	public void setCostoEspecial(String costoEspecial) {
		this.costoEspecial = costoEspecial;
	}

}
