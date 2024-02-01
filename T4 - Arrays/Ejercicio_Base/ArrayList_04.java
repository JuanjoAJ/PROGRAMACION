import java.util.ArrayList;
import java.util.Objects;

/*Crea dos ArrayList de números y guarda de forma aleatorio 20 números sin decimales en cada uno de ellos.
Una vez hecho esto comprueba cuantos números de los dos arraylist son iguales (mismo número en la misma posición).
 Tras hacer la comprobación indica cuantos números han sido iguales*/
public class ArrayList_04 {
    public static void main(String[] args) {
        ArrayList<Integer>listaUno=new ArrayList<>();
        ArrayList<Integer>listaDos=new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            listaUno.add((int) (Math.random()*50)+1);
            listaDos.add((int) (Math.random()*50)+1);
        }
        for (Integer imp:listaUno) {
            System.out.print(imp + " ");
        }
        System.out.println();
        for (Integer imp:listaDos) {
            System.out.print(imp + " ");
        }
        System.out.println();
        repetido(listaUno,listaDos);

    }

    public static void repetido(ArrayList<Integer>listaUno, ArrayList<Integer>listaDos){
       int repe=0;
        ArrayList<Integer>repetidos=new ArrayList<>();
        for (int i = 0; i < listaDos.size(); i++) {
           if (Objects.equals(listaUno.get(i), listaDos.get(i))) {
               repe++;
               repetidos.add(listaUno.get(i));
           }
        }
        System.out.println("Hay un total de " + repe + " números repetidos" );
        if (repe>0) {
            System.out.println("Los números repetidos son: ");
            for (Integer imp:repetidos) {
                System.out.print(imp + " ");
            }
        }
    }

}
