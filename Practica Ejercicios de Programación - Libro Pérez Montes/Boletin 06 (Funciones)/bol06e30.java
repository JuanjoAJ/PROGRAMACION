import java.util.Scanner;

/*DUF recursiva que calcule an.*/
public class bol06e30 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int potencia, num;
        System.out.println("Introduzca la base");
        num=s.nextInt();
        System.out.println("Introduce la potencia");
        potencia=s.nextInt();
        System.out.println("El resultado es " + resultado(num,potencia));
    }
    public static int resultado(int base, int potencia){
        int resultado;
        if (base==0) resultado=1;
        else resultado=base*resultado(base,potencia-1); //usamos el método de forma recursiva
        return resultado;
    }
}
