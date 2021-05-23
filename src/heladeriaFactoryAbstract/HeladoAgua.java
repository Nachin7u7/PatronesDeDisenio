package heladeriaFactoryAbstract;

public class HeladoAgua extends Helado {
	public String tamanio;
	public String forma;
	public Fruta fruta;
	public Base base;

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public Fruta getFruta() {
		return fruta;
	}

	public void setFruta(Fruta fruta) {
		this.fruta = fruta;
	}

	public Base getBase() {
		return base;
	}

	public void setBase(Base base) {
		this.base = base;
	}

	public HeladoAgua() {

		fruta = new Fruta();
		base = new Base();

	}

	@Override
	public void crear() {
		System.out.println("Tamanio helado mixto: " + tamanio);
		System.out.println("Forma helado mixto: " + forma);

		System.out.println("Nombre Base :" + base.getNombre());
		System.out.println("Tamanio Base :" + base.getTamanio());
		System.out.println("Tipo Base :" + base.getTipo());
		System.out.println("Costo Base :" + base.getCosto());

		System.out.println("Tipo de Fruta : " + fruta.getTipoFruta());
		System.out.println("nomrbe Fruta : " + fruta.getNombre());
		System.out.println("nomrbe costo : " + fruta.getCosto());
		System.out.println("nomrbe tamano : " + fruta.getTamanio());
	}

}
