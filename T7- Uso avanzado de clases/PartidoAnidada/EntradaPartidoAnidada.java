import modelPartidoAnidada.PartidoAnidada;

import java.util.Scanner;

public class EntradaPartidoAnidada {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        PartidoAnidada partidazo=new PartidoAnidada();
        String salir;

        partidazo.crearEquipoLocal( "Barcelona");
        partidazo.crearEquipoVisitante("Madrid");
        do {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    partidazo.marcarGoles("Local");
                    partidazo.marcarGoles("Visitante");
                }
                partidazo.mostrarResultado();
            }
            partidazo.resultado();
            partidazo.clasificacion();
            partidazo.reset();
            System.out.println("¿Desea salir?");
            salir= scanner.next();
        }while (!salir.equalsIgnoreCase("Si"));


    }
}
