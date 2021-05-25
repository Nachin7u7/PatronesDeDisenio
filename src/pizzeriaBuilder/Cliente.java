package pizzeriaBuilder;

//	Se tiene un restaurante que se encarga de la preparacion de pizzas, las pizzas tienes
//	atributos comunes como ser ingredientes, tipoMasa,  tipoQueso.
//
//	Se tienes distintos tipos de pizzas
//
//	* Pizza Carnivora
//	  ingredientes = carne, salsa tomate, otro.
// 	  tipoMasa= masa especial <- predeterminado
// 	  tipoQueso= quezo mozarella <- predeterminado 
//
//	* Pizza Hawaina
// 	 ingredientes = pina, salsa tomate, otro.
// 	 tipoMasa= masa normal<- predeterminado
// 	 tipoQueso= quezo mozarella tipo2<- predeterminado
//
//	* Pizza Clasica
//
// 	 ingredientes = salsa tomate, otro.
// 	 tipoMasa= masa especial
// 	 tipoQueso= doble quezo mozarella tipo2<- predeterminado

public class Cliente {

	public static void main(String[] args) {

		Director director = new Director();
		BuilderPizzaC carni = new BuilderPizzaC();
		BuilderPizzaClasica clasica = new BuilderPizzaClasica();
		BuilderPizzaH hawaiana = new BuilderPizzaH();

		//CREACION DE CADA UNA PIZZA POR CADA UNA
		
		director.setBuilder(hawaiana);
		director.buildPizza(Builder.pizzas.PizzaHawaiana);
		System.out.println("HAWAIANA:");
		Pizza pizzaH = director.getPizza();
		pizzaH.show();
		System.out.println("");
		
		director.setBuilder(clasica);
		director.buildPizza(Builder.pizzas.PizzaClasica);
		System.out.println("CLASICA:");
		Pizza pizzaClasi = director.getPizza();
		pizzaClasi.show();
		System.out.println("");
		
		director.setBuilder(carni);
		director.buildPizza(Builder.pizzas.PizzaCarnivora);
		System.out.println("CARNIVORA:");
		Pizza pizzaC = director.getPizza();
		pizzaC.show();
		System.out.println("");

	}
}
