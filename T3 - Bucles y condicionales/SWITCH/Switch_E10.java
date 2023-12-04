/*Crea un programa que permita al usuario ingresar un código de producto (como una cadena de caracteres)
 * y, utilizando una sentencia switch, muestre el nombre del producto y su precio correspondiente
 */
import java.util.*;
public class Switch_E10 {

    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);

        System.out.println("Por favor introduzca el código del producto" + "\n" + "11A" + "\n" + "11B" + "\n" + "11C");

        String code= teclado.next();

        switch (code) {

            case "11A":
                System.out.println("Ha escogido el producto A" + "\n" + "El precio es de 20$");
                break;
            case "11B":
                System.out.println("Ha escogido el producto B" + "\n" + "El precio es de 30$");
                break;
            case "11C":
                System.out.println("Ha escogido el producto C" + "\n" + "El precio es de 40$");
                break;
            default:
                System.out.println("Producto no encontrado");

        }
    }

}
