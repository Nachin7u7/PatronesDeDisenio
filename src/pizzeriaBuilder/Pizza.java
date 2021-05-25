package pizzeriaBuilder;

public class Pizza {

	public Pizza() {
	}

	public String ingredientes;
	public String tipoMasa;
	public String tipoQueso;

	public String getTipoMasa() {
		return tipoMasa;
	}

	public void setTipoMasa(String tipoMasa) {
		this.tipoMasa = tipoMasa;
	}

	public String getTipoQueso() {
		return tipoQueso;
	}

	public void setTipoQueso(String tipoQueso) {
		this.tipoQueso = tipoQueso;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public void show() {
		System.out.println("Ingredientes: " + ingredientes);
		System.out.println("Tipo de masa: " + tipoMasa);
		System.out.println("Tipo de queso: " + tipoQueso);
	}

}
