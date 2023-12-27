import java.util.Scanner;

/*Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.*/
public class bol02E20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, sueldo, sueldoM = 0;
        System.out.println("Introduce número de sueldos");
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Introduce sueldo");
            sueldo = scanner.nextInt();
            if (sueldoM < sueldo) sueldoM = sueldo;
        }
        System.out.println("El sueldo máximo es " + sueldoM);


    }
}
