package AbstractFactory;

public class Ingles implements IMateria{

    private String docente;
    private int semestre;

    public Ingles(){}

    @Override
    public void crear(){
        System.out.println("INGLES");
        System.out.println("Docente: " + docente);
        System.out.println("Semestre: " + semestre);
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

}
