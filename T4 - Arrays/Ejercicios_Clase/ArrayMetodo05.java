import java.util.Scanner;

/*(OperacionesArray) Crear un array con 10 posiciones y asígnale números enteros entre 0 y 9, ambos inclusive (de forma automática).
 * Se mostrarán los datos separados por una coma y un espacio.
 * Una vez hecho esto se modificará el array del de la manera indicada en cada apartado, y se mostrará de nuevo.
- Incrementar en 1 los valores pares y en -1 los impares.
- Duplicar los valores positivos menores que 5
- Sumar a cada valor un valor entero aleatorio entre -5 y 5.
- Mover los datos una posición hacia la derecha (el primero pasa al segundo, el
segundo al tercero, ..., y el último al primero).
- Intercambiar el primero con el segundo, el tercero con el cuarto, ..., el penúltimo con el último.
- Invertir el array
- Mostrar la posición del primer par y del último impar.

*hay que hacer to-do de golpe, pero opcionalmente se puede hacer un menú que indique cada una de las opciones**
*/
public class ArrayMetodo05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        imprimir(tabla());
        System.out.println("\n \t Elija una de las opciones: \n"
                + "1- Incrementar en 1 los valores pares y en -1 los impares.\r\n"
                + "2- Duplicar los valores positivos menores que 5\r\n"
                + "3- Sumar a cada valor un valor entero aleatorio entre -5 y 5.\r\n"
                + "4- Mover los datos una posición hacia la derecha (el primero pasa al segundo, el segundo al tercero, ..., y el último al primero).\r\n"
                + "5- Intercambiar el primero con el segundo, el tercero con el cuarto, ..., el penúltimo con el último.\r\n"
                + "6- Invertir el array\r\n" + "7- Mostrar la posición del primer par y del último impar.");
        int opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                incrementar(tabla());
                break;
            case 2:
                duplicar(tabla());
                break;
            case 3:
                sumaAleatoria(tabla());
                break;
            case 4:
                derecha(tabla());
                break;
            case 5:
                intercambio(tabla());
                break;
            case 6:
                invertir(tabla());
                break;
            case 7:
                primerPar(tabla());
                break;
            default:
                System.out.println("Opción no contemplada");
                break;
        }
    }
public static int[] tabla(){
int[] array=new int[10];
    for (int i = 0; i < array.length; i++) {
        array[i] = i;
    }
return array;
}
public static void imprimir(int[] array){
    for (int i=0; i< array.length; i++){
        if (array[i]==array[array.length-1]) System.out.println(array[i] + ".");
        else System.out.print(array[i] + " , ");
    }
}
public static void incrementar(int[]array){
    for (int i = 0; i < array.length; i++) {
        if (array[i] % 2 == 0) {
            array[i] += 1;
        } else {
            array[i] -= 1;
        }

    }
    imprimir(array);
}
public static void duplicar(int[]array){
    for (int i = 0; i < array.length; i++) {
        if (array[i]<5) array[i]*=2;
    }
    imprimir(array);
}
public static void sumaAleatoria(int[]array){
    for (int i = 0; i < array.length; i++) {
       array[i]+=(int) (Math.random()*11)-5;
    }
    imprimir(array);
}
public static void derecha(int[]array){
        ArrayMetodo04 right=new ArrayMetodo04();
        right.derecha(array);
}
public static void intercambio(int[] array){
    int aux;
    for (int i = 0; i < array.length; i++) {
        if (i % 2 == 0) {
            aux=array[i];
            array[i] =array[i+1];
            array[i+1]=aux;
        }
    }
    imprimir(array);
    }
public static void invertir (int[] array){
    for (int i = array.length-1; i >=0; i--) {
        if (array[i]==0) System.out.println(array[i] + ".");
        else System.out.print(array[i] + " , ");
    }

}
public static void primerPar(int[] array){
    int pri = 0, ult=0, posP=0, posI=0;
    for (int i = array.length - 1; i >= 0; i--) {
        if (array[i] % 2 == 0) {
            pri = array[i];
            posP=i;
        }
    }
    for (int j = 0; j < array.length; j++) {
        if (array[j] % 2 != 0) {
            ult = array[j];
            posI=j;
        }
    }
    System.out.printf("El primer par de la cadena es %d que se encuentra en la posición %d , mientras que el segundo es %d, encontrado en la posición %d", pri,posP, ult, posI);

}
}

