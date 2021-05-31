package AbstractFactory;

public class Factory {

    static IMateria lenguaje = new Lenguaje();
    static IMateria matematicas = new Matematicas();
    static IMateria ingles = new Ingles();
    static IMateria historia = new Historia();

    enum Materias {
        Lenguaje, Matematicas, Ingles, Historia
    }

    public static IMateria make(Materias p) {
        switch (p) {
            case Lenguaje:
                ((Lenguaje)(lenguaje)).setDocente("Eynar Pari");
                ((Lenguaje)(lenguaje)).setSemestre(1);
                return lenguaje;
            case Matematicas:
                ((Matematicas)(matematicas)).setDocente("Olga Montanio");
                ((Matematicas)(matematicas)).setSemestre(2);
                return matematicas;
            case Ingles:
                ((Ingles)(ingles)).setDocente("Olivia Rodriguez");
                ((Ingles)(ingles)).setSemestre(2);
                return ingles;
            case Historia:
                ((Historia)(historia)).setDocente("Cruela Devil");
                ((Historia)(historia)).setSemestre(1);
                return historia;
        }
        return null;
    }

}
