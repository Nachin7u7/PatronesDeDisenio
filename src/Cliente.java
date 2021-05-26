
public class Cliente {

	public static void main(String[] args) {

		String input1 = "1 2 3 4 5 6 7 8 9 10 ";
		String input2 = "7 8 2 3 9 10 1";
		String input3 = "6 5 4 3 2 1";

		Interpreter interpreter = new Interpreter(input1);
		System.out.println("ejemplo 1 : " + interpreter.interpretar());

		Interpreter interpreter1 = new Interpreter(input2);
		System.out.println("ejemplo 2 : " + interpreter1.interpretar());

		Interpreter interpreter2 = new Interpreter(input3);
		System.out.println("ejemplo 2 : " + interpreter2.interpretar());

	}

}
