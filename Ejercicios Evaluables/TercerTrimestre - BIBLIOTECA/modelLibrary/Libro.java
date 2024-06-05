package modelLibrary;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public abstract class Libro implements Serializable {

    @Serial
    private static final long serialVersionUID = -6434783509163358892L;
    private int numeroPaginas, enCatalogo;
private Persona autor;

private String isbn, titulo;



    public Libro() {
    }

    public Libro(String titulo, int numeroPaginas, Persona autor, String isbn) {
        this.titulo=titulo;
        this.numeroPaginas = numeroPaginas;
        this.autor = autor;
        this.isbn = isbn;
    }

    public void mostrarDatos(){
        System.out.println("\033[7;37;32m Con titulo = " + titulo);
        System.out.println(" \033[4;37;32m ISBN = " + isbn +" \033[0m ");
        System.out.println(" Escrito por = " + autor);
        System.out.println("Con " + numeroPaginas + " páginas");
        System.out.println("Se encuentra actualmente en " + enCatalogo + " catálogos.");
        System.out.println();
    }

    @Override
    public String toString() {
        return "\nTitulo: " + titulo +"\t Autor: "+autor +
                "\t \t Numero de Páginas :"+ numeroPaginas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEnCatalogo() {
        return enCatalogo;
    }

    public void setEnCatalogo(int enCatalogo) {
        this.enCatalogo = enCatalogo;
    }
}
