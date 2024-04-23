import java.io.*;

public class Traductor {
    public static void main(String[] args) {
        FileReader fileReader = null;
        BufferedReader bufferedReader=null;
        try {
            fileReader=new FileReader(new File("T8 - Ficheros/ASCIIFichero/documentos/código.txt"));
            bufferedReader=new BufferedReader(fileReader);
            int lectura=-1;
            String texto="";
            String[] text;
           while ((texto=bufferedReader.readLine())!=null){

               text=texto.split(" ");
               for (String s : text) {
                   System.out.print((char) Integer.parseInt(s));
               }
           }


        } catch (FileNotFoundException e) {
            System.err.println("Fichero no encontrado");
        } catch (IOException e) {
            System.err.println("Error en la lectura del fichero");
        }finally {
            try{
                assert bufferedReader != null;
                bufferedReader.close();
            }catch (IOException e){
                System.err.println("Error en cerrado");
            }
        }


    }
}
