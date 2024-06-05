package ejercicio1.model;
/*con un método main con la siguiente funcionalidad
i.	Crea 4 alumnos con datos manuales
ii.	Agrega los alumnos al colegio
iii.	Califica los a todos los alumnos
iv.	Muestra los datos de todos los alumnos
*/
public class EntradaAlumnos {
    public static void main(String[] args) {
        Alumno alumno1=new Alumno("Juanjo", "Avila", "123456a");
        Alumno alumno2=new Alumno("Maria", "Avila", "123456a");
        Alumno alumno3=new Alumno("Eli", "Rgz", "123456a");
        Alumno alumno4=new Alumno("Ana", "Rgz", "123456a");

        Colegio colegio=new Colegio();

        colegio.darAlta(alumno1);
        colegio.darAlta(alumno2);
        colegio.darAlta(alumno3);
        colegio.darAlta(alumno4);

        colegio.calificarAlumno(1, 10);
        colegio.calificarAlumno(2, 10);
        colegio.calificarAlumno(3, 8);
        colegio.calificarAlumno(4, 9);

        colegio.listarAlumno();
    }
}
