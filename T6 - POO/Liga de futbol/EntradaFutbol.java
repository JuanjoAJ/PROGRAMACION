import modelLiga.LigaFutbol;

import java.util.Scanner;

public class EntradaFutbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LigaFutbol laliga = new LigaFutbol();
        int opcion;
        System.out.println("\t⚽ Bienvenido a la Liga de Futbol ⚽");
        do {
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("Selecciona una de estas opciones:\n 1) Introducir los equipos" +
                    "\n 2) Introducir los jugadores de forma manual" +
                    "\n 3) Dar comienzo a la liga" +
                    "\n 4) Listar Equipos" +
                    "\n 5) Listar Jugadores" +
                    "\n 6) Listar Partidos" +
                    "\n 7) Mostrar Clasificación" +
                    "\n 8) Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Seleccione introducir los equipos: \n1) De forma manual \n2) De forma automática");
                    switch (scanner.nextInt()) {
                        case 1:
                            laliga.introducirEquiposManual();
                            break;
                        case 2:
                            if (laliga.getEquiposPrimera().isEmpty()) {
                                laliga.introducirEquiposAuto();
                            } else System.out.println("Ya hay equipos en la Liga");
                            break;
                        default:
                            System.out.println("Opción no contemplada");
                            break;
                    }
                    break;
                case 2:
                    laliga.introducirPlantillaManual();
                    break;
                case 3:
                    if (!laliga.getEquiposPrimera().isEmpty()) {
                        laliga.asignarPartidos();
                        laliga.jugarLiga();
                    } else {
                        System.out.println("No se puede jugar sin equipos");
                    }
                    break;
                case 4:
                    laliga.listarEquipos();
                    break;
                case 5:
                    laliga.listarJugadores();
                    break;
                case 6:
                    laliga.listarPartidos();
                    break;
                case 7:
                    laliga.verClasificacion();
                    break;
                default:
                    break;
            }
        } while (opcion < 8);

    }
}
