package model;

public class Alumno {
    private Asignatura asignatura01,asignatura02,asignatura03;

    public Alumno(){}
    public Alumno(Asignatura asignatura01, Asignatura asignatura02, Asignatura asignatura03){
        this.asignatura01=asignatura01;
        this.asignatura02=asignatura02;
        this.asignatura03=asignatura03;
    }

    public Asignatura getAsignatura01() {
        return asignatura01;
    }

    public Asignatura getAsignatura02() {
        return asignatura02;
    }

    public Asignatura getAsignatura03() {
        return asignatura03;
    }
}
