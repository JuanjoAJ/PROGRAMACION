import controller.Centralita;

import java.util.Scanner;

public class EntradaLlamadaHerencia {
    public static void main(String[] args) {
        Centralita centralita=new Centralita();
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("""
                    Elija una de las siguientes opciones:
                     1) Registrar llamada
                     2) Mostrar llamadas
                     3) Mostrar el coste total""");
            switch (scanner.nextInt()){
                case 1:
                    centralita.registrarLlamadas();
                    break;
                case 2:
                    centralita.mostrarLlamadas();
                    break;
                case 3:
                    centralita.mostrarCostes();
                    break;
                default:
                    break;
            }
            System.out.println("¿Desea continuar?");
        }while (scanner.next().equalsIgnoreCase("si"));



    }
}
