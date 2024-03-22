package controllerMulti;

import model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Coleccion {
    Scanner sc = new Scanner(System.in);
    private ArrayList<ElementoMultimedia> multimedia;
    private int id;


    //Constructores
    public Coleccion() {

        multimedia = new ArrayList<>();
    }

    //Métodos


    public void agregarColeccion() {


        switch (sc.nextInt()) {
            case 1:
                agregarLibro();
                break;
            case 2:
                agregarVideo();
                break;
            case 3:
                agregarAudio();
                break;
            default:
                System.out.println("Opción no contemplada");
                break;
        }

    }

    private void agregarLibro() {
        System.out.println("Ha elegido Libro, introduzca ID");
        id = sc.nextInt();
        if (existeMultimedia(id) == null) {
            System.out.println("Introduce titulo, tamaño(nº), formato, nombre de autor, dni de autor, ISBN y el número de páginas");
            multimedia.add(new Libro(id, sc.next(), sc.nextInt(), sc.next(), new Persona(sc.next(), sc.next()), sc.nextInt(), sc.nextInt()));
            System.out.println("Libro añadido");
        } else {
            System.out.println("Ese ID ya está en uso");
        }
    }

    private void agregarAudio() {
        System.out.println("Ha elegido Audio, introduzca ID");
        id = sc.nextInt();
        if (existeMultimedia(id) == null) {
            System.out.println("Introduce titulo, tamaño(nº), formato, nombre de autor, dni de autor, duración y el soporte");
            multimedia.add(new Audio(id, sc.next(), sc.nextInt(), sc.next(), new Persona(sc.next(), sc.next()), sc.nextInt(), sc.next()));
            System.out.println("Audio añadido");
        } else {
            System.out.println("Ese ID ya está en uso");
        }
    }

    private void agregarVideo() {
        System.out.println("Ha elegido Video, introduzca ID");
        id = sc.nextInt();
        if (existeMultimedia(id) == null) {
            System.out.println("Introduce titulo, tamaño(nº), formato, nombre del autor, dni del autor, nombre del director, dni del director.");
            multimedia.add(new Video(id, sc.next(), sc.nextInt(), sc.next(), new Persona(sc.next(), sc.next()), new Persona(sc.next(), sc.next()), agregarActores()));
            System.out.println("Video añadido");
        } else {
            System.out.println("Ese ID ya está en uso");
        }
    }

    private ArrayList agregarActores() {
        ArrayList<Persona> actores = new ArrayList<>();
        System.out.println("¿Cuantos actores tiene la pelicula?");
        int nActores = sc.nextInt();
        for (int i = 0; i < nActores; i++) {
            System.out.println("Introduce nombre y DNI del " + (i + 1) + "º actor.");
            actores.add(new Persona(sc.next(), sc.next()));
        }
        return actores;
    }

    public void borrarElemento(int id) {
        if (existeMultimedia(id) == null) System.out.println("No existe elemento con ese ID");
        else {
            multimedia.remove(existeMultimedia(id));
            System.out.println("Elemento borrado correctamente");
        }
    }

    private ElementoMultimedia existeMultimedia(int id) {
        for (ElementoMultimedia item : multimedia) {
            if (item.getId() == id) return item;
        }
        return null;
    }


    //Listar

    public void menuListado(int num) {
        switch (num) {
            case 1:
                listarAudio();
                break;
            case 2:
                listarVideo();
                break;
            case 3:
                listarColeccion();
                break;
            default:
                System.out.println("Opción no contemplada");
                break;
        }
    }


    private void listarAudio() {
        System.out.println("\u001B[4mAUDIO:\u001B[0m");
        for (int i = 0; i < multimedia.size(); i++) {
            if (multimedia.get(i) instanceof Audio) {
                multimedia.get(i).mostrarDatos();
            }
        }
    }

    private void listarVideo() {
        System.out.println("\u001B[4mVIDEOS:\u001B[0m");
        for (ElementoMultimedia item : multimedia) {
            if (item instanceof Video) {
                item.mostrarDatos();
            }
        }
    }

    private void listarColeccion() {
        listarVideo();
        listarAudio();
        System.out.println("\u001B[4mLIBROS:\u001B[0m");
        for (int i = 0; i < multimedia.size(); i++) {
            if (multimedia.get(i) instanceof Libro) {
                multimedia.get(i).mostrarDatos();
            }
        }
    }



    public void listarAutor(String nombre) {
        if (existePersona(nombre) == null) {
            System.out.println("No tenemos registros de ese autor");
        } else {
            for (ElementoMultimedia item : multimedia) {
                if (item instanceof Libro && item.getAutor().getNombre().equalsIgnoreCase(nombre)) {
                    System.out.println("Título del libro: " + item.getTitulo());
                }
            }
        }
    }

    public void listarDirector(String nombre) {
        if (existePersona(nombre) == null) {
            System.out.println("No tenemos registros de ese director");
        } else {
            for (ElementoMultimedia item : multimedia) {
                if (item instanceof Video && ((Video) item).getDirector().getNombre().equalsIgnoreCase(nombre)) {
                    System.out.println("Título de la pelicula: " + item.getTitulo());
                }
            }
        }
    }

    public void listarActor(String nombre) {
        if (existePersona(nombre) == null) {
            System.out.println("No tenemos registros de ese actor");
        } else {
            for (ElementoMultimedia item : multimedia) {
                if (item instanceof Video) {
                    for (int i = 0; i < ((Video) item).getActores().size(); i++) {
                        if (((Video) item).getActores().get(i).getNombre().equalsIgnoreCase(nombre)) {
                            System.out.println("Película: " + item.getTitulo());
                        }
                    }
                }
            }
        }
    }


    private ElementoMultimedia existePersona(String nombre) {
        for (ElementoMultimedia item : multimedia) {
            if (item instanceof Video) {
                if (((Video) item).getDirector().getNombre().equalsIgnoreCase(nombre)) {
                    return item;
                } else {
                    for (int i = 0; i < ((Video) item).getActores().size(); i++) {
                        if (((Video) item).getActores().get(i).getNombre().equalsIgnoreCase(nombre)) return item;
                    }
                }
            } else if (item.getAutor().getNombre().equalsIgnoreCase(nombre)) return item;
        }
        return null;
    }


    //Getter & Setter
    public ArrayList<ElementoMultimedia> getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(ArrayList<ElementoMultimedia> multimedia) {
        this.multimedia = multimedia;
    }
}
