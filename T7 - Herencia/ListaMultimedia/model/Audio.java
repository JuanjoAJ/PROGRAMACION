package model;

public class Audio extends ElementoMultimedia {

    private int duracion;
    private String soporte;


    //Constructores


    public Audio() {
    }

    public Audio(int id, String titulo, int tamano, String formato, Persona autor, int duracion, String soporte) {
        super(id, titulo, tamano, formato, autor);
        this.duracion = duracion;
        this.soporte = soporte;
    }


    //Métodos

    @Override
    public void mostrarDatos() {
        System.out.println("Audio con:");
        System.out.println("Duración: " + duracion);
        System.out.println("Soporte: " + soporte);
        super.mostrarDatos();
    }

    //Getter & Setter


    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }
}
