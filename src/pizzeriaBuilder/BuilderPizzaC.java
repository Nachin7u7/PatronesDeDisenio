package pizzeriaBuilder;

public class BuilderPizzaC extends Builder {

	@Override
	public void buildIngredientes() {
		pizza.setIngredientes("Carne, salsa tomate, otro.");

	}

	@Override
	public void buildTipoMasa() {
		pizza.setTipoMasa("Masa especial");

	}

	@Override
	public void buildTipoQueso() {
		pizza.setTipoQueso("Queso mozarella");
	}

}
