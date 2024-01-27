import java.util.Scanner;
import model.*;
public class Entrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangulo triangulo;
        Circulo circulo;
        Cuadrado cuadrado;
        String continuar = "";
        do {

            System.out.println("Selecciona una de las siguientes opciones: \n" +
                    "1 - Operaciones con triángulo. \n2 - Operaciones con círculo. " +
                    "\n3 - Operaciones con cuadrado.");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Bienvenido al cálculo con triángulos. Introduce base y altura:");
                    triangulo = new Triangulo(scanner.nextInt(), scanner.nextInt());
                    triangulo.calculoArea();
                    triangulo.mostrarDatos();
                    System.out.println("\nSi desea continuar introduzca enter, o introduzca cualquier otra cosa para finalizar el programa");
                    continuar=scanner.next();
                    break;
                case 2:
                    System.out.println("Bienvenido al cálculo con círculos. Introduce radio ");
                    circulo=new Circulo(scanner.nextInt());
                    circulo.calculoArea();
                    circulo.calculoDiametro();
                    circulo.mostrarDatos();
                    System.out.println("\nSi desea continuar introduzca enter, o introduzca cualquier otra cosa para finalizar el programa");
                    continuar=scanner.next();
                    break;
                case 3:
                    System.out.println("Bienvenido al cálculo con cuadrado. Introduce base y altura:");
                    cuadrado=new Cuadrado(scanner.nextInt(), scanner.nextInt());
                    cuadrado.calculoArea();
                    cuadrado.calculoPerimetro();
                    cuadrado.mostrarDatos();
                    System.out.println("\nSi desea continuar introduzca enter, o introduzca cualquier otra cosa para finalizar el programa");
                    continuar=scanner.next();
                    break;
                default:
                    System.out.println("Opción no contemplada");
                    break;
            }
        } while (continuar.equalsIgnoreCase("enter") || continuar.isEmpty());
    }
}
