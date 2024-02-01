import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*Crea un ArrayList de numeros enteros que guarde valores aleatorios (entre 0 y 100).
Una vez introducidos todos calcula la suma, la media, el máximo y el mínimo de esos números.*/
public class ArrayList_02 {
    public static void main(String[] args) {
        int suma=0;
        Random random=new Random();
        ArrayList<Integer> lista=new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            lista.add(random.nextInt(0,101));
            suma+= lista.get(i);
        }
        Collections.sort(lista);

        System.out.println("La suma de la lista es "+ suma);
        System.out.println("La media de la lista es " + (double)suma/ lista.size());
        System.out.println("El máximo de la lista es "+ lista.get(lista.size()-1));
        //System.out.println("El máximo de la lista es "+ lista.getLast());
        System.out.println("El mímino de la lista es " + lista.getFirst());
    }
}
