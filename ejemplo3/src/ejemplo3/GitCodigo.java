package ejemplo3;

public class GitCodigo {

	private int version;
	private String codigo;

	public GitCodigo(int version, String codigo){
		this.version = version;
		this.codigo = codigo;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void showInfo() {
		System.out.println("Version: " + version);
		System.out.println("Codigo:");
		System.out.println(codigo);
	}

}
