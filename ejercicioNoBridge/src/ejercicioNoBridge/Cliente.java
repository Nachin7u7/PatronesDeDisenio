package ejercicioNoBridge;

public class Cliente {

	public static void main(String[] args) {

		Plataforma sistema = new Windows7x64();
		sistema.show();
		sistema = new Windows7x86();
		sistema.show();
		sistema = new Linuxx64();
		sistema.show();
		sistema = new Linuxx86();
		sistema.show();

	}
}
