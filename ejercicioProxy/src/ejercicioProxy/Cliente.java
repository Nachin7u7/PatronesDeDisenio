package ejercicioProxy;

//(Proxy) Se tienen 2 servidores que son parte de un cluster donde en cada servidor se

//tiene la misma aplicación web, se tiene configurado un proxy que va almacenando a los
//usuarios que realizan login, todos los usuarios impares que ingresen con user y pwd
//correctos son atendidos por el servidor1 y los usuarios impares son atendidos por el
//servidor1.

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Proxy proxy = new Proxy(new AppWeb(), new AppWeb());

		proxy.registrar("juan", "123456");
		proxy.registrar("pedro", "852074");
		proxy.registrar("pablo", "741852");
		proxy.registrar("messi", "789456");
		proxy.registrar("cristiano", "987654");
		proxy.registrar("bobaFet", "159753");

		proxy.login("juan", "123456");
		proxy.login("pedro", "852074");
		proxy.login("pablo", "741852");
		proxy.login("messi", "789456");
		proxy.login("cristiano", "987654");
		proxy.login("bobaFet", "159753");

	}

}
