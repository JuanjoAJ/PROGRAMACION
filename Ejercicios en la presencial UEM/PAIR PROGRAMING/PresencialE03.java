import java.util.Scanner;

/*Realiza un programa que calcule la nota que hace falta sacar en el segundo examen de la asignatura
Programación para obtener la media deseada. Hay que tener en cuenta que la nota del primer examen
cuenta el 40% y la del segundo examen un 60%.
Nota: la nota final se calcularía como notaFinal = ((nota_examen1 * 40) + (nota_examen2 * 60)) / 100*/
public class PresencialE03 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce la nota del primer examen");
        double notaPrimerExamen= teclado.nextDouble();
        System.out.println("¿Qué nota quieres sacar en el trimestre");
        double notaTrimestre= teclado.nextDouble();
        System.out.printf("Para tener un %.2f necesitas sacar un %.2f en el segundo examen",notaTrimestre,(((notaTrimestre*100)-(notaPrimerExamen*40))/60) );
    }
}
