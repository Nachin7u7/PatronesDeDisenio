package factoryMethodTarea3;

public class PasajeSolidario implements Pasaje {

	private String numeroVuelo;
	private Destino destino;
	private Origen origen;
	private Avion avion;
	private Pasajero pasajero;
	private String numeroAsiento;
	private String costoPasaje;
	private String descuento;
	private String MotivoDescuento;

	public PasajeSolidario() {
		destino = new Destino();
		origen = new Origen();
		avion = new Avion();
		pasajero = new Pasajero();
	}

	@Override
	public void create() {
		System.out.println("Pasaje Solidario, avion: " + avion);
		System.out.println("Pasaje Solidario, pasajero: " + pasajero);
		System.out.println("Pasaje Solidario, destino: " + destino);
		System.out.println("Pasaje Solidario, origen: " + origen);
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

	public String getNumeroAsiento() {
		return numeroAsiento;
	}

	public void setNumeroAsiento(String numeroAsiento) {
		this.numeroAsiento = numeroAsiento;
	}

	public Pasajero getPasajero() {
		return pasajero;
	}

	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}

	public String getCostoPasaje() {
		return costoPasaje;
	}

	public void setCostoPasaje(String costoPasaje) {
		this.costoPasaje = costoPasaje;
	}

	public String getMotivoDescuento() {
		return MotivoDescuento;
	}

	public void setMotivoDescuento(String motivoDescuento) {
		MotivoDescuento = motivoDescuento;
	}

	public String getDescuento() {
		return descuento;
	}

	public void setDescuento(String descuento) {
		this.descuento = descuento;
	}
}
