package EjercicioInterpreterUserStory;


public class Cliente {

	public static void main(String[] args) {
		String entrada = "Como administrador Quiero generar un reporte diario Para evaluar las ganancias";

		InterpreterStory interpreterOperaciones = new InterpreterStory(entrada);
		System.out.println(entrada);
		System.out.println(interpreterOperaciones.interpretar());
	}

}
