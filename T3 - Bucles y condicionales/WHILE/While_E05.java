/*Crea un programa que genere un número aleatorio (entre 0 y 20) de entrada y lo guarde en una variable.
 *  El sistema irá pidiendo números al usuario hasta que coincida con el aleatorio generado
 *  (en caso de no coincidir mostrará el mensaje "Lo siento, intentalo de nuevo").
 *  Cuando coincida el sistema deberá mostar el mensaje "Enhorabuena, has acertado el número en 5 intentos"
 *  (Adivina)
 */
import java.util.*;
public class While_E05 {

    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);
        int aleatorio= (int) (Math.random()*21);
        int numero;
        int intentos=1;

        do{
            System.out.println("Por favor introduzca número");
            numero=teclado.nextInt();

            if(numero!=aleatorio) {
                intentos++;
                System.out.println("Lo siento, intentalo de nuevo");
            }


        }while(aleatorio!=numero);

        System.out.println("Enhorabuena, has acertado el número en " + intentos + " intentos.");

    }

}
