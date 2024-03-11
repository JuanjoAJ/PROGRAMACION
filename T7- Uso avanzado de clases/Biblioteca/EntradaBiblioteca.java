import controllerBiblioteca.Biblioteca;
import modelBiblioTema7.Socio;
import modelBiblioTema7.Trabajador;

import java.util.ArrayList;
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
                    System.out.println("""
                            ¿Qué elemento desea dar de alta?
                            1. CD 
                            2. DVD
                            3. Revista
                            4. Libro""");
                    switch (scanner.nextInt()){
                        case 1:

                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                        case 4:

                            break;
                        default:
                            System.out.println("No disponemos de esa opción");
                            break;
                    }
                    break;
                case 3:

                    break;
                case 4:

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
