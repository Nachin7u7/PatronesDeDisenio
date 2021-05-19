import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Banco bank = new Banco();
		CasaCambio casa = new CasaCambio();
		LibreCambista cambista = new LibreCambista();

		// PRUEBAS:
		bank.BtoD(500);		// 500 BOLIVIANOS A DOLARES EN EL BANCO (r: 72.56 dolares)
		casa.BtoE(1280);	// 1280 BOLIVIANOS A EUROS EN CASA DE CAMBIO (r: 151.87 euros)
		cambista.DtoE(700); // 700 DOLARES A EUROS (r: 572.29 euros)

	}

}
