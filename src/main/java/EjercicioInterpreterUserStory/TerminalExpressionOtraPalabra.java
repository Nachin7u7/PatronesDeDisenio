package EjercicioInterpreterUserStory;

public class TerminalExpressionOtraPalabra extends AbstractExpression{
	
	@Override
	public void interpreter(ContextStory context, int numeroDeLetras) {
		
		context.output = context.output + context.input.substring(0, numeroDeLetras) + " ";
		context.input = context.input.substring(numeroDeLetras);
	}


}