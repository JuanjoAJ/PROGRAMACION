package ejercicio1.model;
/*a.	Alumno: cada uno de los alumnos tendrá nombre, apellido, calificación, dni y número de matrícula.
 Los métodos de los que dispondrá son mostrarDatos y los constructores que consideres necesarios*/
public class Alumno {
    private static int contadorMatricula;
    private String nombre, apellido, dni;
    private int nMatricula;
    private double calificacion;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
       // this.nMatricula = (int) (Math.random()*1001)+1;
        nMatricula=++contadorMatricula;
    }

    public Alumno(String nombre, String apellido, String dni, int nMatricula, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nMatricula = nMatricula;
        this.calificacion = calificacion;
    }


    @Override
    public String toString() {

        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", nMatricula=" + nMatricula +
                ", calificacion=" + calificacion +
                '}';
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getnMatricula() {
        return nMatricula;
    }

    public void setnMatricula(int nMatricula) {
        this.nMatricula = nMatricula;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}
