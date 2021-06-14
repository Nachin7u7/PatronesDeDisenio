package ejemplo3;

//	//	//	(Memento & Observer) Se tiene un repositorio en github donde se sube código
//	//	//	constantemente y se versiona en cada commit con la posibilidad de poder volver a un
//	//	//	commit específico, adicionalmente desarrolladores pueden suscribirse al repositorio y
//	//	//	recibir notificaciones cuando se vuelve/restaura un commit específico. - adicionar
//	//	//	mínimamente 3 desarrolladores suscritos al repositorio - tener 5 commits en el
//	//  //	repositorio y volver al primer commit (commit 1) - eliminar a los 3 desarrolladores y
//	//	//	adicionar otros 3 nuevos desarrolladores - volver al último commit (commit 5)

public class Cliente {

	public static void main(String[] args) {

		Commits commits = new Commits();
		Originator originator = new Originator();

		GitCodigo gitcode;

		gitcode = new GitCodigo(1, "asdff");
		originator.setState(gitcode);
		commits.addMemento(originator.createVersion());

		gitcode = new GitCodigo(2, "fdsa");
		originator.setState(gitcode);
		commits.addMemento(originator.createVersion());

		gitcode = new GitCodigo(3, "Aeiou");
		originator.setState(gitcode);
		commits.addMemento(originator.createVersion());

		gitcode = new GitCodigo(4, "abcdef");
		originator.setState(gitcode);
		commits.addMemento(originator.createVersion());

		gitcode = new GitCodigo(5, "wxyz");
		originator.setState(gitcode);
		commits.addMemento(originator.createVersion());

		Desarrollador desarrollador1 = new Desarrollador("Juan");
		Desarrollador desarrollador2 = new Desarrollador("Pepe");
		Desarrollador desarrollador3 = new Desarrollador("Ana");

		originator.attach(desarrollador1);
		originator.attach(desarrollador2);
		originator.attach(desarrollador3);

		originator.restoreFromMemento(commits.getVersion(0));

		originator.deattach(desarrollador1);
		originator.deattach(desarrollador2);
		originator.deattach(desarrollador3);

		Desarrollador desarrollador4 = new Desarrollador("Pedro");
		Desarrollador desarrollador5 = new Desarrollador("Pablo");
		Desarrollador desarrollador6 = new Desarrollador("Messi");

		originator.attach(desarrollador4);
		originator.attach(desarrollador5);
		originator.attach(desarrollador6);

		originator.restoreFromMemento(commits.getVersion(4));

	}

}
