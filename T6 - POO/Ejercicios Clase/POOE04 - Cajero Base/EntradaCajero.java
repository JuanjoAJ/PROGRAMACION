import model.Banco;

import java.util.Scanner;

public class EntradaCajero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco BBVA = new Banco();
        Banco Santander = new Banco();

        System.out.println("Introduce el banco con el que quieres operar\n" +
                "\t1. BBVA\n" +
                "\t2. Santander\n");
        switch (scanner.nextInt()) {
            case 1:
                System.out.println("--Seleccionado BBVA--\n" +
                        "1. Crear una cuenta\n" +
                        "2. Ingresar dinero\n" +
                        "3. Sacar dinero\n" +
                        "4. Ver cuentas de un cliente\n" +
                        "5. Ver todas las cuentas\n" +
                        "Que quieres hacer:\n" +
                        "\n");
                BBVA.menu(BBVA);
                break;
            case 2:
                System.out.println("--Seleccionado Santander--\n" +
                        "1. Crear una cuenta\n" +
                        "2. Ingresar dinero\n" +
                        "3. Sacar dinero\n" +
                        "4. Ver cuentas de un cliente\n" +
                        "5. Ver todas las cuentas\n" +
                        "Que quieres hacer:\n" +
                        "\n");
                Santander.menu(Santander);
                break;
            default:
                System.out.println("Opción no valida");
        }
    }
}
