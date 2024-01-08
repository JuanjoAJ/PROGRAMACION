import java.util.Scanner;

/*Dado el valor de un ángulo, sería interesante saber su seno, coseno y tangente. Escribir
una función que muestre en pantalla los datos anteriores.
*/
public class bol06e22 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double angulo=scanner.nextDouble();
        angulo=Math.PI/180*angulo;
        trigonometria(angulo);
    }
    public static void trigonometria(double n){
        double seno=Math.sin(n);
        double coseno=Math.cos(n);
        System.out.println("El seno es : " + seno +"\nEl coseno es : " + coseno + "\nLa tangente es: " + Math.tan(n));

    }
}
