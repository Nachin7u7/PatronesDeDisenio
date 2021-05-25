package pizzeriaBuilder;

public class BuilderPizzaClasica extends Builder {

	@Override
	public void buildIngredientes() {
		pizza.setIngredientes("Salsa tomate, otro.");

	}

	@Override
	public void buildTipoMasa() {
		pizza.setTipoMasa("Masa especial");

	}

	@Override
	public void buildTipoQueso() {
		pizza.setTipoQueso("Doble quezo mozarella tipo2");

	}

}
