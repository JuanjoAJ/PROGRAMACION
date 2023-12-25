/*Pedir un número entre 0 y 9.999, decir si es capicúa*/

import java.util.Scanner;

public class E13 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=0, u, d, c, m;
        do {
            System.out.println("Introduce un número entre 0 y 9999");
            num= scanner.nextInt();
            m=num/1000;
            c=(num%1000)/100;
            d=(num%100)/10;
            u=num%10;

            if(m==0){
                if (c==0){
                    if (d==0){
                        System.out.println("Si solo hay un número como va a ser capicúa, MELÓN");
                        break;
                    }
                    if (d==u) {
                        System.out.printf("%d puede leerse derecha a izquierda y viceversa",num);
                        break;
                    }
                    else {
                        System.out.println("No es capicúa");
                        break;
                    }
                }
                if (c==u){
                    System.out.println("El número " + num + " es capicúa");
                }
                else {
                    System.out.println("No es capicúa");
                }
            }
            else {
                if (m==u && d==c) System.out.println(num + " es capicúa");
                else System.out.println("No es capicúa");
            }



        }while (num<0 && num>9999);

    }
}
