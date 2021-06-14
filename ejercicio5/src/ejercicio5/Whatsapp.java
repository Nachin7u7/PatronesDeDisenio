package ejercicio5;

import java.util.*;

public class Whatsapp implements CanalDeComunicacion {

	private List<GrupoUsuarios> grupos = new LinkedList<GrupoUsuarios>();

	public void addGrupo(GrupoUsuarios grupo) {
		grupos.add(grupo);
	}

	@Override
	public void send(String message, Usuario usuario) {
		usuario.messageReceived(message);
	}

	@Override
	public void sendGroup(String message, String nombreGrupo, Usuario origen) {
		GrupoUsuarios grupoActual = new GrupoUsuarios("");
		for (GrupoUsuarios grupoUsuarios : grupos) {
			if (grupoUsuarios.getNombre().equals(nombreGrupo)) {
				grupoActual = grupoUsuarios;
				break;
			}
		}
		for (Usuario usuario : grupoActual.getGrupo()) {
			if (!usuario.equals(origen)) {
				usuario.messageReceived(message);
			}
		}
	}

}
