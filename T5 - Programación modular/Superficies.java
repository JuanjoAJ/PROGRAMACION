import java.util.Scanner;

public class Superficies {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Escoja: \n 1 Para calcular superficie de cuadrado \n 2 Para calcular superficie de triangulo");
        switch (scanner.nextInt()){
            case 1:
                System.out.println("Introduzca lado en cm");
                double lado= scanner.nextDouble();
                System.out.println("La superficie es de " + superficie(lado) + " cm.");

            case 2:
                System.out.println("Introduzca base en cm");
                double base= scanner.nextDouble();
                System.out.println("Altura");
                double altura= scanner.nextDouble();
                System.out.println("La superficie es de " + superficie(base, altura) + " cm.");
                break;
            default:
                System.out.println("Opción no contemplada");

        }
    }
    public static double superficie(double lado){
        return lado*lado;
    }
    public static double superficie(double base, double altura){
        return (base+altura)/2;
    }
}
