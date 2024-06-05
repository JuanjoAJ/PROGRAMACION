package modelLibrary;

import util.Calificacion;

import java.io.Serial;


public final class LibroTerror extends Libro {
    @Serial
    private static final long serialVersionUID = 1119886998276407127L;
    private Calificacion calificacion;

    public LibroTerror() {
    }

    public LibroTerror(String titulo, int numeroPaginas, Persona autor, String ISBN, int nCalificacion) {
        super(titulo, numeroPaginas, autor, ISBN);
        if (nCalificacion==1)calificacion=Calificacion.ADULTOS;
        else if (nCalificacion==2) calificacion=Calificacion.ADOLESCENTE;
        else if (nCalificacion==3) calificacion=Calificacion.INFANTIL;
        else throw new RuntimeException("Calificación no válida");
    }


    @Override
    public void mostrarDatos() {
        System.out.println("Libro de terror: ");
        System.out.println("Con una calificacion " + calificacion);
        super.mostrarDatos();
    }

    @Override
    public String toString() {
        return "LIBRO DE TERROR \n"  +super.toString()+"\t Calificación: "+ calificacion+ "\t \t ISBN: "+ getIsbn() + "\n";
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Calificacion calificacion) {
        this.calificacion = calificacion;
    }
}
