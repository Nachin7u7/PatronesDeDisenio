package pizzeriaBuilder;

public class Director {
	protected Builder builder;

	public Pizza getPizza() {
		return builder.getPizza();
	}

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}

	public void buildPizza(Builder.pizzas p) {

		switch (p) {
		case PizzaCarnivora: {
			this.builder.crear(Builder.pizzas.PizzaCarnivora);
			this.builder.buildIngredientes();
			this.builder.buildTipoMasa();
			this.builder.buildTipoQueso();
		}
		case PizzaClasica: {
			this.builder.crear(Builder.pizzas.PizzaClasica);
			this.builder.buildIngredientes();
			this.builder.buildTipoMasa();
			this.builder.buildTipoQueso();
		}
		case PizzaHawaiana: {
			this.builder.crear(Builder.pizzas.PizzaHawaiana);
			this.builder.buildIngredientes();
			this.builder.buildTipoMasa();
			this.builder.buildTipoQueso();
		}
		}
	}
}
