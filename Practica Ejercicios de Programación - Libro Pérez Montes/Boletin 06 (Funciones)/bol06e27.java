import java.util.Scanner;

/*Diseñar la función opera_tabla, a la que se le pasa dos tablas, el número de elementos útiles y
qué operación se desea realizar: sumar, restar, multiplicar o dividir (mediante un carácter: 's',
'r', 'm', 'd'). La función debe devolver una tabla con los resultados.*/
public class bol06e27 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] t={1,2,3,4,5,6,7,8,9}, tD={10,9,8,7,6,5,4,3,2,1};
        System.out.println("Elige una de las siguientes opciones:\n s) suma \n r) resta \n m) multiplicación \n d) división");
        char opcion=scanner.next().toLowerCase().charAt(0);
        System.out.println("Elige el número de elementos útiles");
        int elem= scanner.nextInt();


        System.out.println("El resultado es: ");
        for (int imp:resultado(t, tD, elem, opcion)){
            System.out.print(imp +" ");
        }


    }
    public static int[] resultado(int[]a, int[]b,int elem, char opcion){
        int[] r=new int[elem];
        elem-=1;
        switch (opcion){
            case 's':
                for (int i=0; i<=elem; i++){
                    r[i]=a[i]+b[i];

                }
                break;
            case 'r':
                for (int i=0; i<=elem; i++){
                    r[i]=a[i]-b[i];

                }
                break;
            case 'm':
                for (int i=0; i<=elem; i++){
                    r[i]=a[i]*b[i];

                }
                break;
            case 'd':
                for (int i=0; i<=elem; i++){
                    r[i]=a[i]/b[i];

                }
                break;


        }
        return r;



    }

}
