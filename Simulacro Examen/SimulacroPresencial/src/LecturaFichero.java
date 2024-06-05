import java.io.*;

public class LecturaFichero {
    public static void main(String[] args) {
        File file=new File("simulacro1/src/resources/ejercicio.txt");
        FileReader fileReader= null;
        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.err.println("No encontrado");
        }
        try {
            int lectura=-1;
            while ((lectura= fileReader.read())!=-1){
                System.out.print(lectura + " " + (char) lectura +" ");
            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally{
            try{
                assert fileReader != null;
                fileReader.close();
            }catch (IOException e) {
                throw new RuntimeException(e);
            }catch (NullPointerException e){
                System.out.println("Nulo en el reader");
            }


        }

    }
}
