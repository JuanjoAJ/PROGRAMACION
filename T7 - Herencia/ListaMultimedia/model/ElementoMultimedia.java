package model;

public abstract class ElementoMultimedia {
    private int id,tamanio;

    private String titulo, formato;
    private Persona autor;

    //Constructor
    public ElementoMultimedia(){}
    public ElementoMultimedia(int id, String titulo, int tamano, String formato, Persona autor) {
        this.id = id;
        this.titulo = titulo;
        this.tamanio = tamano;
        this.formato = formato;
        this.autor = autor;
    }


    //Metodos

    public void mostrarDatos(){
        System.out.println("Id: " + id);
        System.out.println("Titulo: " + titulo);
        System.out.println("Formato: " + formato);
        System.out.println("Tamaño: " + tamanio);
        System.out.print("Autoria: ");
        autor.mostrarDatos();
    }


    //Getter & Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }
}
