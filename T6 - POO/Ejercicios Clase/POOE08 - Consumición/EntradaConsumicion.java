import modelConsumicion.Cuenta;

import java.util.Hashtable;
import java.util.Scanner;

public class EntradaConsumicion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int opcion;
        Hashtable<Integer, Cuenta> consumiciones= new Hashtable<>();
        Cuenta juanjo=new Cuenta(1);
        Cuenta borja=new Cuenta(2);
        consumiciones.put(1, juanjo);
        consumiciones.put(2, borja);
        consumiciones.get(1).agregarArticulo();
        consumiciones.get(2).agregarArticulo();
        consumiciones.get(2).costeConsumicion();
        consumiciones.get(1).setEstado(false);
        do {
            System.out.println("Bienvenido a la cuenta del bar, selecciona una de las opciones, cuando quiera salir del sistema marque un número negativo:\n- Registrar una cuenta en la coleccion\n" +
                    "- Agregar artículos a una cuenta existente en la colección\n" +
                    "- Obtener el valor de una cuenta existente en la colección\n" +
                    "- Cambiar el estado de una cuenta existente en la colección.");
            opcion=scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Indica el identificador");
                    int identificador= scanner.nextInt();
                   consumiciones.put(identificador, new Cuenta(identificador));
                    break;
                case 2:
                    System.out.println("Indica el identificador");
                    consumiciones.get(scanner.nextInt()).agregarArticulo();

                    break;
                case 3:
                    System.out.println("Indica el identificador");
                    System.out.println("El coste de la identificación es " + consumiciones.get(scanner.nextInt()).costeConsumicion());
                    break;
                case 4:
                    System.out.println("Indica el identificador");
                    System.out.println("Indica el estado");
                    consumiciones.get(scanner.nextInt()).setEstado(scanner.hasNextBoolean());
                    break;
                default:
                    System.out.println("Opción no contemplada");

            }
        }while(opcion>0);











    }
}
