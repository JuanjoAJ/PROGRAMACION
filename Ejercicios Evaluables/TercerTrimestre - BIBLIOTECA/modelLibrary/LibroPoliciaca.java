package modelLibrary;

import util.Trama;

import java.io.Serial;
import java.util.ArrayList;

public final class LibroPoliciaca extends modelLibrary.Libro {

    @Serial
    private static final long serialVersionUID = 499732644517756242L;
    private Trama trama;

    private ArrayList<Persona> personajes;

    public LibroPoliciaca() {
        personajes = new ArrayList<>();
    }

    public LibroPoliciaca(String titulo, int numeroPaginas, Persona autor, String ISBN, ArrayList<Persona> personajes, int numTrama) {
        super(titulo, numeroPaginas, autor, ISBN);
        this.personajes = personajes;
        if(numTrama==1) trama=Trama.INTRIGA;
        else if (numTrama==2) trama=Trama.MISTERIO;
        else throw new RuntimeException("Tipo de trama no valida");
    }

    @Override
    public void mostrarDatos() {
        int nPersonas =1;
        System.out.println("Libro policiaco");
        System.out.println("Cuya trama es " + trama);
        for (Persona item:personajes) {
            System.out.println("Protagonizado por el personaje" + nPersonas +"\n" + item);
            nPersonas++;
        }
        super.mostrarDatos();
    }

    @Override
    public String toString() {
        return "LIBRO POLICIACO \n"  +super.toString()+"\t Tipo de trama: "+ trama+ "\t \t ISBN: "+ getIsbn() + "\n";
    }

    public void agregarPersonaje(String nombre, String apellidos) {
        personajes.add(new Persona(nombre, apellidos));
    }
}
