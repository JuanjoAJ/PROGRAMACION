package controller;

import modelLibrary.*;
import util.*;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;


public class Biblioteca<T extends Libro>{
    private Catalogo catalogo;
    private String nombre;
    private Persona director;
    private int codigoUnico;

    //Constructores
    public Biblioteca() {
    }

    public Biblioteca(int codigoUnico, String nombre, Persona director) {

        this.nombre = nombre;
        this.director = director;
        this.codigoUnico =codigoUnico;
    }

    //Métodos


    @Override
    public String toString() {
        return "Biblioteca " + nombre + " con código único " + codigoUnico +"\ncuyo director es " + director;
    }

    public void construirCatalogo(int numLibros) throws BibliotecaExcepcion{
        if(catalogo==null){
          catalogo=new Catalogo(numLibros);
            System.out.println("Catalogo creado correctamente");
        }else throw new BibliotecaExcepcion("Ya existe un catálogo");
    }
    public void datosLibro(String isbn) throws NoCatalogoExcepcion{
        if (catalogo==null) throw new NoCatalogoExcepcion("No existe catálogo. No se pueden hacer operaciones sin catalogo");
       try{
           catalogo.buscarLibro(isbn).mostrarDatos();
       }catch (BibliotecaExcepcion e){
           System.err.println(e.getMessage());
       }
    }

    public void agregarLibrosCatalogo(T libro) throws NoCatalogoExcepcion, NullPointerException{
        if (catalogo==null) throw new NoCatalogoExcepcion("No existe catalogo. No se pueden hacer operaciones sin catalogo");
        try{
            catalogo.agregarLibros(libro);
        }catch (FueraLimitesCatalogoExcepcion | LibroIntroducidoExcepcion e){
            System.err.println(e.getMessage());
        }
    }

    public void agregarLibrosCatalogo(ArrayList<T> libros) throws NoCatalogoExcepcion{
        if (catalogo==null) throw new NoCatalogoExcepcion("No existe catalogo. No se pueden hacer operaciones sin catalogo");
        try{
            catalogo.importarCatalogo(libros);
        }catch (FueraLimitesCatalogoExcepcion | LibroIntroducidoExcepcion e){
            System.err.println(e.getMessage());
        }

    }   //No usado en la entrada, pero es un método que se podría usar si queremos importar un dataset entero en nuestra biblioteca

    public void sacarLibroBiblioteca(String isbn) throws NoCatalogoExcepcion{
        if (catalogo==null) throw new NoCatalogoExcepcion("No existe catalogo. No se pueden hacer operaciones sin catalogo");
        catalogo.sacarLibro(isbn);
        System.out.println("Libro eliminado correctamente");
        System.out.println("El catalogo tiene un hueco de " + catalogo.librosDisponibles + " libros");
       }
    public void listarCatalogo() throws NoCatalogoExcepcion{
      if (catalogo==null) throw new NoCatalogoExcepcion("No existe catalogo. No se pueden hacer operaciones sin catalogo");
      try {
          catalogo.listarLibros();
      }catch (BibliotecaExcepcion e){
          System.err.println(e.getMessage());
      }
    }
    public void exportarFichero(String rutaSinObj) throws NoCatalogoExcepcion{
        if (catalogo==null) throw new NoCatalogoExcepcion("No existe catálogo. No se pueden hacer operaciones sin catalogo");
        catalogo.imprimirFichero(1, rutaSinObj);
    }


    //Getter & Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona getDirector() {
        return director;
    }

    public void setDirector(Persona director) {
        this.director = director;
    }

    public int getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(int codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    class Catalogo implements TrabajoCatalogo{

        HashMap<String, Libro> libros;
        int tamanioCatalogo, librosDisponibles;

        public Catalogo() {
            libros = new HashMap<>();
        }

        public Catalogo(int tamanioCatalogo){
            this.tamanioCatalogo=tamanioCatalogo;
            librosDisponibles=tamanioCatalogo;
            libros=new HashMap<>();
        }
        //Métodos
        public void agregarLibros(T libro) throws FueraLimitesCatalogoExcepcion, LibroIntroducidoExcepcion {
            if (libros.containsKey(libro.getIsbn())){
                throw new LibroIntroducidoExcepcion("El libro ya está en el catalogo");
            } else if (libro.getIsbn()==null) {
                throw new LibroIntroducidoExcepcion("No puedes introducir un libro sin ISBN");
            }
            if(librosDisponibles>0){
                libros.put(libro.getIsbn(), libro);
                librosDisponibles--;
                libro.setEnCatalogo(libro.getEnCatalogo()+1);
                System.out.println("Libro agregado correctamente. Quedan " + librosDisponibles + " huecos disponibles");
            }else throw new FueraLimitesCatalogoExcepcion("No hay hueco para introducir el libro");
        }


        public void importarCatalogo(ArrayList<T> catalogo) throws FueraLimitesCatalogoExcepcion, LibroIntroducidoExcepcion{
            if (librosDisponibles<catalogo.size()) throw new FueraLimitesCatalogoExcepcion("El tamaño del catalogo no soporta tanta cantidad de libros");
            for (int i = 0; i < catalogo.size(); i++) {
                try {
                    if (libros.containsKey(catalogo.get(i).getIsbn())) {
                        throw new LibroIntroducidoExcepcion("El libro ya está en el catalogo");
                    }
                    libros.put(catalogo.get(i).getIsbn(), catalogo.get(i));
                    librosDisponibles--;

                } catch (LibroIntroducidoExcepcion e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        public void sacarLibro(String isbn) {
            try {
                if (buscarLibro(isbn) != null){
                    libros.get(isbn).setEnCatalogo(libros.get(isbn).getEnCatalogo()-1);
                    libros.remove(isbn);
                    librosDisponibles++;

                }
            }catch (BibliotecaExcepcion e){
                System.err.println(e.getMessage());
            }
        }
        public Libro buscarLibro(String isbn) throws BibliotecaExcepcion{
            if(libros.isEmpty()) throw new BibliotecaExcepcion("El catálogo está vacio");
            Libro existeLibro=libros.get(isbn);
            if (existeLibro!=null) return existeLibro;
            else throw new BibliotecaExcepcion("No existe ese ISBN en el catálogo");
        }
        public  void listarLibros() throws BibliotecaExcepcion{
            if (!libros.isEmpty()) {
                System.out.println("En el catalogo hay hueco para " + tamanioCatalogo + " y hay " + librosDisponibles + " libros disponibles.");
                System.out.println("Los libros son los siguientes: ");
                for (String item : libros.keySet()) {
                    libros.get(item).mostrarDatos();
                    System.out.println();
                }
            }else throw new BibliotecaExcepcion("No hay libros en el catalogo");

        }


        public void imprimirFichero(int numFichero, String rutaSinObj){
           imprimirFichero(numFichero, rutaSinObj, libros);
        }

        //Getter & Setter
        public HashMap<String, Libro> getLibros() {
            return libros;
        }

        public void setLibros(HashMap<String, Libro> libros) {
            this.libros = libros;
        }

        public int getTamanioCatalogo() {
            return tamanioCatalogo;
        }

        public void setTamanioCatalogo(int tamanioCatalogo) {
            this.tamanioCatalogo = tamanioCatalogo;
        }

        public int getLibrosDisponibles() {
            return librosDisponibles;
        }

        public void setLibrosDisponibles(int librosDisponibles) {
            this.librosDisponibles = librosDisponibles;
        }
    }
}

