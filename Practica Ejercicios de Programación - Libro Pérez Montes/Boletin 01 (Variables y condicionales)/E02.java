/*Pedir el radio de un círculo y calcular su área. A=PI*r^2.*/
import java.util.Scanner;
public class E02 {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce el radio de una circunferencia");
        double radio= scanner.nextDouble();
        System.out.println("El area de la circunferencia es " + Math.PI*Math.pow(radio,2));
    }
}
