import java.util.Scanner;

/*Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y
la cantidad de ceros.*/
public class bol02E13 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int contP=0, contN=0, contC=0, pos=0,neg=0;
        double medP, medN;
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduzca un número");
            int num= scanner.nextInt();
            if(num>0){
                pos+=num;
                contP++;
            } else if (num<0) {
                neg+=num;
                contN++;
            }else contC++;
        }
        if (pos==0){
            System.out.println("No hay media de positivos");
        } else if (neg==0) {
            System.out.println("No hay media de negativos");
        }else {
            medP= (double) pos/contP;
            medN= (double) neg/contN;
            System.out.printf("La media de positivos es %.2f, de negativos %.2f y la cantidad de ceros es de %d",medP,medN, contC);
        }


    }
}
