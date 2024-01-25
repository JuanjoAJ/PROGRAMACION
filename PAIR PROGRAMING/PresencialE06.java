import java.util.Scanner;

/*Escribe un programa que calcule la media de un conjunto de números positivos introducidos por teclado. A
priori, el programa no sabe cuántos números se introducirán. El usuario indicará que ha terminado de
introducir los datos cuando meta un número negativo.*/
public class PresencialE06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num,contador=0,suma=0;
        double media;
        do {
            System.out.println("Introduce un número");
            num= scanner.nextInt();
            if(num>=0){
                suma+=num;
                contador++;
            }
        }while (num>=0);
        if(contador>0) media= (double) suma/contador;
        else media=0;
        System.out.printf("La media de los números positivos introducidos es de %.2f", media);
    }
   
}
