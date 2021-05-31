
public class Mochila {
//	mochila (numero bolsillos, tamaño),
	private String bolsillos;
	private String tamano;

	public Mochila(String bolsillos, String tamano) {
		this.bolsillos = bolsillos;
		this.tamano = tamano;
	}

	public void getMochila() {
		System.out.println("Numero de bolsillos:" + bolsillos);
		System.out.println("Tamanio:" + tamano);

	}
}
