//Escribe un programa que pida al usuario ingresar un número del 1 al 12 y muestre el nombre del mes correspondiente utilizando una sentencia switch.


import java.util.Scanner;
public class Switch_E05 {

    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);

        System.out.println("Introduce número de mes");

        int mes=teclado.nextInt();

        switch (mes) {
            case 1:
                System.out.println("Tiene 31 días");
                break;
            case 2:
                System.out.println("Tiene 28 días");
                break;
            case 3:
                System.out.println("Tiene 31 días");
                break;
            case 4:
                System.out.println("Tiene 30 días");
                break;
            case 5:
                System.out.println("Tiene 31 días");
                break;
            case 6:
                System.out.println("Tiene 30 días");
                break;
            case 7:
                System.out.println("Tiene 31 días");
                break;
            case 8:
                System.out.println("Tiene 31 días");
                break;
            case 9:
                System.out.println("Tiene 30 días");
                break;
            case 10:
                System.out.println("Tiene 31 días");
                break;
            case 11:
                System.out.println("Tiene 30 días");
                break;
            case 12:
                System.out.println("Tiene 31 días");
                break;
            default:
                System.out.println("Dato incorrecto");
        }

    }

}