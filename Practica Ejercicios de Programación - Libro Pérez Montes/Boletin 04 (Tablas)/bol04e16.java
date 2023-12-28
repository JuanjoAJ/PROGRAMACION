import java.util.Scanner;

/* Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro educativo. Cada
grupo (o clase) está compuesto por 5 alumnos. Se pide leer las notas del primer, segundo y tercer
trimestre de un grupo.
Debemos mostrar al final: la nota media del grupo en cada trimestre, y la media
del alumno que se encuentra en la posición N (N se lee por teclado).
*/
public class bol04e16 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[][] grupo=new int[5][3];
        double mediaP=0, mediaS=0, mediaT=0, mediaA=0;
        int alum;

        for (int i = 0; i < grupo.length; i++) {
            System.out.println("Alumno número " + (i+1));
            for (int j = 0; j < grupo[i].length; j++) {
                System.out.println("Introduzca la nota del trimestre " + (j+1));
                grupo[i][j]=s.nextInt();
                if (j == 0) {
                    mediaP += grupo[i][j];
                } else if (j == 1) {
                    mediaS += grupo[i][j];
                } else {
                    mediaT += grupo[i][j];
                }
            }
        }
        System.out.println("Elige el alumno que desea saber la nota media");
        alum=s.nextInt();
        for (int i = 0; i < grupo[alum].length ; i++) {
            mediaA+=grupo[alum][i];
        }

        System.out.println("La nota media del primer trimestre es de " + (mediaP/5) + "\n La nota media del segundo trimestre es de " + (mediaS/5) + "\n La nota media del tercer trimestre es de " + (mediaT/5));
        System.out.println("La nota media del alumno " + alum +" es de " + (mediaA/3) );



    }
}
