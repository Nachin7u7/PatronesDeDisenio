
public class Cliente1 {
	
//	En un colegio de La ciudad de la Paz se desea implementar un sistema para
//	el control de notas, se desea tener una única ventanilla de pago de matrícula para evitar
//	problemas con los montos económicos, la primera vez que llega el cajero se debe introducir su
//	código de cajero para que todos sepan quien esta encargado en la ventanilla y se puede
//	consultar cuánto dinero existe en la ventanilla cuando se lo requiera. 5 estudiantes deben pagar
//	en ventanilla.

	public static void main(String[] args) {
//		Singleton1.getInstance();
		
		
		Singleton1.getInstance().print();

		Singleton1.getInstance().restartInstancia();

	}
}
