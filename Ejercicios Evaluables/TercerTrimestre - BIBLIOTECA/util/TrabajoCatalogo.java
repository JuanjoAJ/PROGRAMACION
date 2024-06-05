package util;

import modelLibrary.Libro;

import java.io.*;
import java.util.HashMap;

public interface TrabajoCatalogo {
    default void imprimirFichero(int numFichero, String rutaSinObj, HashMap<String, Libro> libros){
        File file=null;
        ObjectOutputStream objectOutputStream=null;
        try {
            file=ficheroExiste(numFichero, rutaSinObj);
            objectOutputStream=new ObjectOutputStream(new FileOutputStream(file));
            for (String item:libros.keySet()){
                objectOutputStream.writeObject(libros.get(item));
            }


        } catch (FileNotFoundException e) {
            System.err.println("Fichero no encontrado// No dispones de los permisos para realizar esa operación");
        } catch (IOException e) {
            System.err.println("Error al escribir en el fichero" + e.getMessage());
        } finally {
            try {

                assert objectOutputStream != null;
                objectOutputStream.close();
            }catch (Exception e){
                System.err.println("Fallo en el cerrado");
            }
        }
    }

    private File ficheroExiste(int num, String rutaCarpeta){

        File file=new File(rutaCarpeta +"_"+ num +".obj");
        try{
            if (!file.exists() ){
                file.createNewFile();
            }else {
                num++;
                file=ficheroExiste(num, rutaCarpeta);
            }
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
        return file;

    }


}
