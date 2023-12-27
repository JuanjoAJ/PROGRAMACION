import java.util.Scanner;

/* Realizar un programa que nos pida un número n, y nos diga cuantos números hay entre 1 y n que son
primos. */
public class bol03E06 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int numero, primoCont=0;

        System.out.println("Introduzca un número");
        numero=s.nextInt();

        for (int i=0; i<=numero; i++){
             if (Primo(i)) primoCont++;
        }
        System.out.println("Hay un total de " + primoCont +" números primos. Entre " + 1 + " y " + numero);

    }
    public static boolean Primo (int numero){
        if (numero<2){
            return false;}
        for (int i=2; i<numero; i++){
            if (numero%i==0){
                return false;}
        }
        return true;
    }
}
