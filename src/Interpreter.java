import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Interpreter extends Expresion {

	private List<Expresion> parseTree = new ArrayList<>();
	private Contexto contexto;

	public Interpreter(String word) {
		this.interpretecion(word);
	}

	public void interpretecion(String words) {
		String input = words;
		contexto = new Contexto(input.replace(" ", ""));
		for (String word : (input.split(" "))){
			int numero = Integer.parseInt(word);
			if (numero <= 3) {
				parseTree.add(new Num1());
			} else if (numero <= 8) {
				parseTree.add(new Num5());
			} else if (numero <= 10) {
				parseTree.add(new Num10());
			}

		}
	}

	public String interpretar() {
		for (Expresion terminalExpresion : parseTree) {
			terminalExpresion.interpreter(contexto);
		}
		return contexto.output;
	}

	public void interpreter(Contexto contexto) {

	}
}
