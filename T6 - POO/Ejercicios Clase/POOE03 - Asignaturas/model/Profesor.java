package model;

public class Profesor {

    public void ponerNotas(Alumno alumno){
        alumno.getAsignatura01().setCalificacion((Math.random()*11));
        alumno.getAsignatura02().setCalificacion((Math.random()*11));
        alumno.getAsignatura03().setCalificacion((Math.random()*11));

    }
   public double calcularMedia(Alumno alumno){
        return (alumno.getAsignatura01().getCalificacion()+alumno.getAsignatura02().getCalificacion()+alumno.getAsignatura03().getCalificacion())/3;
    }
}
