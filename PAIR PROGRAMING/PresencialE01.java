import java.util.Scanner;

/*Escribe un programa que calcule el volumen de un cono según la fórmula V = (π * r^2 * h)/3
Nota: para calcular r^2 podemos utilizar Math.pow(r, 2);*/
public class PresencialE01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce radio y altura del cono");
        int r=scanner.nextInt();
        int h= scanner.nextInt();
        System.out.println("El volumen del cono es de " + volumen(h,r));
    }
    public static int volumen(int h, int r){
       return (int) (Math.PI*Math.pow(r,2)*h)/3;
    }
}
