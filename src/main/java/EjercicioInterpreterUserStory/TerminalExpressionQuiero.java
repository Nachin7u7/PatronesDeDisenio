package EjercicioInterpreterUserStory;

public class TerminalExpressionQuiero extends AbstractExpression {

	@Override
	public void interpreter(ContextStory context,int numeroDeLetras) {

		context.output = context.output + "When ";
		context.input = context.input.substring(6);
	}
}