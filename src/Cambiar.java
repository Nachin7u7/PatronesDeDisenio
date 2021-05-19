
public class Cambiar {

	double DtoB;
	double BtoD;
	double EtoB;
	double BtoE;
	double EtoD;
	double DtoE;

	Cambiar instanciado = new Cambiar();

	public Cambiar() {
		DtoB = 6.89;
		BtoD = 0.15;
		EtoB = 8.43;
		BtoE = 0.12;
		EtoD = 1.22;
		DtoE = 0.82;
	}

	public double cambiar(double monto, int tipo) {
		switch (tipo) {
		case 0: {
			return DtoB * monto;
		}
		case 1: {
			return BtoD * monto;
		}
		case 2: {
			return EtoB * monto;
		}
		case 3: {
			return BtoE * monto;
		}
		case 4: {
			return EtoD * monto;
		}
		case 5: {
			return DtoE * monto;
		}
		default:
			return 0;
		}
	}

}
