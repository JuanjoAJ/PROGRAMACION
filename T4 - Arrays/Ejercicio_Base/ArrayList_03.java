import java.util.ArrayList;
import java.util.Arrays;

/*Crea un programa que cree un ArrayList con los nombres de todos los compañeros de clase.
Una vez creado, sacará el nombre de uno de los compañeros (aleatorio)*/
public class ArrayList_03 {
    public static void main(String[] args) {
        ArrayList<String>lista=new ArrayList<>(Arrays.asList("Lidia", "Edu", "Jonatan", "Paco","Beatriz","Alejandra","Ignacio","Ana Sofia","Mario", "Gonzalo","Noelia", "Cristian", "Juanjo"));
        System.out.println(lista.get((int)(Math.random()* lista.size())));
    }
}
