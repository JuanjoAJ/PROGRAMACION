/*Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce su jugada y luego el usuario 2. Si
alguno de los usuarios introduce una opción incorrecta, el programa deberá mostrar un mensaje de error.*/

import javax.swing.*;
import java.util.Scanner;

public class PresencialE04 {
    public static void main(String[] args) {
       String jugadaUno=jugada(1);
       String jugadaDos=jugada(2);

       if(jugadaUno.equals("papel")|| jugadaUno.equals("piedra")||jugadaUno.equals("tijera") &&  jugadaDos.equals("papel")|| jugadaDos.equals("piedra")||jugadaDos.equals("tijera")) juego(jugadaUno,jugadaDos);
        else System.out.println("Opción no contemplada");
    }
    public static String jugada(int jugador){
        Scanner sc=new Scanner(System.in);
        String jugada= JOptionPane.showInputDialog("Buenas jugador " + jugador + ". Introduce tu jugada").toLowerCase();
        return jugada;
    }
    public static void juego(String uno, String dos){
        if(uno.equals(dos)){
            System.out.println("Empate");
        }else{
           if (uno.equals("piedra")){
               if (dos.equals("papel")) System.out.println("Gana jugador dos");
               else System.out.println("Gana jugador uno");
           } else if (uno.equals("papel")) {
               if (dos.equals("tijera")) System.out.println("Gana jugador dos");
               else System.out.println("Gana jugador uno");
           } else {
               if(dos.equals("piedra"))System.out.println("Gana jugador dos");
               else System.out.println("Gana jugador uno");
           }
        }


    }
}
