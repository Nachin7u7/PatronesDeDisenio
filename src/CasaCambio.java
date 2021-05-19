
public class CasaCambio {
	public float DtoB(double monto) {
		Banco bank = new Banco();
		return (float) bank.DtoB(monto);
	}

	public float BtoD(double monto) {
		Banco bank = new Banco();
		return (float) bank.BtoD(monto);
	}

	public float EtoB(double monto) {
		Banco bank = new Banco();
		return (float) bank.EtoB(monto);
	}

	public float BtoE(double monto) {
		Banco bank = new Banco();
		return (float) bank.BtoE(monto);
	}

	public float EtoD(double monto) {
		Banco bank = new Banco();
		return (float) bank.EtoD(monto);
	}

	public float DtoE(double monto) {
		Banco bank = new Banco();
		return (float) bank.DtoE(monto);
	}
}
