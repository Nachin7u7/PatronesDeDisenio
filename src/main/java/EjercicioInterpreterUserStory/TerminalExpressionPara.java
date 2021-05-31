package EjercicioInterpreterUserStory;

public class TerminalExpressionPara extends AbstractExpression {

	@Override
	public void interpreter(ContextStory context,int numeroDeLetras) {

		context.output = context.output + "Then ";
		context.input = context.input.substring(4);
	}
}