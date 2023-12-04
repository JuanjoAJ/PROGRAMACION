//Simúlese el lanzamiento de un dado. Se introducirá el número de veces que se lanza el dado (de no ser positivo, se establecerá a 100). (Dado)

import java.util.*;

public class For_E07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el número de veces que quieres tirar el dado");
        int tirada = teclado.nextInt();
        int dado = 0;
        if (tirada < 0) {

            tirada = 100;
            System.out.println("El resultado de tirar el dado " + tirada + " veces es ");
            for (int i = 0; i < tirada; i++) {
                dado = (int) (Math.random() * 6) + 1;
                System.out.println(dado);
            }

        } else {
            System.out.println("El resultado de tirar el dado " + tirada + " veces es ");
            for (int i = 0; i < tirada; i++) {
                dado = (int) (Math.random() * 6) + 1;
                System.out.println(dado);
            }
        }
    }
}