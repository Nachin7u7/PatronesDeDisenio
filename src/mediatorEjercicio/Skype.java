package mediatorEjercicio;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Skype implements IMediator {

	private Map<String, Collage> personasChat = new HashMap<String, Collage>();
	private List<String> personasChatCi = new LinkedList<String>();

	public void addCollegue(Collage c) {
		personasChat.put(c.ci, c);
		personasChatCi.add(c.ci);
	}

	@Override
	public void send(String message, Collage colleague) {
		Collage personaParseOrigen = colleague;
		for (String c : personasChatCi) {
			if (c != personaParseOrigen.ci) {
				if (personaParseOrigen instanceof SM) {
					personasChat.get(c).messageReceived(message);
				} else if (personaParseOrigen instanceof QA && personasChat.get(c) instanceof QA) {
					personasChat.get(c).messageReceived(message);
				} else if (personaParseOrigen instanceof DEV && personasChat.get(c) instanceof DEV) {
					personasChat.get(c).messageReceived(message);
				}
			}
		}

	}
}