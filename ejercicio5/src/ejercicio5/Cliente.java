package ejercicio5;

import java.util.*;

//	(Mediator) Se tiene un canal de comunicación Whatapp donde las personas pueden
//	enviar mensajes a personas especificas (comunicacion 1 a 1 ) y tambien se pueden
//	enviar mensajes a un grupo de personas, agregar 10 personas (usuarios) hacer la
//	comunicación del usuario 1 al usuario 2 directamente, y el usuario 10 que envie un
//	mensaje a los otros usuarios

public class Cliente {

	public static void main(String[] args) {

		Whatsapp wp = new Whatsapp();

		Usuario usuario1 = new UsuarioWhatsapp(wp, "Juan");
		Usuario usuario2 = new UsuarioWhatsapp(wp, "Pedro");
		Usuario usuario3 = new UsuarioWhatsapp(wp, "Pablo");
		Usuario usuario4 = new UsuarioWhatsapp(wp, "Javier");
		Usuario usuario5 = new UsuarioWhatsapp(wp, "Messi");
		Usuario usuario6 = new UsuarioWhatsapp(wp, "Cristiano");
		Usuario usuario7 = new UsuarioWhatsapp(wp, "Puyol");
		Usuario usuario8 = new UsuarioWhatsapp(wp, "Arnold");
		Usuario usuario9 = new UsuarioWhatsapp(wp, "Teresa");
		Usuario usuario10 = new UsuarioWhatsapp(wp, "Mario");

		List<Usuario> l1 = new LinkedList<Usuario>();

		l1.add(usuario1);
		l1.add(usuario2);
		l1.add(usuario3);
		l1.add(usuario4);
		l1.add(usuario5);
		l1.add(usuario6);
		l1.add(usuario7);
		l1.add(usuario8);
		l1.add(usuario9);
		l1.add(usuario10);

		GrupoUsuarios g1 = new GrupoUsuarios("Friends");

		g1.setGrupo(l1);

		wp.addGrupo(g1);

		usuario1.sendPerson("Hello wolrd", usuario2);

		usuario10.sendGroup("FFFF", g1.getNombre());

	}

}
