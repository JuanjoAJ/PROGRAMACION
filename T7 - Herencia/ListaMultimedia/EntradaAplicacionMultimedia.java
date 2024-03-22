import controllerMulti.Coleccion;
import java.util.Scanner;

public class EntradaAplicacionMultimedia {
    public static void main(String[] args) {
        Coleccion coleccion = new Coleccion();
        Scanner sc = new Scanner(System.in);

    do{
        System.out.println("""
                Bienvenido al gestor Multimedia. Elija una de estas opciones:
                 1) Añadir a la colección
                 2) Eliminar de la colección
                 3) Listar elementos
                 4) Buscar por autor de libro
                 5) Buscar por actor
                 6) Buscar por director""");
        switch (sc.nextInt()) {
            case 1:
                System.out.println("¿Qué tipo de elemento multimedia quiere agregar: ?\n 1) Libro \n 2) Video \n 3) Audio");
                coleccion.agregarColeccion();
                break;
            case 2:
                System.out.println("Introduzca el ID del elemento que desee eliminar");
                coleccion.borrarElemento(sc.nextInt());
                break;
            case 3:
                System.out.println("Elija una de las opciones: \n 1) Listar video \n 2) Listar audio \n 3) Listar todos los elementos");
                coleccion.menuListado(sc.nextByte());
                break;
            case 4:
                System.out.println("Indique el nombre del autor");
                coleccion.listarAutor(sc.next());
                break;
            case 5:
                System.out.println("Indique el nombre del actor");
                coleccion.listarActor(sc.next());
                break;
            case 6:
                System.out.println("Indique el nombre del director");
                coleccion.listarDirector(sc.next());
                break;
            default:
                System.out.println("Opción no contemplada");
                break;
        }
        System.out.println("¿Desea continuar?");
    }while(sc.next().equalsIgnoreCase("si"));
    }
}
