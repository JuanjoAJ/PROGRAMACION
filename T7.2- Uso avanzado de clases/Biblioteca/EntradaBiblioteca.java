import controllerBiblioteca.Biblioteca;
import modelBiblioTema7.*;

import java.util.Scanner;

public class EntradaBiblioteca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        int opcion;
        do {
            System.out.println("""
                    Bienvenido a la biblioteca municipal, elija una de las siguientes opciones:
                                    
                    1. Dar de alta un socio.
                    2. Dar de alta un elemento.
                    3. Prestar un elemento.
                    4. Devolver un elemento.
                    5. Ver elementos prestados a un socio en concreto.
                    6. Mostrar elementos disponibles.
                    7. Mostrar elementos prestados.
                    """);
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce el nombre, apellido y dni del Socio");
                    biblioteca.registrarUsuario(new Socio(scanner.next(), scanner.next(), scanner.next()));
                    break;
                case 2:
                    biblioteca.darAltaElemento();
                    break;
                case 3:
                    System.out.println("Introduce DNI de socio e Id del elemento");
                    biblioteca.realizarPrestamo(biblioteca.existeSocio(scanner.next()), biblioteca.existeElemento(scanner.nextInt()));
                    break;
                case 4:
                    System.out.println("Introduce DNI de socio e Id del elemento");
                    biblioteca.realizarDevolucion(biblioteca.existeSocio(scanner.next()), biblioteca.existeElemento(scanner.nextInt()));
                    break;
                case 5:
                    System.out.println("Introduzca DNI del socio");
                    biblioteca.mostrarElementosSocio(scanner.next());
                    break;
                case 6:
                    biblioteca.mostrarElementosDisponibles();
                    break;
                case 7:
                    biblioteca.mostrarElementosPrestados();
                    break;
                default:
                    System.out.println("Gracias por su estancia en la Biblioteca");
                    break;
            }
        } while (opcion < 8);
    }
}
