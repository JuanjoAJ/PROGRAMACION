/*Modificar el ejercicio anterior para dibujar un cuadrado donde las aristas exteriores tengan el caracter -
 *y la parte inteirior del cuadrado tenga el caracter +. (CuadradoFormato)
 */
import java.util.*;
public class For_E12 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Por favor introduce un lado");
        int lado=teclado.nextInt();

        for (int i=0; i<lado; i++) {
            for (int j=0; j<lado; j++) {
                if(i==0 || i==(lado-1)) {
                    System.out.print("+\t");
                }else if(j==0 || j==(lado-1)) {
                    System.out.print("+\t");
                } else {
                    System.out.print("-\t");
                }
            }
            System.out.println(" \n");
        }
    }
}
