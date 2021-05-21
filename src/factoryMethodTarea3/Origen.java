package factoryMethodTarea3;

public class Origen {

	private String pais;
	private String ciudad;
	private String aeropuerto;
	
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getAeropuerto() {
		return aeropuerto;
	}
	public void setAeropuerto(String aeropuerto) {
		this.aeropuerto = aeropuerto;
	}
	
	public void showInfo() {
		System.out.println("pais: "+pais);
		System.out.println("ciudad: "+ciudad);
		System.out.println("aeropuerto: "+aeropuerto);
	}
}
