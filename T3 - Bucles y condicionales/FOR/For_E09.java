//Pedir 10 sueldos. Mostrar su suma, media y cuantos hay mayores de 1000€.(Sueldos)


import java.util.*;
public class For_E09 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduzca 10 sueldos");
        int suma=0;
        int sue;
        int may=0;
        for(int i=0;i<10;i++) {
            sue=teclado.nextInt();
            suma+=sue;
            if(sue>1000) {
                may++;
            }
        }
        System.out.println("La suma de los sueldos es de " + suma + " su media es de " + suma/10 + " y hay " + may + " sueldos mayores de 1000€");
    }
}