package test;

public class Apagado implements IState {

	@Override
	public void handler(Computadora computadora) {
		System.out.println("***APAGADO***");
		computadora.setProgramas(0);
		computadora.show();
	}

}