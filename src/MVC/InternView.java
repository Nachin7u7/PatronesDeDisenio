package MVC;

//VISTA

public class InternView {
	public void printInternDetails(String internName, String internLastname) {
		System.out.println();
		System.out.println("**** Intern: ****");
		System.out.println("Nombre: " + internName);
		System.out.println("Apellido: " + internLastname);
	}
}