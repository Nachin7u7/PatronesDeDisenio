
public class main {

	public static void main(String[] args) {

		Caracteristicas samsung1 = new Caracteristicas();
		Caracteristicas samsung2 = new Caracteristicas();
		Caracteristicas samsung3 = new Caracteristicas();

		boolean accesorios1[] = { true, true, true };
		boolean accesorios2[] = { true, false, true };
		boolean accesorios3[] = { true, false, false };

		samsung1.setNumero(60531214);
		samsung1.setTamanio("Mediano");
		samsung1.setCpu("Octa-core");
		samsung1.setAccesorios(accesorios1);
		samsung1.setMemory("64 Gb");
		samsung1.setSim("Entel");
		samsung1.setVersionAndroid("Oreo");
		samsung1.setCamara("32 px");
		samsung1.setBluetoo("3.1");
		samsung1.setCantidadDeMemoriasExternas(2);
		samsung1.setTipoBateria("Litio");

		samsung2 = (Caracteristicas) samsung1.clone();
		samsung2.setNumero(63195245);
		samsung2.setSim("Viva");
		samsung2.setAccesorios(accesorios2);
		samsung2.setVersionAndroid("jelly bean");

		samsung3 = (Caracteristicas) samsung1.clone();
		samsung3.setNumero(70564215);
		samsung3.setSim("Tigo");
		samsung3.setAccesorios(accesorios3);
		samsung3.setTamanio("Grande");
		samsung3.setCamara("64 px");
		samsung3.setBluetoo("4.0");
		
		

	}

}
