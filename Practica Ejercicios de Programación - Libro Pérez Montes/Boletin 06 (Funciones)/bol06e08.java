import java.util.Scanner;

/*Ídem que devuelva una tabla con el área y el volumen.*/
public class bol06e08 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduzca el radio");
        double radio= scanner.nextDouble();
        System.out.println("Introduzca altura");
        double alt= scanner.nextDouble();
        double[] volArea=new double[2];
        volArea=calculo(volArea,radio,alt);
        System.out.println("Elija 'a' si quiere calcular el área o 'v' si desea saber el volumen ");
        char opcion= scanner.next().toLowerCase().charAt(0);

        if(opcion=='a') System.out.printf("El area del cilindro es %.2f",volArea[0]);
        else if (opcion=='v') System.out.printf("El volumen es %.2f", volArea[1]);
        else System.out.println("Opción incorrecta");

    }

    public static double[] calculo(double[] volArea, double radio, double alt){
       volArea[0]=2*Math.PI*radio*alt + 2*Math.PI*radio*radio;
       volArea[1]=Math.PI*radio*radio*alt;
       return volArea;

    }
}
