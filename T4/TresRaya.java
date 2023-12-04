import java.util.*;

public class TresRaya {
    public static String[][] tablero = new String[3][3];

    public static int fila, columna;
    public static boolean siguiente;

    public static Scanner s = new Scanner(System.in);

    public static int jugador;

    public static int fin;
    public static String volverJugar="";

    public static void main(String[] args) {
        do {
            System.out.println("Bienvenidos a la encarnizada batalla del tres en raya");
            tablero = new String[][]{{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};
            imprimir();
            do {
                System.out.println("Por favor elija jugador");
                jugador = s.nextInt();
                juego();
                ganador();
               if (fin==0) tablas();
            } while (fin == 0);
            if (fin == 1) {
                System.out.println("Enhorabuena jugador 1, has derrotado a tu rival");
            } else if (fin == 2) {
                System.out.println("Enhorabuena jugador 2, conseguiste vencer a tu rival");
            }else {
                System.out.println("El juego ha finalizado en tablas, no hay más hueco libre");
            }
            System.out.println("¿Quereis volver a jugar? \n SI \n NO");
            volverJugar=s.next();

        }while(volverJugar.equalsIgnoreCase("si"));
        System.out.println("Gracias por jugar con nosotros al Tres en Raya");

    }

    public static void imprimir() {
        for (String[] im : tablero) {
            for (String imp : im) {
                System.out.print("|" + imp + "|");
            }
            System.out.println();
        }
    }

    public static void juego(){
        switch (jugador) {
            case 1:
                do {
                    siguiente = false;
                    System.out.println("Jugador 1 indique la fila y columna donde desee escribir la X (Si desea volver a elegir jugador introduzca posición 3)");
                    fila = s.nextInt();
                    columna = s.nextInt();
                    if(fila >2 || columna>2){
                        break;
                    }
                    if (vacio()) {
                        tablero[fila][columna] = "X";
                        siguiente = true;

                    } else {
                        System.out.println("El hueco está ocupado.");
                    }
                    imprimir();
                } while (!siguiente);
                break;
            case 2:
                do {
                    siguiente = false;
                    System.out.println("Jugador 2 indique la fila y columna donde desee escribir la O. (Si desea volver a elegir jugador introduzca posición 3)");
                    fila = s.nextInt();
                    columna = s.nextInt();
                    if(fila >2 || columna>2){
                        break;
                    }
                    if (vacio()) {
                        tablero[fila][columna] = "O";
                        siguiente = true;
                    } else {
                        System.out.println("El hueco está ocupado.");
                    }
                    imprimir();

                } while (!siguiente);
                break;
        }


    }

    public static boolean vacio() {
        if (tablero[fila][columna].equals(" ")) {
            return true;
        }
        return false;
    }

    public static int ganador() {
        for (int i = 0; i < tablero.length; i++) {

            if (tablero[0][i].equals("X")&&tablero[1][i].equals("X")&&tablero[2][i].equals("X") || tablero[i][0].equals("X")&&tablero[i][1].equals("X")&&tablero[i][2].equals("X") || tablero[0][0].equals("X")&&tablero[1][1].equals("X")&&tablero[2][2].equals("X") || tablero[2][0].equals("X")&&tablero[1][1].equals("X")&&tablero[0][2].equals("X")) {
                return fin = 1;
            } else if (tablero[0][i].equals("O")&&tablero[1][i].equals("O")&&tablero[2][i].equals("O") || tablero[i][0].equals("O")&&tablero[i][1].equals("O")&&tablero[i][2].equals("O") || tablero[0][0].equals("O")&&tablero[1][1].equals("O")&&tablero[2][2].equals("O") || tablero[2][0].equals("O")&&tablero[1][1].equals("O")&&tablero[0][2].equals("O")) {
                return fin =2;
            }
        }

        return fin = 0;
    }

    public static int tablas(){
        for (String[] pri:tablero) {
            for (String seg:pri){
                if (seg.equals(" ")){
                    return fin=0;
                }

            }

        }
        return fin=3;
    }


}