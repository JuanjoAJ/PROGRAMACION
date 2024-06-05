package ejercicio1.model;

import java.util.ArrayList;

/*b.	Colegio: con un listado de alumnos como propiedad.
 El colegio tendrá los métodos de listarAlumnos,
 darAlta con un parámetro de tipo un alumno para poder meterlo dentro de la lista
  y un método calificarAlumno con un patametro de tipo int (la matricula)
   otro de tipo double para poder calificar al alumno correspondiente.
El número de matrícula tendrá que ser otorgado de forma automática cuando se registra el alumno*/
public class Colegio {
    private ArrayList<Alumno> alumnos;

    public Colegio() {
        alumnos=new ArrayList<>();
    }

    public void darAlta(Alumno alumno){

        if (estaAlumno(alumno.getnMatricula())==null){
            alumnos.add(alumno);
        }else {
            System.out.println("Ya existe un alumno con esa matricula");
        }

    }

    public void calificarAlumno(int matricula, double calificacion){
        if(calificacion<0 || calificacion>10) System.out.println("La calificación no es correcta");
        else{
            if (estaAlumno(matricula)!=null){
                estaAlumno(matricula).setCalificacion(calificacion);
            }
        }

    }

    private Alumno estaAlumno(int matricula){
        for (Alumno item:alumnos) {
            if (matricula == item.getnMatricula()) return item;
        }
        return null;
    }


    public void listarAlumno(){
        for (Alumno item:alumnos){
            System.out.println(item);
        }
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
}
