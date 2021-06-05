package tareaMemento;

import java.util.ArrayList;
import java.util.List;

//		Se tiene una base de datos donde se van agregando Personas (name, ci, edad),
//		a medida que va creciendo la base de datos se van sacando
//		Backups que tiene como nombre un Alias (i.e BackupMarzo, BackupMayo),
//		cuando ya se tiene 5 Backups se desea restaurar
//		el segundo backup y mostrar las personas que tenía en dicha versión

public class Cliente {

	public static void main(String[] args) {

		takeCare tc = new takeCare();
		Originator or = new Originator();
		BaseDeDatos datos;
		List<Persona> bd = new ArrayList<>();

		Persona p1 = new Persona("Juan", "10926548", "20");
		Persona p2 = new Persona("Messi", "79864532", "21");
		Persona p3 = new Persona("Cristiano", "125198452", "23");
		Persona p4 = new Persona("Jorge", "6543245", "30");
		Persona p5 = new Persona("Homero", "65468324", "19");

		bd.add(p1);
		bd.add(p2);
		bd.add(p3);
		bd.add(p4);
		bd.add(p5);

		List<Persona> bd1 = new ArrayList<>();

		Persona p6 = new Persona("Pedro", "85274196", "30");
		Persona p7 = new Persona("Carlos", "85241635", "31");
		Persona p8 = new Persona("Rodrigo", "15935745", "33");
		Persona p9 = new Persona("Luis", "98765432", "20");
		Persona p10 = new Persona("Miguel", "65432198", "40");

		bd1.add(p6);
		bd1.add(p7);
		bd1.add(p8);
		bd1.add(p9);
		bd1.add(p10);

		List<Persona> bd2 = new ArrayList<>();

		Persona p11 = new Persona("Winnie", "10203456", "24");
		Persona p12 = new Persona("Piglet", "16345275", "51");
		Persona p13 = new Persona("Cesar", "65433212", "43");
		Persona p14 = new Persona("Eva", "142536378", "32");
		Persona p15 = new Persona("Pilar", "857419612", "24");

		bd2.add(p11);
		bd2.add(p12);
		bd2.add(p13);
		bd2.add(p14);
		bd2.add(p15);

		List<Persona> bd3 = new ArrayList<>();

		Persona p16 = new Persona("Veggeta", "6548126", "24");
		Persona p17 = new Persona("Goku", "457482045", "51");
		Persona p18 = new Persona("Picolo", "85749615", "43");
		Persona p19 = new Persona("Peter", "410204565", "32");
		Persona p20 = new Persona("Miles", "410520785", "24");

		bd3.add(p16);
		bd3.add(p17);
		bd3.add(p18);
		bd3.add(p19);
		bd3.add(p20);

		List<Persona> bd4 = new ArrayList<>();

		Persona p21 = new Persona("Ezio", "98765412", "51");
		Persona p22 = new Persona("Altair", "32165479", "49");
		Persona p23 = new Persona("Kratos", "104706511", "45");
		Persona p24 = new Persona("John", "201948745", "39");
		Persona p25 = new Persona("Ethan", "5201466", "29");

		bd4.add(p21);
		bd4.add(p22);
		bd4.add(p23);
		bd4.add(p24);
		bd4.add(p25);

		// CADA 5 GUARDA EL ESTATUS
		datos = new BaseDeDatos("BackupMarzo", bd);
		or.setState(datos);
		datos = new BaseDeDatos("BackupAbril", bd1);
		or.setState(datos);
		tc.addMemento(or.createMemento());
		datos = new BaseDeDatos("BackupMayo", bd2);
		or.setState(datos);
		datos = new BaseDeDatos("BackupJunio", bd3);
		or.setState(datos);
		tc.addMemento(or.createMemento());
		datos = new BaseDeDatos("BackupJulio", bd4);
		or.setState(datos);

		// RESTAURAR BACKUPS
		or.restoreFromMemento(tc.getMemento(0));
		or.restoreFromMemento(tc.getMemento(1));

	}

}
