/*Pedir el radio de una circunferencia y calcular su longitud.*/


import java.util.Scanner;
public class E03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce el radio de una circunferencia");
        double radio= scanner.nextDouble();
        System.out.println("La longitud de la circunferencia es de " + 2*Math.PI*radio);
    }
}
