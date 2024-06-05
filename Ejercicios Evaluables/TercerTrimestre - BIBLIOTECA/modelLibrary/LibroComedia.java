package modelLibrary;

import util.TipoHumor;

import java.io.Serial;

public final class LibroComedia extends Libro{
    @Serial
    private static final long serialVersionUID = 2088739673648495369L;
    private TipoHumor tipoHumor;

    public LibroComedia() {
    }

    public LibroComedia(String titulo, int numeroPaginas, Persona autor, String ISBN, int numTipoHumor) {
        super(titulo,numeroPaginas, autor, ISBN);
        tipoHumor=switch (numTipoHumor){
            case 1 -> TipoHumor.BLANCO;
            case 2 -> TipoHumor.NEGRO;
            case 3 -> TipoHumor.HACKER;
            case 4 -> TipoHumor.GRAFICO;
            case 5 -> TipoHumor.ABSURDO;
            case 6-> TipoHumor.VERDE;
            default -> throw new RuntimeException("Calificación no contemplada");
        };
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Libro de comedia: ");
        System.out.println("Con un tipo de humor " + tipoHumor);
        super.mostrarDatos();
    }

    @Override
    public String toString() {
        return "LIBRO COMEDIA \n"  +super.toString()+"\t Tipo de Humor: "+ tipoHumor+ "\t \t ISBN: "+ getIsbn() + " \n";
    }

    public TipoHumor getTipoHumor() {
        return tipoHumor;
    }

    public void setTipoHumor(TipoHumor tipoHumor) {
        this.tipoHumor = tipoHumor;
    }
}
