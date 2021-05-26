
public class Num10 extends Expresion {

	@Override
	public void interpreter(Contexto contexto) {
		int x = Integer.parseInt(contexto.input.substring(0, 1));
		if (x == 9) {
			contexto.output = contexto.output + "IX";
		} else {
			contexto.input = contexto.input.substring(1);
			contexto.output = contexto.output + "X";

		}
		contexto.output = contexto.output + " ";
	}

}
