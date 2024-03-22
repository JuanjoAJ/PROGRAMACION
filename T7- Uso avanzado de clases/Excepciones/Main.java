import modelExcepciones.CuentaExcepcion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce número de Cuenta y saldo");
        try {
            CuentaExcepcion cuenta = new CuentaExcepcion(sc.next(), sc.nextDouble());
            do {
                System.out.println("Introduce dinero a sacar");
                cuenta.realizarTransaccion(sc.nextInt());
                System.out.println("¿Desea continuar?");
            }while (sc.next().equalsIgnoreCase("Si"));

        }catch (InputMismatchException e){
            System.out.println("Error en el proceso");
            System.out.println("Error del tipo: " + e.getClass().getName());
        }

    }
}
