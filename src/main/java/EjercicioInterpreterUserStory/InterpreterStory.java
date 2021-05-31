package EjercicioInterpreterUserStory;

import java.util.ArrayList;
import java.util.List;

public class InterpreterStory extends AbstractExpression {

	private List<AbstractExpression> parseTree = new ArrayList<>();
	private ContextStory context;
	private List<Integer> parseTreeListaDeLargo = new ArrayList<>();

	public InterpreterStory(String word) {
		this.interpretecion(word);
	}

	public void interpretecion(String words) {
		String input = words;
		context = new ContextStory(input.replace(" ", ""));
		for (String word : input.split(" ")) {
			if (word.startsWith("Como")) {
				parseTree.add(new TerminalExpressionComo());
				parseTreeListaDeLargo.add(4);
			} else if (word.startsWith("Quiero")) {
				parseTree.add(new TerminalExpressionQuiero());
				parseTreeListaDeLargo.add(6);
			} else if (word.startsWith("Para")) {
				parseTree.add(new TerminalExpressionPara());
				parseTreeListaDeLargo.add(4);
			} else {
				parseTree.add(new TerminalExpressionOtraPalabra());
				parseTreeListaDeLargo.add(word.length());
			}

		}
	}

	public String interpretar() {
		int recorrido = 0;
		for (AbstractExpression terminalExpresion : parseTree) {
			terminalExpresion.interpreter(context,parseTreeListaDeLargo.get(recorrido));
			recorrido++;
		}
		return context.output;
	}

	@Override
	public void interpreter(ContextStory context, int numeroDeLetras) {
		// TODO Auto-generated method stub

	}

}
