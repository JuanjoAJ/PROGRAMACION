package model;

public class Libro extends ElementoMultimedia {

    private int isbn, nPaginas;

    //Constructores
    public Libro(){}
    public Libro(int id, String titulo, int tamano, String formato, Persona autor, int isbn, int nPaginas) {
        super(id, titulo, tamano, formato, autor);
        this.isbn = isbn;
        this.nPaginas = nPaginas;
    }

    //Métodos


    @Override
    public void mostrarDatos() {
        System.out.println("Libro con: ");
        System.out.println("ISBN: " + isbn);
        System.out.println("Número de páginas: " + nPaginas);
        super.mostrarDatos();
    }

    //Getter & Setter
    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getnPaginas() {
        return nPaginas;
    }

    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }
}
