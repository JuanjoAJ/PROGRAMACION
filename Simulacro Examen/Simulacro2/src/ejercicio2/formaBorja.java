package ejercicio2;

import java.io.*;

public class formaBorja {
    public static void main(String[] args) {
        File file=new File("src/ejercicio2/alumnos.txt");
        BufferedReader bufferedReader=null;

        try {
            bufferedReader=new BufferedReader(new FileReader(file));
            String lectura;
            String nombre="";
            int notaMax=0;
            while ((lectura= bufferedReader.readLine())!=null){
                if (notaMax< Integer.parseInt(lectura.split(", ")[3])){
                    notaMax= Integer.parseInt(lectura.split(", ")[3]);
                    nombre=lectura.split(", ")[0]+" "+lectura.split(", ")[1];
                }

            }
            System.out.printf("La nota más alta de los alumnos es de %d y la consiguió %s", notaMax, nombre);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader.close();
            }catch (IOException | NullPointerException e) {
                System.out.println("Error en cerrado");
            }
        }

    }
}
