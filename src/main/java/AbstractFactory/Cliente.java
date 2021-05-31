package AbstractFactory;

public class Cliente {

    public static void main(String[] args) {
        Matematicas materiaEstudiante1 = (Matematicas) Factory.make(Factory.Materias.Matematicas);
        Lenguaje materiaEstudiante2 = (Lenguaje) Factory.make(Factory.Materias.Lenguaje);
        Historia materiaEstudiante3 = (Historia) Factory.make(Factory.Materias.Historia);
        Ingles materiaEstudiante4 = (Ingles) Factory.make(Factory.Materias.Ingles);
        Lenguaje materiaEstudiante5 = (Lenguaje) Factory.make(Factory.Materias.Lenguaje);

        materiaEstudiante1.crear();
        materiaEstudiante2.crear();
        materiaEstudiante3.crear();
        materiaEstudiante4.crear();
        materiaEstudiante5.crear();

    }

}
