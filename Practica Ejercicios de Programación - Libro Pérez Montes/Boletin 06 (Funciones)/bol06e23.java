import java.util.Scanner;

/*Diseñar una función que calcule la distancia euclídea de dos puntos.*/
public class bol06e23 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x1, x2, y2, y1;
        System.out.println("Introduce dos puntos");
        x1= scanner.nextInt();
        x2= scanner.nextInt();
        System.out.println("Introduce los siguientes dos puntos");
        y1= scanner.nextInt();
        y2= scanner.nextInt();

        System.out.println("La distancia euclidiana es: " + eucl(x1,x2,y1,y2));

    }

    public static double eucl(int a, int b, int c, int d){
        double eucl=Math.sqrt(Math.pow((b-a),2)+Math.pow((d-c),2));
        return eucl;
    }
}
