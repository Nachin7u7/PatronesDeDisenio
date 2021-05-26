
public class Num5 extends Expresion {
	@Override
	public void interpreter(Contexto contexto) {
		int x = Integer.parseInt(contexto.input.substring(0, 1));
		if (x == 4) {
			contexto.output = contexto.output + "IV";
		} else {
			contexto.output = contexto.output + "V";
			for (int i = 0; i < x - 5; i++) {
				contexto.output = contexto.output + "I";
			}
		}
		contexto.output = contexto.output + " ";
		contexto.input = contexto.input.substring(1);
	}
}
