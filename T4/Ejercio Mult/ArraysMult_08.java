/*(InvisibleArray) Desarrolla un programa que simule el sorteo de un amigo invisible. Para ello el programa debe:
- pedir el número de participantes (de ser impar saltará un fallo)
- pedir el nombre de cada uno de los participantes
- sacar por pantalla el orden de las parejas resultantes → no sacar repetidos
*/

import java.util.*;

public class ArraysMult_08 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random r = new Random();
        String[] invisible;


        do {
            System.out.println("Por favor introduzca el número de participantes");

            invisible = new String[teclado.nextInt()];

            if (invisible.length % 2 != 0) {
                System.out.println("Lo siento, el programa no admite números impares");
            }
        } while (invisible.length % 2 != 0);

        for (int i = 0; i < invisible.length; i++) {
            System.out.println("Introduzca el nombre del participante número " + (i + 1));
            invisible[i] = teclado.next();
        }
        int[] posiciones = new int[invisible.length];

        for (int i = 1; i < posiciones.length; i++) {
            posiciones[i] = r.nextInt(0, posiciones.length);
            for (int j = 0; j < i; j++) {
                if (posiciones[i] == posiciones[j]) {
                    i--;
                }
            }
        }
        for (int z = 0; z < invisible.length / 2; z++) {

            System.out.println("Se ha emparejado a " + invisible[posiciones[z]] + " con "
                    + invisible[posiciones[posiciones.length - 1 - z]]);

        }

    }

}
