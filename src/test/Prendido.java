package test;

public class Prendido implements IState {

	int rand = (int) (Math.random() * 10);
	
	
	@Override
	public void handler(Computadora computadora) {

		System.out.println("***ENCENDIDO***");
		computadora.setProgramas(rand);
		computadora.show();
		
	}

}