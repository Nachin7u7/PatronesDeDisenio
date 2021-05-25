package pizzeriaBuilder;
//

//* Pizza Hawaina
//ingredientes = pina, salsa tomate, otro.
//tipoMasa= masa normal
//tipoQueso= quezo mozarella tipo2

public class BuilderPizzaH extends Builder {

	@Override
	public void buildIngredientes() {
		pizza.setIngredientes("Pina, salsa tomate, otro.");

	}

	@Override
	public void buildTipoMasa() {
		pizza.setTipoMasa("Masa normal");

	}

	@Override
	public void buildTipoQueso() {
		pizza.setTipoQueso("Queso mozarella tipo2");

	}

}
