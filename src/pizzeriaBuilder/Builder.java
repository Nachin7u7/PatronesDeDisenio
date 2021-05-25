package pizzeriaBuilder;

public abstract class Builder {

	public Pizza pizza;

	enum pizzas {
		PizzaHawaiana, PizzaClasica, PizzaCarnivora
	}

	public void crear(pizzas p) {
		switch (p) {
		case PizzaHawaiana: {
			pizza = new PizzaHawaiana();
		}
		case PizzaCarnivora: {
			pizza = new PizzaCarnivora();
		}
		case PizzaClasica: {
			pizza = (Pizza) new PizzaClasica();
		}
		default:
			pizza = new Pizza();
		}
	}

	public Pizza getPizza() {
		return pizza;
	}

	public abstract void buildIngredientes();

	public abstract void buildTipoMasa();

	public abstract void buildTipoQueso();

}
