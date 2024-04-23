import javax.print.DocFlavor;
import java.io.*;
import java.util.ArrayList;

public class Lector {
    public static void main(String[] args) {
        BufferedReader bufferedReader=null;
        FileWriter fileWriter=null;
        int nLetras=0, nOraciones=0, nPalabras=0;
        int lectura=-1;
        try {
             bufferedReader=new BufferedReader(new FileReader(new File("T8 - Ficheros/LecturaBasica/documentos/texto.txt")));
            String texto= null;

            while ((texto = bufferedReader.readLine())!=null){
                System.out.println(texto);
                nPalabras=texto.split(" ").length;
                nLetras=texto.replaceAll("\\.", "").replaceAll(",", "").replaceAll(" ","").length();
                nOraciones=texto.replaceAll("\\.",",").split(",").length;

            }

            System.out.println("El numero de oraciones es " + nOraciones);
            System.out.println("El numero de palabras es " + nPalabras);
            System.out.println("El numero de letras es " + nLetras);

            File file=new File("T8 - Ficheros/LecturaBasica/documentos/ascii.txt");
            if (!file.exists()){
                file.createNewFile();
            }
            FileReader fileReader=new FileReader(new File("T8 - Ficheros/LecturaBasica/documentos/texto.txt"));
             fileWriter=new FileWriter(file, false);


            while((lectura= fileReader.read())!=-1){
                System.out.print( lectura + " ");

                fileWriter.write(lectura + " ");



            }
        } catch (FileNotFoundException e) {
            System.err.println("No se encuentra ese fichero");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try{
                assert bufferedReader != null;
                bufferedReader.close();
                assert fileWriter != null;
                fileWriter.close();
            } catch (IOException e) {
                System.err.println("Fallo en el cerrado");
            }
        }


    }
}
