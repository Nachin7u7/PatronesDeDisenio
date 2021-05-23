package heladeriaFactoryAbstract;

public class HeladoMixto extends Helado {
	public String tamanio;
	public String forma;
	public String costo;
	public Fruta fruta;
	public Base base;
	public Crema crema;

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

	public String getCosto() {
		return costo;
	}

	public void setCosto(String costo) {
		this.costo = costo;
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

	public Crema getCrema() {
		return crema;
	}

	public void setCrema(Crema crema) {
		this.crema = crema;
	}

	public HeladoMixto() {

		fruta = new Fruta();
		base = new Base();
		crema = new Crema();
	}

	@Override
	public void crear() {
		System.out.println("Tamanio helado mixto: " + tamanio);
		System.out.println("Forma helado mixto: " + forma);
		System.out.println("Costo helado mixto: " + costo);
		
		System.out.println("Sabor Crema :" + crema.getSabor());
		System.out.println("Costo Crema :" + crema.getCosto());
		System.out.println("Marca Crema :" + crema.getMarca());

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
