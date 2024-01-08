import java.util.Scanner;

/*Realizar una función que calcule (muestre en pantalla) el área o el volumen de un cilindro, según
se especifique. Para distinguir un caso de otro se le pasará el carácter 'a' (para área) o 'v'
(para el volumen). Además hemos de pasarle a la función el radio y la altura.
 */
public class bol06e07 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduzca el radio");
        double radio= scanner.nextDouble();
        System.out.println("Introduzca altura");
        double alt= scanner.nextDouble();
        System.out.println("Elija 'a' si quiere calcular el área o 'v' si desea saber el volumen ");
        char opcion= scanner.next().toLowerCase().charAt(0);

        if(opcion=='a') System.out.println("El area del cilindro es " + calculo(opcion, radio, alt));
        else if (opcion=='v') System.out.println("El volumen es " + calculo(opcion, radio, alt));
        else System.out.println("Opción incorrecta");

    }

    public static double calculo(char opcion, double radio, double alt){
        switch (opcion){
            case 'a':
                return (2*Math.PI*radio*alt + 2*Math.PI*radio*radio);
            case 'v':
                return (Math.PI*radio*radio*alt);
        } return 0;


    }
}
