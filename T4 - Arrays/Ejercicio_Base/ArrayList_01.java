import java.util.ArrayList;
import java.util.Arrays;

/*1. Crea un ArrayList de String y realiza las siguientes acciones
- Guarda manualmente 10 palabras
- Imprime por pantalla todas las palabras del arraylist*/
public class ArrayList_01 {
    public static void main(String[] args) {
        ArrayList<String> lista=new ArrayList<>(Arrays.asList("Hola,","este","es","mi","primer","Arrays","List."));
        lista.add("Espero");
        lista.add("estar");
        lista.add("haciéndolo bien.");
        for (String imp:lista) {
            if (imp.equals("Espero")) System.out.println();
            System.out.print(imp +" ");
        }
        System.out.println("😎");


    }

}
