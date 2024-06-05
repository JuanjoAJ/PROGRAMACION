import controller.Biblioteca;
import databaseLibrary.*;

import modelLibrary.*;
import util.BibliotecaExcepcion;
import util.IsbnExcepcion;
import util.NoCatalogoExcepcion;
import util.TablaJFrame;

import java.util.*;

public class EntradaLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DatasetLibros baseDatos = new DatasetLibros();
        DatasetBibliotecas bibliotecas=new DatasetBibliotecas();
        ArrayList<Integer> codigosBiblioteca=new ArrayList<>();

        boolean salir = false;
        int opcion=5, opcionLibro;

        System.out.println("📚Bienvenido al sistema gestor de bibliotecas📚");
        do {
            System.out.println("""
                    Puede escoger:
                    1) Trabajar con la base de datos
                    2) Crear biblioteca
                    3) Trabajar con la biblioteca
                    4) Salir""");
            try {
                opcion = scanner.nextInt();
            }catch (Exception e){
                scanner.nextLine();
                System.err.println("Opción no válida");

            }


            switch (opcion) {
                case 1:
                    try {
                        System.out.println("""
                                Bienvenido a la base de datos de la red de bibliotecas, puede realizar lo siguiente:
                                1. Agregar un libro a la base de datos
                                2. Consultar todos nuestros libros de la base de datos
                                3. Consultar los libros que no están incluidos en ningún catálogo
                                4. Ver datos de un libro
                                """);
                        int opcionBaseDatos= scanner.nextInt();
                        String isbn;
                        switch (opcionBaseDatos) {
                            case 1:

                                String titulo;
                                Persona persona;
                                int nPaginas, subtipoLibro;
                                System.out.println("Indica el título");
                                scanner=new Scanner(System.in);
                                titulo = scanner.nextLine();
                                System.out.println("Indica el ISBN");
                                isbn = scanner.next();
                                if (isbn.length() != 13) throw new IsbnExcepcion("El ISBN debe tener 13 dígitos");
                                for (int i = 0; i < isbn.length(); i++) {
                                    if (Character.isLetter(isbn.charAt(i)))
                                        throw new IsbnExcepcion("El ISBN no puede contener letras");
                                }
                                if (baseDatos.buscarLibro(isbn, baseDatos.getDatasetLibros()) != null)
                                    throw new IsbnExcepcion("El libro ya está en nuestra base de datos");
                                System.out.println("Indica el número de páginas");
                                nPaginas = scanner.nextInt();
                                System.out.println("Indica el nombre y el apellido del autor");
                                persona = new Persona(scanner.next(), scanner.next());

                                System.out.println("""
                                        Elija el libro a crear:
                                        1. Comedia
                                        2. Terror
                                        3. Policiaca""");
                                opcionLibro = scanner.nextInt();


                                if (opcionLibro > 3 || opcionLibro < 1)
                                    throw new BibliotecaExcepcion("Opción no contemplada");
                                if (opcionLibro == 1) {
                                    System.out.println("""
                                            Indica el tipo de calificación:
                                             1. Humor Blanco
                                             2. Humor Negro
                                             3. Humor Hacker
                                             4. Humor Gráfico
                                             5. Humor Absurdo
                                             6. Humor Verde""");
                                    subtipoLibro = scanner.nextInt();
                                    baseDatos.agregarLibroBBDD(new LibroComedia(titulo, nPaginas, persona, isbn, subtipoLibro));
                                    break;
                                } else if (opcionLibro == 2) {
                                    System.out.println("""
                                            Selecciona tipo de calificación:
                                            1. Adultos
                                            2. Adolescente
                                            3. Infantil""");
                                    subtipoLibro = scanner.nextInt();
                                    baseDatos.agregarLibroBBDD(new LibroTerror(titulo, nPaginas, persona, isbn, subtipoLibro));
                                    break;
                                } else {
                                    System.out.println("""
                                            Selecciona tipo de trama:
                                            1. Intriga
                                            2. Misterio
                                            """);
                                    subtipoLibro = scanner.nextInt();
                                    System.out.println("Cuantos personajes tiene la novela");
                                    int nPersonajes = scanner.nextInt();
                                    ArrayList<Persona> personaje = new ArrayList<>(nPersonajes);
                                    for (int i = 0; i < nPersonajes; i++) {
                                        System.out.println("Introduce nombre y apellidos de los personajes");
                                        personaje.add(new Persona(scanner.next(), scanner.next()));
                                    }
                                    baseDatos.agregarLibroBBDD(new LibroPoliciaca(titulo, nPaginas, persona, isbn, personaje, subtipoLibro));

                                    break;

                                }
                            case 2:
                                baseDatos.librosDataset();
                                break;
                            case 3:
                                baseDatos.librosNocatalogo();
                                break;
                            case 4:
                                System.out.println("Introduce ISBN del libro que quieras ver");
                                isbn= scanner.next();
                                if (baseDatos.buscarLibro(isbn, baseDatos.getDatasetLibros())==null) throw new RuntimeException("No tenemos registros de ese libro");
                                baseDatos.buscarLibro(isbn, baseDatos.getDatasetLibros()).mostrarDatos();
                                break;
                            default:
                                System.out.println("📓 Saliendo del modo Base de Datos 📓");
                                System.out.println();
                                break;
                        }
                    }catch (InputMismatchException e) {
                        System.err.println("Error fatal en la introducción de los datos");
                        scanner.nextLine();
                    } catch (RuntimeException | IsbnExcepcion | BibliotecaExcepcion e) {
                        System.err.println(e.getMessage());
                    } finally {
                        scanner=new Scanner(System.in);
                        break;
                    }
                case 2:
                    String nombreBiblio, nombreDir, apelliDir;
                    int keyBiblio;
                    try {
                        System.out.println("Bienvenido al creador de bibliotecas.\n Por favor, indique el nombre de la biblioteca");
                        nombreBiblio = scanner.next();
                        System.out.println("Indiquenos el número de identificación de la biblioteca");
                        keyBiblio = scanner.nextInt();
                        for (Integer item : codigosBiblioteca) {
                            if (item == keyBiblio)
                                throw new BibliotecaExcepcion("Ya tenemos registrado una biblioteca con esa clave");
                        }
                        System.out.println("Indique tambien nombre y apellidos del director");
                        nombreDir = scanner.next();
                        apelliDir = scanner.next();

                        System.out.println("""
                                Escoja una de las siguientes opciones:
                                1. Biblioteca genérica.
                                2. Biblioteca de terror.
                                3. Biblioteca de comedia.
                                4. Biblioteca de misterio/policiaca.""");
                        opcionLibro = scanner.nextInt();

                        switch (opcionLibro) {
                            case 1:
                                codigosBiblioteca.add( keyBiblio);
                                bibliotecas.getBibliotecasGeneralistas().add(new Biblioteca<>(keyBiblio,nombreBiblio, new Persona(nombreDir, apelliDir)));
                                System.out.println("📗 Biblioteca añadida correctamente 📗");
                                break;
                            case 2:
                                bibliotecas.getBibliotecasTerror().add(new Biblioteca<>(keyBiblio,nombreBiblio, new Persona(nombreDir, apelliDir)));
                                codigosBiblioteca.add(keyBiblio);
                                System.out.println("📙 Biblioteca de terror añadida correctamente 📙");
                                break;
                            case 3:
                                bibliotecas.getBibliotecasComedias().add(new Biblioteca<>(keyBiblio, nombreBiblio, new Persona(nombreDir, apelliDir)));
                                codigosBiblioteca.add(keyBiblio);
                                System.out.println("📒 Biblioteca de comedia añadida correctamente 📒");
                                break;
                            case 4:
                                bibliotecas.getBibliotecasPoliciacas().add(new Biblioteca<>(keyBiblio, nombreBiblio, new Persona(nombreDir, apelliDir)));
                                codigosBiblioteca.add(keyBiblio);
                                System.out.println("📘 Biblioteca policiaca añadida correctamente 📘");
                                break;
                            default:
                                throw new BibliotecaExcepcion("Opción no valida");

                        }
                    } catch (InputMismatchException e) {
                        System.err.println("Error fatal en la introducción de los datos");
                        scanner.nextLine();
                    } catch (BibliotecaExcepcion e) {
                        System.err.println(e.getMessage());
                    } finally {
                        scanner=new Scanner(System.in);
                        break;

                    }

                case 3:
                    bibliotecas.listarBibliotecas();
                    int codigoBiblioteca;
                    String isbn;
                    TablaJFrame tabla;
                    System.out.println("Elije con que biblioteca quieres trabajar, indicando su número");
                    try {
                        codigoBiblioteca = scanner.nextInt();
                        if (!codigosBiblioteca.contains(codigoBiblioteca)) throw new BibliotecaExcepcion("El código introducido es incorrecto");
                        int tipoBiblio= bibliotecas.tipoBiblioteca(codigoBiblioteca);
                        if(tipoBiblio==1) {
                            System.out.printf("""
                                Bienvenido a la Biblioteca General de %s . Por favor, escoja una de las siguientes acciones:
                                1. Construir un catálogo.
                                2. Agregar libros al catálogo.
                                3. Sacar libro del catálogo.
                                4. Listar libros del catálogo.
                                5. Datos de un libro en el catálogo.
                                6. Exportar catalogo de la Biblioteca.
                                 """, bibliotecas.bibliotecaGeneral(codigoBiblioteca).getNombre());
                            opcionLibro = scanner.nextInt();
                            switch (opcionLibro) {
                                case 1:
                                    System.out.println("Indica la capacidad de tu catálogo");
                                    bibliotecas.bibliotecaGeneral(codigoBiblioteca).construirCatalogo(scanner.nextInt());
                                    break;
                                case 2:
                                    tabla=new TablaJFrame(baseDatos.getDatasetLibros());
                                    System.out.println("Por favor, indique el ISBN del libro que desea agregar");
                                    isbn= scanner.next();
                                    bibliotecas.bibliotecaGeneral(codigoBiblioteca).agregarLibrosCatalogo(baseDatos.buscarLibro(isbn,baseDatos.getDatasetLibros()));
                                    break;
                                case 3:
                                    System.out.println("Actualmente en el catálogo tenemos estos libros");
                                    bibliotecas.bibliotecaGeneral(codigoBiblioteca).listarCatalogo();
                                    System.out.println("Que libro desea sacar");
                                    bibliotecas.bibliotecaGeneral(codigoBiblioteca).sacarLibroBiblioteca(scanner.next());
                                    break;
                                case 4:
                                    bibliotecas.bibliotecaGeneral(codigoBiblioteca).listarCatalogo();
                                    break;
                                case 5:
                                    System.out.println("Indica el isbn del libro que quieras consultar");
                                    isbn= scanner.next();
                                    bibliotecas.bibliotecaGeneral(codigoBiblioteca).datosLibro(isbn);
                                    break;
                                case 6:
                                    System.out.println("Exportando Catalogo");
                                    bibliotecas.bibliotecaGeneral(codigoBiblioteca).exportarFichero("resources/catalogoBibliotecaGeneral");
                                    break;

                                default:
                                    System.out.println("Saliendo del modo biblioteca 📕");
                                    System.out.println();
                                    break;
                            }
                        } else if (tipoBiblio==2) {
                            System.out.printf("""
                                Bienvenido a la Biblioteca especializada en el Terror de %s . Por favor, escoja una de las siguientes acciones:
                                1. Construir un catálogo.
                                2. Agregar libros al catálogo.
                                3. Sacar libro del catálogo.
                                4. Listar libros del catálogo.
                                5. Datos de un libro en el catálogo.
                                6. Exportar catalogo de la Biblioteca.
                                 """, bibliotecas.bibliotecaTerror(codigoBiblioteca).getNombre());
                            opcionLibro = scanner.nextInt();
                            switch (opcionLibro) {
                                case 1:
                                    System.out.println("Indica la capacidad de tu catálogo");
                                    bibliotecas.bibliotecaTerror(codigoBiblioteca).construirCatalogo(scanner.nextInt());
                                    break;
                                case 2:
                                    tabla=new TablaJFrame(baseDatos.getDatasetTerror());
                                    System.out.println("Por favor, indique el ISBN del libro que desea agregar");
                                    isbn= scanner.next();
                                    bibliotecas.bibliotecaTerror(codigoBiblioteca).agregarLibrosCatalogo(baseDatos.buscarLibro(isbn,baseDatos.getDatasetTerror()));
                                    break;
                                case 3:
                                    System.out.println("Actualmente en el catálogo tenemos estos libros");
                                    bibliotecas.bibliotecaTerror(codigoBiblioteca).listarCatalogo();
                                    System.out.println("Que libro desea sacar");
                                    bibliotecas.bibliotecaTerror(codigoBiblioteca).sacarLibroBiblioteca(scanner.next());
                                    break;
                                case 4:
                                    bibliotecas.bibliotecaTerror(codigoBiblioteca).listarCatalogo();
                                    break;
                                case 5:
                                    System.out.println("Indica el isbn del libro que quieras consultar");
                                    isbn= scanner.next();
                                    bibliotecas.bibliotecaTerror(codigoBiblioteca).datosLibro(isbn);
                                    break;
                                case 6:
                                    System.out.println("Exportando Catalogo");
                                    bibliotecas.bibliotecaTerror(codigoBiblioteca).exportarFichero("resources/catalogoBibliotecaTerror");
                                    break;

                                default:
                                    System.out.println("Saliendo del modo biblioteca 📕");
                                    System.out.println();
                                    break;
                            }
                        } else if (tipoBiblio==3) {
                            System.out.printf("""
                                Bienvenido a la Biblioteca de Comedia de %s . Por favor, escoja una de las siguientes acciones:
                                1. Construir un catálogo.
                                2. Agregar libros al catálogo.
                                3. Sacar libro del catálogo.
                                4. Listar libros del catálogo.
                                5. Datos de un libro en el catálogo.
                                6. Exportar catalogo de la Biblioteca.
                                 """, bibliotecas.bibliotecaComedia(codigoBiblioteca).getNombre());
                            opcionLibro = scanner.nextInt();
                            switch (opcionLibro) {
                                case 1:
                                    System.out.println("Indica la capacidad de tu catálogo");
                                    bibliotecas.bibliotecaComedia(codigoBiblioteca).construirCatalogo(scanner.nextInt());
                                    break;
                                case 2:
                                    tabla=new TablaJFrame(baseDatos.getDatasetComedia());
                                    System.out.println("Por favor, indique el ISBN del libro que desea agregar");
                                    isbn= scanner.next();
                                    bibliotecas.bibliotecaComedia(codigoBiblioteca).agregarLibrosCatalogo(baseDatos.buscarLibro(isbn,baseDatos.getDatasetComedia()));

                                    break;
                                case 3:
                                    System.out.println("Actualmente en el catálogo tenemos estos libros");
                                    bibliotecas.bibliotecaComedia(codigoBiblioteca).listarCatalogo();
                                    System.out.println("Que libro desea sacar");
                                    bibliotecas.bibliotecaComedia(codigoBiblioteca).sacarLibroBiblioteca(scanner.next());
                                    break;
                                case 4:
                                    bibliotecas.bibliotecaComedia(codigoBiblioteca).listarCatalogo();
                                    break;
                                case 5:
                                    System.out.println("Indica el isbn del libro que quieras consultar");
                                    isbn= scanner.next();
                                    bibliotecas.bibliotecaComedia(codigoBiblioteca).datosLibro(isbn);
                                    break;
                                case 6:
                                    System.out.println("Exportando Catalogo");
                                    bibliotecas.bibliotecaComedia(codigoBiblioteca).exportarFichero("resources/catalogoBibliotecaComedia");
                                    break;

                                default:
                                    System.out.println("Saliendo del modo biblioteca 📕");
                                    System.out.println();
                                    break;
                            }
                        } else if (tipoBiblio==4){
                            System.out.printf("""
                                Bienvenido a la Biblioteca del misterio e intriga de %s . Por favor, escoja una de las siguientes acciones:
                                1. Construir un catálogo.
                                2. Agregar libros al catálogo.
                                3. Sacar libro del catálogo.
                                4. Listar libros del catálogo.
                                5. Datos de un libro en el catálogo.
                                6. Exportar catalogo de la Biblioteca.
                                 """, bibliotecas.bibliotecaPoliciaca(codigoBiblioteca).getNombre());
                            opcionLibro = scanner.nextInt();
                            switch (opcionLibro) {
                                case 1:
                                    System.out.println("Indica la capacidad de tu catálogo");
                                    bibliotecas.bibliotecaPoliciaca(codigoBiblioteca).construirCatalogo(scanner.nextInt());
                                    break;
                                case 2:
                                    tabla=new TablaJFrame(baseDatos.getDatasetPoliciaca());
                                    System.out.println("Por favor, indique el ISBN del libro que desea agregar");
                                    isbn= scanner.next();
                                    bibliotecas.bibliotecaPoliciaca(codigoBiblioteca).agregarLibrosCatalogo(baseDatos.buscarLibro(isbn,baseDatos.getDatasetPoliciaca()));

                                    break;
                                case 3:
                                    System.out.println("Actualmente en el catálogo tenemos estos libros");
                                    bibliotecas.bibliotecaPoliciaca(codigoBiblioteca).listarCatalogo();
                                    System.out.println("Que libro desea sacar");
                                    bibliotecas.bibliotecaPoliciaca(codigoBiblioteca).sacarLibroBiblioteca(scanner.next());
                                    break;
                                case 4:
                                    bibliotecas.bibliotecaPoliciaca(codigoBiblioteca).listarCatalogo();
                                    break;
                                case 5:
                                    System.out.println("Indica el isbn del libro que quieras consultar");
                                    isbn= scanner.next();
                                    bibliotecas.bibliotecaPoliciaca(codigoBiblioteca).datosLibro(isbn);
                                    break;
                                case 6:
                                    System.out.println("Exportando Catalogo");
                                    bibliotecas.bibliotecaPoliciaca(codigoBiblioteca).exportarFichero("resources/catalogoBibliotecaPoliciaca");
                                    break;

                                default:
                                    System.out.println("Saliendo del modo biblioteca 📕");
                                    System.out.println();
                                    break;
                            }
                        }else throw new BibliotecaExcepcion("El tipo de Biblioteca es incorrecto");
                    }catch (NoCatalogoExcepcion | BibliotecaExcepcion e) {
                        System.err.println(e.getMessage());
                    }catch (NullPointerException e){
                        System.err.println("El libro que intentabas añadir no se encuentra en ese catalogo");
                    }catch (Exception e) {
                        System.err.println("Error fatal en la introducción de los datos");
                        scanner.nextLine();
                    } finally {
                        scanner=new Scanner(System.in);
                        break;
                    }
                case 4:
                    System.out.println("📖 Hasta pronto 📖");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        } while (!salir);
        baseDatos.exportarCatalogos();
        scanner=new Scanner(System.in);
        scanner.close();
        System.exit(0);
    }


}
