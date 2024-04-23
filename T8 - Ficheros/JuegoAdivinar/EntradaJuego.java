import controller.Juego;
import java.util.Scanner;

public class EntradaJuego {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String juegoTerminado, mismoJugador="no", nombre="";
        Juego juego=new Juego();
        int numAleatorio, numIntentos, numTeclado;
        try{
            juego.lecturaFichero();
            do {
                numIntentos=0;
                numAleatorio=(int)(Math.random()*10)+1;
                if (mismoJugador.equals("no")){
                    scanner=new Scanner(System.in);
                    System.out.println("Introduce nombre del jugador");
                    nombre= scanner.nextLine();
                    juego.aniadirJugador(nombre);
                }
                do{
                    numIntentos++;
                    System.out.printf("Intento número %d. Introduce el número que crees que es ", numIntentos);
                    numTeclado= scanner.nextInt();
                    System.out.println();
                }while (numAleatorio!=numTeclado);

                juego.getJugadores().get(nombre).setRecordIntentos(numIntentos);
                System.out.println("Quieres seguir jugando");
                juegoTerminado= scanner.next().toLowerCase();
                if (juegoTerminado.equals("si")){
                    System.out.println("¿Quieres jugar con el mismo jugador?");
                    mismoJugador=scanner.next().toLowerCase();
                }
            }while (juegoTerminado.equals("si"));
        }catch (RuntimeException e){
            System.out.println("Error en la introducción de datos");
        }
        juego.imprimirFichero();

    }
}
