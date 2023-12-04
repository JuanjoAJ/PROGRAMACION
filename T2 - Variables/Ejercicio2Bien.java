import java.util.*;
public class Ejercicio2Bien {

    public static void main(String[] args) {

        Scanner enteros = new Scanner(System.in);

        System.out.println("Introduce número 1: ");
        int var1= enteros.nextInt();
        System.out.println("Introduce número 2: ");
        int var2= enteros.nextInt();
        System.out.println("Introduce número 3: ");
        int var3= enteros.nextInt();
        System.out.println("Introduce número 4: ");
        int var4= enteros.nextInt();
        System.out.println("Introduce número 5: ");
        int var5= enteros.nextInt();

        System.out.println("Los números son: " + var1 + " " + var2 + " " + var3 + " " + var4 + " " + var5);

        System.out.println("Los valores asignados son: " + var1 + ", " + var2 + ", " + var3 + ", " + var4 + ", "
                + var5 + ".");

        int aux1;
        aux1=var1;
        var1=var2;
        var2=var3;
        var3=var4;
        var4=var5;
        var5=aux1;

        System.out.println("Los nuevos valores son: " + var1 + " " + var2 + " " + var3 + " " + var4 + " " + var5);

        aux1=var5;

        var5=var4;
        var4=var3;
        var3=var2;
        var2=var1;
        var1=aux1;


        System.out.println("Los nuevos valores son: " + var1 + " " + var2 + " " + var3 + " " + var4 + " " + var5 + " .");


    }
}
