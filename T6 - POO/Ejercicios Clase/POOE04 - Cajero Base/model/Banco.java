package model;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Banco {
    Random r = new Random();
    private ArrayList<Usuario> cuentas = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void abrirCuenta() {
        System.out.println("Introduzca dni");
        String dni = scanner.next();
        System.out.println("Introduzca pin");
        int pin = scanner.nextInt();
        System.out.println("Introduzca saldo inicial");
        int saldoInicial = scanner.nextInt();

        cuentas.add(new Usuario(pin, saldoInicial, dni, asignarISBN()));
        System.out.println("Cuenta añadida con éxito");
    }

    public void cancelarCuenta() {
        System.out.println("Introduzca dni de la cuenta que desea cancelar");
        String dni = scanner.next();
        System.out.println("Introduzca pin");
        int pin = scanner.nextInt();
        if (existeCuenta(dni, pin)) {
            for (int i = 0; i < cuentas.size(); i++) {
                if (dni.equals(cuentas.get(i).getDni()) && cuentas.get(i).getPass() == pin) {
                    cuentas.remove(i);
                }
            }
            System.out.println("---Cuenta eliminada correctamente---");
        }
    }

    public void mostrarCuentas() {
        if (cuentas.isEmpty()) {
            System.out.println("No existen usuarios en el banco");
        } else {
            for (Usuario item : cuentas) {
                System.out.println("DNI: " + item.getDni());
                System.out.println("ISBN: " + item.getIsbn());
                System.out.println("Saldo actual:  " + item.getSaldoInicial());
            }
            System.out.println("--- Listadas cuentas correctamente ---");
        }
    }

    public void ingresarSaldo() {

        System.out.println("Introduce DNI de titular");
        String dni = scanner.next();
        System.out.println("Introduce pin asociado");
        int pin = scanner.nextInt();
        System.out.println("Introduce saldo a ingresar");
        int dinero = scanner.nextInt();
        if (dinero > 0) {
            if (existeCuenta(dni, pin)) {
                for (int i = 0; i < cuentas.size(); i++) {
                    if (dni.equals(cuentas.get(i).getDni()) && cuentas.get(i).getPass() == pin) {
                        cuentas.get(i).setIngreso(dinero);
                        System.out.println("--- Dinero ingresado correctamente ---");
                    }
                }
            } else System.out.println("---No se puede ingresar una cantidad negativa---");
        }
    }

    public void sacarDinero() {

        System.out.println("Introduce DNI de titular");
        String dni = scanner.next();
        System.out.println("Introduce pin asociado");
        int pin = scanner.nextInt();
        System.out.println("Introduce saldo a sacar");
        int dinero = scanner.nextInt();
        if (dinero > 0) {
            if (existeCuenta(dni, pin)) {
                for (int i = 0; i < cuentas.size(); i++) {
                    if (dni.equals(cuentas.get(i).getDni()) && cuentas.get(i).getPass() == pin) {
                        cuentas.get(i).sacarDineroUsuario(dinero);
                        System.out.println("--- Dinero sacado correctamente ---");
                    }
                }
            } else System.out.println("---No se puede sacar una cantidad negativa---");
        }
    }

    public void cuentasCliente() {
        System.out.println("Introduce DNI de titular");
        String dni = scanner.next();
        for (Usuario imp : cuentas) {
            if (imp.getDni().equals(dni)) {
                System.out.println("ISBN: " + imp.getIsbn());
                System.out.println("Saldo: " + imp.getSaldoInicial());

            }
        }
        System.out.println("--- Listadas cuentas correctamente ---");
    }


    private int asignarISBN() {
        int aleatorio;
        do {
            aleatorio = r.nextInt(1, 10001);
        } while (repeISBN(aleatorio));
        return aleatorio;
    }

    private boolean repeISBN(int isbn) {
        for (Usuario item : cuentas) {
            if (isbn == item.getIsbn()) return true;
        }
        return false;
    }

    private boolean existeCuenta(String dni, int pin) {
        for (Usuario comp : cuentas) {
            if (comp.getDni().equals(dni)) {
                if (comp.getPass() == pin) {
                    return true;
                } else {
                    System.out.println("Contraseña incorrecta");
                    return false;
                }
            }
        }
        System.out.println("Usuario no existe");
        return false;


    }

    public void menu(Banco banco) {
        switch (scanner.nextInt()) {
            case 1:
                banco.abrirCuenta();
                break;
            case 2:

                banco.ingresarSaldo();
                break;

            case 3:

                banco.sacarDinero();
                break;
            case 4:

                banco.cuentasCliente();
                break;
            case 5:

                banco.mostrarCuentas();
                break;
            default:
                System.out.println("Opción no válida");

        }


    }


}
