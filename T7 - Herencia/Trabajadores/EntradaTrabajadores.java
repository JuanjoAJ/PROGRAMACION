import Controller.Empresa;

import java.util.Scanner;

public class EntradaTrabajadores {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("""
                    Bienvenido a la aplicación de Empresa, seleccione una de las opciones:
                     1) Registrar un trabajador
                     2) Listar trabajadores
                     3) Mostrar dato por DNI
                     4) Modo Jefe
                     """);
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Por favor indique el dni de la persona que quiere registrar");
                    empresa.registrarTrabajador(scanner.next());
                    break;
                case 2:
                    empresa.listarTrabajadores();
                    break;
                case 3:
                    System.out.println("Ingrese el DNI del trabajador que desee buscar: ");
                    empresa.mostrarTrabajador(scanner.next());
                    break;
                case 4:
                    empresa.modoJefe();
                    break;
                default:
                    System.out.println("Opción no contemplada");
                    break;
            }
            System.out.println("¿Desea continuar?");
        } while (scanner.next().equalsIgnoreCase("si"));
        System.out.println("Vuelva pronto");
    }
}
