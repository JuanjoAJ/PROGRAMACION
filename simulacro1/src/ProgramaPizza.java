import java.util.Scanner;

public class ProgramaPizza {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Indica el nombre de la pizza");
        String nombre= scanner.next();
        int precio;
        Pizza pizza=new Pizza(nombre);

        System.out.println("¿Cuantos ingredientes quieres?");
        int num= scanner.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("Nombre del ingrediente" +(i+1));
            nombre= scanner.next();
            System.out.println("Precio del ingrediente"+(i+1));
            precio= scanner.nextInt();
            pizza.aniadirIngredientes(nombre,precio );
        }

        System.out.println(pizza);



    }

}
