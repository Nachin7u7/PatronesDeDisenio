package EjercicioInterpreterUserStory;


public class TerminalExpressionComo extends AbstractExpression{
	
	@Override
	public void interpreter(ContextStory context,int numeroDeLetras) {
		
		context.output = context.output + "Given ";
		context.input = context.input.substring(4);
	}


}
