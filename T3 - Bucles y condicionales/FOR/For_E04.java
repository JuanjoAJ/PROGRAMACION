/*Modificar el ejercicio anteriore para calcular la tabla de multiplicar de los numeros comprendidos en un rango de números pedidos.
 * Por ejemplo, las tablas de los números comprendidos entre el 3 y el 7
 * (3,4,5,6,7)
 */
import java.util.*;
public class For_E04 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Por favor introduzca dos números donde se comprenderán las tablas: ");
        int num=teclado.nextInt();
        int mul=0;
        int num2=teclado.nextInt();

        for (int i=num; i<=num2; i++) {

            System.out.println("La tabla de multiplicar " + num + " es: ");

            for (int j=1;j<11; j++) {
                mul=j*num;
                System.out.println( j + " x " + num + " = " + mul );
            }
            num++;
        }


    }

}
