package databaseLibrary;

import modelLibrary.*;
import util.TrabajoCatalogo;

import java.util.ArrayList;
import java.util.HashMap;

public class DatasetLibros implements TrabajoCatalogo {
   ArrayList<Libro> datasetLibros;
   ArrayList<LibroPoliciaca> datasetPoliciaca;
   ArrayList<LibroComedia> datasetComedia;
   ArrayList<LibroTerror> datasetTerror;


    public DatasetLibros() {
        datasetLibros=new ArrayList<>();
        datasetComedia=new ArrayList<>();
        datasetTerror=new ArrayList<>();
        datasetPoliciaca=new ArrayList<>();


    }

    public void agregarLibroBBDD(Libro libro){
        if (libro instanceof LibroComedia) datasetComedia.add((LibroComedia) libro);
        else if (libro instanceof LibroTerror) datasetTerror.add((LibroTerror) libro);
        else datasetPoliciaca.add((LibroPoliciaca) libro);

        datasetLibros.add(libro);
        System.out.println("Libro introducido correctamente en nuestra base de datos\n");
    }
    public <T extends Libro> T buscarLibro(String isbn, ArrayList<T> libros){
        for (T item:libros){
            if (item.getIsbn().equals(isbn)){
               return item;
            }
        }
        return null;
    }

    public void librosDataset(){
        System.out.println("Actualmente nuestra base de datos está forma por: \n");
        System.out.println("1. Libros de comedia: ");
        if (datasetComedia.isEmpty()){
            System.out.println("No tenemos acualmente libros de comedia 😂");
        }else{
        for (Libro item:datasetComedia){
            System.out.println(item);
        }

        System.out.println("2. Libros de terror: ");

        if(datasetTerror.isEmpty()){
            System.out.println("No tenemos actualmente libros de terror ☠");
        }else {
            for (Libro item:datasetTerror){
                    System.out.println(item);
                }
            }
        }

        System.out.println("3. Libros policiacos: ");

        if(datasetPoliciaca.isEmpty()){
            System.out.println("No tenemos registrados libros de tematica policiaca 🔫");
        }else {
            for (Libro item:datasetPoliciaca){
                System.out.println(item);
            }
        }

    }
    public void librosNocatalogo(){
        System.out.println("Los siguientes libros no están en ningun catalogo:");
        boolean vacio=true;
        for (Libro item:datasetLibros){
            if (item.getEnCatalogo()==0){
                item.mostrarDatos();
                System.out.println();
                vacio=false;
            }
        }
        if (vacio) System.out.println("Actualmente no tenemos libros fuera de catálogo \n");
    }


    private<T extends Libro> HashMap<String, Libro> mapeable(ArrayList<T> libros){
        HashMap<String, Libro> mapa=new HashMap<>();

        for (Libro item:libros){
            mapa.put(item.getIsbn(), item);
        }
        return mapa;
    }

   public void exportarCatalogos(){
       System.out.println("Exportando bases de datos");
        if(!datasetComedia.isEmpty()){
            imprimirFichero(1, "resources/DatasetComedia", mapeable(datasetComedia));
        }
        if (!datasetPoliciaca.isEmpty()){
            imprimirFichero(1, "resources/DatasetPoliciaca", mapeable(datasetPoliciaca));
        }
        if (!datasetTerror.isEmpty()){
            imprimirFichero(1, "resources/DatasetTerror", mapeable(datasetTerror));
        }
        if (datasetLibros.isEmpty()){
            System.out.println("No hay libros en la base de datos");
        }else{
            imprimirFichero(1, "resources/DatasetGenerico", mapeable(datasetLibros));
        }

   }

    //Getter & Setter
    public ArrayList<Libro> getDatasetLibros() {
        return datasetLibros;
    }

    public void setDatasetLibros(ArrayList<Libro> datasetLibros) {
        this.datasetLibros = datasetLibros;
    }

    public ArrayList<LibroPoliciaca> getDatasetPoliciaca() {
        return datasetPoliciaca;
    }

    public void setDatasetPoliciaca(ArrayList<LibroPoliciaca> datasetPoliciaca) {
        this.datasetPoliciaca = datasetPoliciaca;
    }

    public ArrayList<LibroComedia> getDatasetComedia() {
        return datasetComedia;
    }

    public void setDatasetComedia(ArrayList<LibroComedia> datasetComedia) {
        this.datasetComedia = datasetComedia;
    }

    public ArrayList<LibroTerror> getDatasetTerror() {
        return datasetTerror;
    }

    public void setDatasetTerror(ArrayList<LibroTerror> datasetTerror) {
        this.datasetTerror = datasetTerror;
    }

}
