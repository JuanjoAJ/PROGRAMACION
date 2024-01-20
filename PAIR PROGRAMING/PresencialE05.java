import java.util.Scanner;

/*Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El programa pedirá la altura. El
palo horizontal de la L tendrá una longitud de la mitad (división entera entre 2) de la altura más uno*/
public class PresencialE05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la altura de la L");
        int h= sc.nextInt();

        for (int i=0; i<h; i++){
            System.out.println("*");
        }
        for (int i = 0; i < h/2+1; i++) {
            System.out.print("*  ");
        }

    }
}
