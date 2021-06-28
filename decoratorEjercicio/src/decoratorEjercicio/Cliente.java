package decoratorEjercicio;

//		(Decorator) Se tiene el juego de mundo warcraft donde creamos un personaje con

//		caracter�sticas b�sicas como ser : nombre, nivel, armas, porcentaje de armadura,
//		puntos ataque, puntos de defensa, puntos de regeneraci�n de vida. cuando se crea a
//		este personaje los puntos y porcentaje de armadura inician en 1%, necesitamos agregar
//		nuevas habilidades cuando el personaje va subiendo de nivel, cuando se le agrega al
//		personaje un arma (espada, hacha, escopeta) su puntos de ataque suben en un 30% y
//		su nivel se incrementa al doble, cuando se agrega un escudo sus puntos de defensa
//		crecen un 35% y su porcentaje de armadura crece en un 10%, cuando se agregan
//		posiciones de curaci�n sus puntos de regeneraci�n suben aun 80%.

public class Cliente {

	public static void main(String[] args) {

		Component pj = new Personaje("Nachin", null, 0, 1, 1, 1, 1);
		pj.show();

		pj = new MejoraArmar(pj, "Espada");
		pj.show();

		pj = new MejorasEscudo(pj);
		pj.show();

		pj = new MejorasPocion(pj);
		pj.show();

	}

}
