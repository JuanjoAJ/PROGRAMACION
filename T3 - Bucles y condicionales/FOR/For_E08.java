//Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la cantidad de ceros (NumerosTipos)
import java.util.*;
public class For_E08 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduzca 10 numeros");
        int num=0;
        int pos=0;
        int neg=0;
        int cont=0;
        int cont2=0;
        int cero=0;
        for (int i=1; i<11; i++) {
            System.out.println("Introduzca el número " + i);
            num=teclado.nextInt();
            if(num>0) {
                pos+=num;
                cont++;

            }else if(num<0) {
                neg+=num;
                cont2++;
            }else{
                cero++;
            }
        }

        if(pos>0) {
            System.out.println("La media de los números positivos es de : " + pos/cont);}
        if(neg<0) {
            System.out.println("La media de los números negativos es de : " + neg/cont2);}
        System.out.println("El número de ceros marcado es de : " + cero);
    }

}