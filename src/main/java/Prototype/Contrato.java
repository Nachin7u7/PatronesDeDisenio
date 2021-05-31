package Prototype;

public class Contrato implements IContrato {

    private int sueldo;
    private int cargaHoraria;
    private boolean cursoSuperior;
    private boolean acceso;
    private boolean marcado;
    private int entrada;
    private int salida;
    private String nombre;
    private String apellido;

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public boolean getCursoSuperior() {
        return cursoSuperior;
    }

    public void setCursoSuperior(boolean cursoSuperior) {
        this.cursoSuperior = cursoSuperior;
    }

    public boolean isAcceso() {
        return acceso;
    }

    public void setAcceso(boolean acceso) {
        this.acceso = acceso;
    }

    public boolean isMarcado() {
        return marcado;
    }

    public void setMarcado(boolean marcado) {
        this.marcado = marcado;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public int getSalida() {
        return salida;
    }

    public void setSalida(int salida) {
        this.salida = salida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public Object clone() {
        Contrato objClone = new Contrato();
        objClone.setAcceso(this.acceso);
        objClone.setApellido(this.apellido);
        objClone.setCargaHoraria(this.cargaHoraria);
        objClone.setEntrada(this.entrada);
        objClone.setMarcado(this.marcado);
        objClone.setNombre(this.nombre);
        objClone.setCursoSuperior(this.cursoSuperior);
        objClone.setSueldo(this.sueldo);
        objClone.setSalida(this.salida);
        return objClone;
    }

    public void mostrarInfo(){
        System.out.println("******************************");
        System.out.println("Descripcion del contrato");
        System.out.println("Sueldo: " + sueldo + " bs");
        System.out.println("Carga horaria: " + cargaHoraria + " hrs");
        System.out.println("Curso Superior: "+ cursoSuperior);
        System.out.println("Acceso: " + acceso);
        System.out.println("Marcado: " + marcado);
        System.out.println("Hora de entrada: " + entrada);
        System.out.println("Hora de salida: " + salida);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }

}