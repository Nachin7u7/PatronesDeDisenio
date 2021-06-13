package test;

public class Reiniciar implements IState {

	@Override
	public void handler(Computadora computadora) {
		System.out.println("***REINICIANDO***");
		computadora.setProgramas(0);
		computadora.show();
	}

}
