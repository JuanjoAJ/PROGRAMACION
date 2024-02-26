package model;

import java.util.ArrayList;

public class Video extends ElementoMultimedia {


    private Persona director;
    private ArrayList<Persona> actores;

    //Constructores

    public Video(){}
    public Video(int id, String titulo, int tamano, String formato, Persona autor, Persona director, ArrayList<Persona> actores) {
        super(id, titulo, tamano, formato, autor);
        this.director = director;
        this.actores = actores;
    }

    //Métodos

    @Override
    public void mostrarDatos() {
        System.out.println("Video con: ");
        System.out.println("Director: ");
        director.mostrarDatos();
        System.out.println("Elenco de actores " );
        for (Persona item:actores){ item.mostrarDatos();}
        super.mostrarDatos();
    }

    //Getter & Setter

    public Persona getDirector(){
        return director;
    }

    public void setDirector(Persona director){
        this.director=director;
    }

    public ArrayList<Persona> getActores() {
        return actores;
    }


    public void setActores(ArrayList<Persona> actores) {
        this.actores = actores;
    }
}
