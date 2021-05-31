package traduccionInterpreter;

//Una Empresa de software con grandes aspiraciones de crecimiento compra empresas de
//emprendimiento más pequeñas y decide unir a todos los empleados en una sola lista de tipo
//HashMap, pero cada empresa adquirida maneja de forma diferente la lista de sus empleados,
//La 1ra empresa adquirida utiliza el objeto List , La 2da utiliza arrays [] , La 3ra utiliza el objeto
//Vector y la 4ta utiliza el objeto Stack .

public class Cliente { // HashMap<tuple<list,arreat>, tuple<vector, stack>>

	public static void main(String[] args) {

		Lista1 lista1 = new Lista1();
		lista1.add("Juan");
		lista1.add("Pedro");
		lista1.add("Jose");
		lista1.add("Pablo");
		lista1.add("Jorge");

		Lista2 lista2 = new Lista2();
		lista2.add("Andrea");
		lista2.add("Ana");
		lista2.add("Teresa");
		lista2.add("Alejandra");
		lista2.add("Josue");

		Lista3 lista3 = new Lista3();
		lista3.add("Chris");
		lista3.add("Fernando");
		lista3.add("German");
		lista3.add("Alejandro");
		lista3.add("Patricia");

		Lista4 lista4 = new Lista4();
		lista4.add("Andres");
		lista4.add("Joaquin");
		lista4.add("Ignacio");
		lista4.add("Anahi");
		lista4.add("Messi");

		Iterator iterator = lista1.iterator();

		while (iterator.hasNext()) {
			System.out.println("Nombre Lista: " + iterator.next());
		}

		iterator = lista2.iterator();
		while (iterator.hasNext()) {
			System.out.println("Nombre Array: " + iterator.next());
		}

		iterator = lista3.iterator();
		while (iterator.hasNext()) {
			System.out.println("Nombre Vector: " + iterator.next());
		}

		iterator = lista4.iterator();
		while (iterator.hasNext()) {
			System.out.println("Nombre Stack: " + iterator.next());
		}
	}
}
