
//	Se debe crear kit de utilies escolares donde existen 2 tipos de kit,
//	kit_escolar y kit_colegial, donde kit_Ecolar cuenta con mochila (numero bolsillos, tamaño),
//	deportivo (talla, color, número de prendas), cuadernos(tipo, #hojas) y el kit_colegial cuenta con
//	mochila(numero bolsillos, tamano), libros(tipo, autor), computadora(marca, os).

//k 1 -> mochila, deportivo, cuadernos
//k 2 -> mochila, libros, computadora    			
public class Cliente {

	public static void main(String[] args) {

		System.out.println("Kit Colegial:");
		CreatorKitColegial colegial = new CreatorKitColegial();
		colegial.create().create();

		System.out.println("Kit Escolar:");
		CreatorKitEscolar escolar = new CreatorKitEscolar();
		escolar.create().create();

	}
}
