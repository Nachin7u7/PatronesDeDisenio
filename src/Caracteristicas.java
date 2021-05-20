
public class Caracteristicas {

	private String tamanio;
	private String cpu;
	private String memory;
	private String sim;
	private long number;
	private String versionAndroid;
	private String camara;
	private String bluetoo;
	private int cantidadDeMemoriasExternas;
	private String tipoBateria;
	private boolean accesorios[] = new boolean[3];

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public void setNumero(long number) {
		this.number = number;
	}

	void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public void setSim(String sim) {
		this.sim = sim;
	}

	public void setVersionAndroid(String versionAndroid) {
		this.versionAndroid = versionAndroid;
	}

	public void setCamara(String camara) {
		this.camara = camara;
	}

	public void setBluetoo(String bluetoo) {
		this.bluetoo = bluetoo;
	}

	public void setCantidadDeMemoriasExternas(int cantidadDeMemoriasExternas) {
		this.cantidadDeMemoriasExternas = cantidadDeMemoriasExternas;
	}

	public void setTipoBateria(String tipoBateria) {
		this.tipoBateria = tipoBateria;
	}

	public void setAccesorios(boolean accesorios[]) {
		this.accesorios = accesorios;
	}

	public String getTamanio() {
		System.out.println(tamanio);
		return tamanio;
	}

	public String getCpu() {
		System.out.println(cpu);
		return cpu;
	}

	public String getMemory() {
		System.out.println(memory);
		return memory;
	}

	public String getSim() {
		System.out.println(sim);
		return sim;
	}

	public String getVersionAndroid() {
		System.out.println(versionAndroid);
		return versionAndroid;
	}

	public String getCamara() {
		System.out.println(camara);
		return camara;
	}

	public String getBluetoo() {
		System.out.println(bluetoo);
		return bluetoo;
	}

	public long getNumero() {
		System.out.println(number);
		return number;
	}

	public int getCantidadDeMemoriasExternas() {
		System.out.println(cantidadDeMemoriasExternas);
		return cantidadDeMemoriasExternas;
	}

	public String getTipoBateria() {
		System.out.println(tipoBateria);
		return tipoBateria;
	}

	public boolean[] getAccesorios() {
		System.out.println(accesorios);
		return accesorios;
	}

	@Override
	public Object clone() {
		Caracteristicas clon = new Caracteristicas();
		clon.setTamanio(this.tamanio);
		clon.setCpu(this.cpu);
		clon.setMemory(this.memory);
		clon.setSim((this.sim));
		clon.setVersionAndroid(this.versionAndroid);
		clon.setCamara(this.camara);
		clon.setBluetoo(this.bluetoo);
		clon.setCantidadDeMemoriasExternas(this.cantidadDeMemoriasExternas);
		clon.setTipoBateria(this.tipoBateria);
		clon.setAccesorios(this.accesorios);
		return clon;
	}

}
