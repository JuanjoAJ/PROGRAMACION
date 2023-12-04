/*Modifica el ejercicio anterior para que una vez adivinado el número el sistema muestre el siguiente mensaje:
 *  "Quieres volver a jugar (S/N)":
 *  En caso de introducir N la aplicación se detendrá
 *  En caso de introducir S la aplicación empezará de nuevo
 *  (generando un aleatorio, pidiendo números hasta acertar el generado, etc...)
 *  Cuando el usuario acierte el número generado se mostrará un mensaje diciendo
 *  si ha superado el record de intentos (si ha hecho menos intentos que las veces anteriores)
 *  (AdivinaRecord)
 */

import java.util.Scanner;

public class While_E06 {

    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);
        int numero;
        String jugar="";
        int resultado=999999999;

        do {
            int aleatorio= (int) (Math.random()*21);
            int intentos=1;
            do {


                System.out.println("Por favor introduzca número");
                numero=teclado.nextInt();

                if(numero!=aleatorio) {
                    intentos++;
                    System.out.println("Lo siento, intentalo de nuevo");
                }


            }while(aleatorio!=numero);
            System.out.println("Enhorabuena, has acertado el número en " + intentos + " intentos.");

            if (intentos<resultado) {
                System.out.println("Enhorabuena has superado tu record de intentos");
                resultado =intentos;
            }
            System.out.println("¿Quieres volver a jugar (S/N)?");
            jugar=teclado.next();


        }while (jugar.equalsIgnoreCase("S"));
    }

}