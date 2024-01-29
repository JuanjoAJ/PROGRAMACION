import model.Alumno;
import model.Asignatura;
import model.Profesor;
public class EntradaClase {
    public static void main(String[] args) {
        Asignatura[] asignaturas={new Asignatura(0), new Asignatura(1), new Asignatura(2)};
        Alumno alumno=new Alumno(asignaturas[0], asignaturas[1], asignaturas[2]);
        Profesor profesor=new Profesor();
        profesor.ponerNotas(alumno);
        System.out.printf("La media del alumno en las tres asignaturas es de %.2f \n",profesor.calcularMedia(alumno));
        System.out.println("Las notas de las asignaturas son: ");
        for(Asignatura imp:asignaturas) {
            System.out.printf("%.2f \n",imp.getCalificacion());
        }
    }
}
