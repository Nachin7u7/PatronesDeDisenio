package MVC;

public class Cliente {

	public static void main(String[] args) {
		Intern model = retriveInternFromDatabase();
		InternView view = new InternView();
		InternController controller = new InternController(model, view);
		controller.updateView();
		controller.setInternName("Messi");
		controller.updateView();
	}

	public static Intern retriveInternFromDatabase() {
		Intern intern = new Intern();
		intern.setName("Juan");
		intern.setLastname("Perez");
		return intern;
	}
}
