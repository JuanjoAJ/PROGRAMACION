import java.util.Scanner;

/*Programa que resuelva de forma recursiva las torres de HANOI:
*  - Trasladar n-1 desde el palo origen hasta el palo intermedio.
*  - Debería quedar un solo disco en el palo de origen: Lo pasamos al de destino
*  - Repetimos proceso con los n-1 discos que nos quedan en el palo intermedio, ayudandonos del palo origen.
*  - En funcion de qué movimiento hagamos, el palo origen, intermedio y destino puede ir cambiando
*    */
public class Hanoi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("¿Cuantos discos tiene la torre de Hanoi?");
        int disco= scanner.nextInt();
        hanoi(disco, "Origen", "Intermedio", "Destino");

    }
    public static void hanoi(int num, String pOrigen, String pIntermedio, String pDestino){
        if (num==1){
            System.out.println("Moviendo " + num +" de " + pOrigen + " a "+ pDestino);
        }else {
         hanoi(num-1, pOrigen, pDestino, pIntermedio);
            System.out.println("Moviendo " + num +" de " + pOrigen + " a "+ pDestino);
         hanoi(num-1, pIntermedio,pOrigen,pDestino);

        }
    }
}
