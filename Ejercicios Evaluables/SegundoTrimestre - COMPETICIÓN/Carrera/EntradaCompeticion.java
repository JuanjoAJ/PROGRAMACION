import Controller.Competicion;

import java.util.Scanner;

public class EntradaCompeticion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Competicion formulaUno = new Competicion();

        do {
            System.out.println("""
                    Bienvenidos a la competición de la Formula Uno:
                     1) Inscriba a los participantes.
                     2) Ingrese circuito.
                     3) Mostrar datos de todos los participantes.
                     4) Mostrar datos de un solo participante.
                     5) Mostrar datos de los circuitos.
                     6) Que de comienzo la competición manual.
                     7) Que comience la competición automática.
                     8) Mostrar el podium final.
                     9) Eliminar un participante.
                     10) Resetear la puntuación.
                     11) Resetear circuitos.
                    """);

            switch (scanner.nextInt()) {
                case 1:
                    formulaUno.ingresarParticipantes();
                    break;
                case 2:
                    formulaUno.ingresarCompeticion();
                    break;
                case 3:
                    formulaUno.mostrarDatos();
                    break;
                case 4:
                    formulaUno.mostrarDatosIndividual();
                    break;
                case 5:
                    if (formulaUno.getCircuitos().isEmpty()) {
                        System.out.println("No hay circuitos a mostrar");
                    } else {
                        formulaUno.mostrarCircuitos();
                    }
                    break;
                case 6:
                    if (formulaUno.getParticipantes().isEmpty() || formulaUno.getCircuitos().isEmpty()) {
                        System.out.println("No podemos empezar una competición sin partipantes o circuitos");
                    } else {
                        formulaUno.iniciarCompeticion();
                    }
                    break;
                case 7:
                    formulaUno.iniciarPanel();
                    break;
                case 8:
                    formulaUno.podiumFinal();
                    break;
                case 9:
                    formulaUno.eliminarParticipante();
                    break;
                case 10:
                    formulaUno.resetearPuntuacion();
                    break;
                case 11:
                    formulaUno.resetearCircuitos();
                    break;
                default:
                    System.out.println("Opción no contemplada en el menú");
                    break;
            }
            System.out.println("¿Desea continuar?");
        } while (scanner.next().equalsIgnoreCase("si"));
        System.out.println("Gracias por participar en la gran competición");

    }
}
