import java.util.Scanner;

/*Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.*/
public class E12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=0,m,c,d,u;
        do {
            System.out.println("Introduzca un número entre 0 y 9999");
            num=scanner.nextInt();
            m=num/1000;
            c=(num%1000)/100;
            d=(num%100)/10;
            u=num%10;
            if(m==0) {
                num = u * 100 + d * 10 + c;
                if (c == 0) {
                    num = u * 10 + d;
                    if (d == 0) {
                        num = u;
                    }
                }
            }
            else {
                num=u*1000 + d*100 + c*10 +m;
            }
        }while (num<0 && num>9999);
        System.out.println(num);
    }

}
