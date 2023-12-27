import java.util.Scanner;

/*Leer 5 números por teclado y a continuación realizar la media de los números positivos, la media
de los negativos y contar el número de ceros.*/
public class bol04e03 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int contC=0,contP=0,contN=0, pos=0, neg=0;
        int[] array=new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce número");
            array[i]=s.nextInt();

            if(array[i]>0) {
                contP++;
                pos+=array[i];
            }
            else if(array[i]<0){
                contN++;
                neg+=array[i];
            }
            else contC++;
        }
        double mediaP= (double) pos/contP;
        double mediaN= (double)neg/contN;

        System.out.printf("La media de positivos es de %.2f, de negativos es de %.2f y numero de ceros %d",mediaP,mediaN,contC);
    }
}
