import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante(1, "Erick", "Estuardo", "2005-11-30", Estudiante.Estado.GRADUADO);
        Estudiante estudiante2 = new Estudiante(2, "Lluvia", "Escobar", "2006-02-27", Estudiante.Estado.MATRICULADO);


        Curso curso1 = new Curso(1, "Lenguaje y Aprendizaje", "Fonemas y gramatica", 3);
        Curso curso2 = new Curso(2, "Historia Viva de Mexico", "Historia Mexicana", 2);


        GestorAcademico gestor = new GestorAcademico();

        try {

            gestor.matricularEstudiante(estudiante1);
            gestor.matricularEstudiante(estudiante2);
            gestor.agregarCurso(curso1);
            gestor.agregarCurso(curso2);


            gestor.inscribirEstudianteCurso(estudiante1, curso1.getId());
            gestor.inscribirEstudianteCurso(estudiante2, curso2.getId());
            gestor.desinscribirEstudianteCurso(estudiante1.getId(), curso1.getId());

            gestor.inscribirEstudianteCurso(estudiante1, curso1.getId());
        } catch (EstudianteYaInscritoException | EstudianteNoInscritoEnCursoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(estudiante1);
        System.out.println(curso1);
        System.out.println(estudiante2);
        System.out.println(curso2);
    }

}