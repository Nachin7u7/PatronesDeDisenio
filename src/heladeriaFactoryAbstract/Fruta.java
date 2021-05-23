package heladeriaFactoryAbstract;

//(tipoFruta, nombre , costo, tamano)
public class Fruta {
	public Fruta() {
		super();
	}

	public String tipoFruta;
	public String nombre;
	public String costo;
	public String tamanio;

	public String getTipoFruta() {
		return tipoFruta;
	}

	public void setTipoFruta(String tipoFruta) {
		this.tipoFruta = tipoFruta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCosto() {
		return costo;
	}

	public void setCosto(String costo) {
		this.costo = costo;
	}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

}
