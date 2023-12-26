import java.util.Scanner;

/*Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de
alumnos mayores de 18 años, y la cantidad de alumnos que miden más de 1.75.
*/
public class bol02E15 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int edad,mayorEdad=0,aluAlto=0,sumE=0;
        double altura,sumA=0, edadMedia,altMedia;
        for (int i = 0; i <5 ; i++) {
            System.out.println("Introduzca edad");
            edad=s.nextInt();
            sumE+=edad;
            System.out.println("Introduzca altura");
            altura=s.nextDouble();
            sumA+=altura;
            if (edad>=18) mayorEdad++;
            if (altura>1.75) aluAlto++;
        }
        edadMedia= (double) sumE/5;
        altMedia= sumA/5;

        System.out.printf("Los alumnos tienen una edad media de %.2f, con %d de personas con más de 18. Tenemos también una altura media de %.2f, con un total de %d alumnos con más de 1.75cm.",edadMedia,mayorEdad,altMedia,aluAlto);
    }

}
