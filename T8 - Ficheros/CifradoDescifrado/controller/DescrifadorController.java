package controller;

import java.io.*;

public class DescrifadorController {


    public void cifrar(String mensaje, int clave){

        File file=new File("T8 - Ficheros/CifradoDescifrado/resources/archivoCifrado.txt");
        FileWriter fileWriter=null;
        try{
            if (!file.exists()){
                file.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("Fallo al intentar acceder al fichero");
        }
        try{
            fileWriter=new FileWriter(file);
            for (int i = 0; i < mensaje.length(); i++) {
                fileWriter.write(mensaje.charAt(i)*clave);

            }
        }catch (IOException e) {
            throw new RuntimeException(e);
        }catch (NullPointerException e) {
            System.out.println("No se encuentra flujo");
        }finally{
            try {
                assert fileWriter != null;
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Fallo en el cerrado del flujo");
            }
        }


    }

    public void descifrar(String ruta, int clave){
        File file=new File(ruta);
        FileReader fileReader=null;

        if (!file.exists()) throw new RuntimeException("No existe el fichero");

        try{
            int lectura=-1;
            fileReader=new FileReader(file);
            while ((lectura= fileReader.read())!=-1){
                System.out.print((char) (lectura/clave));
            }

        } catch (IOException e) {
            System.out.println("Error en el trabajo con flujos");
        } catch (NullPointerException e){
            System.out.println("El archivo está vacio");
        }finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                System.out.println("Error en el cerrado");
            }

        }



    }



}
