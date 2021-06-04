package mediatorEjercicio;

//		Se tiene un canal de comunicacion que se llama SKYPE, este canal de
//		comunicacion es empresarial donde existen QA (name,ci,grado), DEV(name, ci, lenguaje), 
//		SM (name,ci,certificaciones)
//		cuando un QA envia un mensaje envia a todos los QA registrados
//		cuando un SM envia un mensaje envia a todos los que estan registrados
//		esto quiere decir que se envia a QA / DEV / SM
//		cuando un DEV envia un mensage envia a todos los DEV
//		
//		-nota asegurarse que la persona que envia el mensage no reciba
//		su propio mensaje
//		
//		- se debe utilizar Map
//		
//		agregar minimamente 3 DEV, 3 QA y 3 SM al chat

public class Cliente {

	public static void main(String[] args) {

		Skype skype = new Skype();

		DEV dev1 = new DEV(skype, "Juan", "10923817", "Python");
		skype.addCollegue(dev1);
		DEV dev2 = new DEV(skype, "Jose", "2017784", "Python");
		skype.addCollegue(dev2);
		DEV dev3 = new DEV(skype, "Pedro", "2345788", "C++");
		skype.addCollegue(dev3);

		QA qa1 = new QA(skype, "Messi", "45698712", "Php");
		skype.addCollegue(qa1);
		QA qa2 = new QA(skype, "Pooh", "12345678", "Honey");
		skype.addCollegue(qa2);
		QA qa3 = new QA(skype, "Peter", "7856321", "Matlab");
		skype.addCollegue(qa3);

		SM sm1 = new SM(skype, "Nikolai", "2589656", "Brainfuck");
		skype.addCollegue(sm1);
		SM sm2 = new SM(skype, "Donald", "78996544", "Java");
		skype.addCollegue(sm2);
		SM sm3 = new SM(skype, "Evo", "852456123", "Scratch");
		skype.addCollegue(sm3);

		dev1.send("Mensaje de dev1");
		dev2.send("Mensaje de dev2");
		dev3.send("Mensaje de dev3");

		qa1.send("Mensaje de qa1");
		qa2.send("Mensaje de qa2");
		qa3.send("Mensaje de qa3");

		sm1.send("Mensaje de sm1");
		sm2.send("Mensaje de sm2");
		sm3.send("Mensaje de sm3");
	}

}
