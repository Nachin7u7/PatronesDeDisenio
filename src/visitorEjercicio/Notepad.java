package visitorEjercicio;

public class Notepad implements IEditor {

	private String nombre;
	private String contenido;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	@Override
	public void accept(IVisitor visitor) {

		visitor.guardarArchivos(this);

	}

	@Override
	public void crear() {

	}

	@Override
	public void editar() {

	}

	@Override
	public void eliminar() {

	}
}
