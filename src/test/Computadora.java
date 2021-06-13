package test;

public class Computadora {

	public Computadora() {
		super();
	}

	private IState estado;
	private String programas[];
	private String ram;
	private int consumo;

	public IState getState() {
		return estado;
	}

	public void setState(IState estado) {
		this.estado = estado;
	}

	public String[] getProgramas() {
		return programas;
	}

	public void request() {
		this.estado.handler(this);
	}

	public void setProgramas(int rand) {

		programas = new String[rand];
		for (int i = 0; i <= rand-1; i++) {
			programas[i] = "programa" + i;
		}

		this.consumo = rand * 5;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public int getConsumo() {
		return consumo;
	}


	public void show() {
		System.out.println("Programas: ");
		for(int i=0;i<=programas.length-1;i++) {
			System.out.println("	"+programas[i]);
		}	
		System.out.println("Ram: " + ram);
		System.out.println("Consumo de CPU:" + consumo);
		System.out.println("");
	}
}