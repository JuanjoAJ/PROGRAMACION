/*Crear un programa que permita realizar un juego de adivinación. Para ello el sistema nada más empezar generará un número aleatorio entre 1 y 30.
 * Tras la generación de este número el usuario contará con 10 intentos para poder adivinarlo.
 *  Para lo cual se irá pidiendo un números y en el caso de aceptarlo terminará el proceso con el mensaje "Has adivinado el número en X intentos".
 * En el caso de agotar los intentos aparecerá el menaje "Lo siento, has agotado todos los intentos”
 */
import java.util.*;
public class For_E15 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int random= (int) (Math.random()*31);
        int suma=1, contador=10;

        for(int i=0; i<suma; i++) {
            System.out.println("Introduzca un número, dispone de " + contador-- + " intentos para lograrlo");
            int intento=teclado.nextInt();
            if(intento==random) {
                System.out.printf("Enhorabuena lo has adivinado con tan solo %d intentos", suma);
                suma=0;
            }else if(suma<=10) {
                suma++;
            }else {
                System.out.println("Lo siento, has agotado los intentos" + random);
            }
        }
    }
}
