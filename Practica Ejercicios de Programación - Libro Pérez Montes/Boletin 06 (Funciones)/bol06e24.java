import java.util.Scanner;

/*DUF a la que se le pasa como parámetro una tabla que debe rellenar. Se leerá por teclado una
serie de números: guardaremos solo los pares e ignoraremos los impares. También hay que devolver la
cantidad de impares ignorados.*/
public class bol06e24 {
    public static void main(String[] args) {

        int[] t=new int[10];
        System.out.println("Los impares ignorados son " + par(t));
        System.out.println("Los pares son los siguientes");
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i] + " ");
        }


    }
    public static int par(int[]a){
        Scanner scanner=new Scanner(System.in);
        int impares=0, aux, i=0;
        do {
            System.out.println("Introduce número");
            aux= scanner.nextInt();
            if (aux%2==0){
                a[i]=aux;
                i++;
            }
            else {
                impares++;

            }
        }while (i<a.length);
        return impares;
    }

}
