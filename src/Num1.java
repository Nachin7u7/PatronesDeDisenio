
public class Num1 extends Expresion {
	@Override
	public void interpreter(Contexto contexto) {
		int r = Integer.parseInt(contexto.input.substring(0, 1));
		for (int i = 0; i < r; i++) {
			contexto.output = contexto.output + "I";
		}
		contexto.output = contexto.output + " ";
		contexto.input = contexto.input.substring(1);
	}
}
