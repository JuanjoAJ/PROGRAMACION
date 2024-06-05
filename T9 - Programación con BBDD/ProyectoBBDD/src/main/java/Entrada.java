import model.AlumnoDB;
import model.ProfesorDB;
import repositories.AlumnoRepository;
import repositories.ProfesorRepository;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

        AlumnoRepository alumnoRepository=new AlumnoRepository();
        ProfesorRepository profesorRepository=new ProfesorRepository();
        Scanner scanner=new Scanner(System.in);
        String nombre, apellido, correo;
        int telefono, opcion,opcionObtener, id;
        double sueldo;
        try{
            System.out.println("""
                Bienvenido al menú del colegio, ¿qué quieres hacer?
                1. Trabajar con alumnos.
                2. Trabajar con profesores.""");
            switch (opcion= scanner.nextInt()){
                case 1:
                    //alumnos submenú
                    System.out.println("""
                            Ha elegido el submenú alumnos, elija una de las siguientes opciones:
                            1. Insertar datos de alumno.
                            2. Actualizar datos de alumno.
                            3. Visualizar datos de alumno.
                            4. Eliminar un alumno.""");
                        opcion= scanner.nextInt();
                    if (opcion==1){
                        System.out.println("Introduzca el nombre del alumno");
                        scanner=new Scanner(System.in);
                        nombre= scanner.nextLine();
                        System.out.println("Introduzca el apellido del alumno");
                        apellido= scanner.nextLine();
                        System.out.println("Introduzca el correo del alumno");
                        correo= scanner.next();
                        System.out.println("Introduzca el telefono del alumno");
                        telefono= scanner.nextInt();
                        alumnoRepository.insertarAlumno(new AlumnoDB(nombre, apellido, correo, telefono));
                    }
                    else if (opcion==2) {
                        System.out.println("Introduce el identificador del alumno y todos los datos del alumno(ya actualizados)");
                        id= scanner.nextInt();
                        System.out.println("Introduzca el nombre del alumno");
                        scanner=new Scanner(System.in);
                        nombre= scanner.nextLine();
                        System.out.println("Introduzca el apellido del alumno");
                        apellido= scanner.nextLine();
                        System.out.println("Introduzca el correo del alumno");
                        correo= scanner.next();
                        System.out.println("Introduzca el telefono del alumno");
                        telefono= scanner.nextInt();
                        alumnoRepository.actualizarAlumno(new AlumnoDB(id, nombre, apellido, correo, telefono));
                    } else if (opcion==3) {
                        System.out.println("""
                                Obtener los datos de :
                                1. Todos los alumnos
                                2. Un alumno""");
                        opcionObtener= scanner.nextInt();
                        switch (opcionObtener){
                            case 1:
                                alumnoRepository.obtenerAlumno();
                                break;
                            case 2:
                                System.out.println("Introduce el nombre del alumno a buscar");
                                nombre= scanner.next();
                                System.out.println("Introduce su correo");
                                correo= scanner.next();
                                if(alumnoRepository.estaAlumno(nombre, correo)!=null){
                                    System.out.println(alumnoRepository.estaAlumno(nombre, correo));
                                }else {
                                    System.out.println("El alumno no está en nuestra base de datos");
                                }
                                break;
                            default:
                                System.out.println("Opción no contemplada");
                                break;
                        }
                    } else if (opcion==4) {
                        System.out.println("Introduce el id del alumno a eliminar");
                        id= scanner.nextInt();
                       alumnoRepository.eliminarAlumno(id);

                    }else {
                        System.out.println("Opción no válida");
                    }

                    break;
                case 2:
                    System.out.println("""
                            Ha elegido el submenú profesor, elija una de las siguientes opciones:
                            1. Insertar datos de profesor.
                            2. Actualizar datos de profesor.
                            3. Visualizar datos de profesor.
                            4. Eliminar un profesor.""");
                    opcion= scanner.nextInt();
                    switch (opcion){
                        case 1:
                            System.out.println("Introduzca el nombre del profesor");
                            scanner=new Scanner(System.in);
                            nombre= scanner.nextLine();
                            System.out.println("Introduzca el correo del profesor");
                            correo= scanner.next();
                            System.out.println("Introduzca el sueldo del profesor");
                            sueldo= scanner.nextDouble();
                            profesorRepository.insertarProfesor(new ProfesorDB(nombre, correo, sueldo));
                            break;
                        case 2:
                            System.out.println("Introduce el identificador del profesor y todos los datos del profesor(ya actualizados)");
                            id= scanner.nextInt();
                            System.out.println("Introduzca el nombre del profesor");
                            scanner=new Scanner(System.in);
                            nombre= scanner.nextLine();
                            System.out.println("Introduzca el correo del profesor");
                            correo= scanner.next();
                            System.out.println("Introduzca el sueldo del profesor");
                            sueldo= scanner.nextDouble();
                            profesorRepository.actualizarProfesor(id, new ProfesorDB(nombre, correo, sueldo));
                            break;
                        case 3:
                            System.out.println("""
                                Obtener los datos de :
                                1. Todos los profesores
                                2. Un profesor""");
                            opcionObtener= scanner.nextInt();
                            switch (opcionObtener){
                                case 1:
                                    profesorRepository.obtenerProfesor();
                                    break;
                                case 2:
                                    System.out.println("Introduce nombre de profesor a buscar");
                                    nombre= scanner.next();
                                    System.out.println("Introduce correo del profesor");
                                    correo= scanner.next();
                                   if(profesorRepository.estaProfesor(nombre, correo)!=null){
                                       System.out.println(profesorRepository.estaProfesor(nombre, correo));
                                   }else {
                                       System.out.println("No tenemos ese profesor en el registro");
                                   }
                                    break;
                                default:
                                    System.out.println("Opción no contemplada");
                                    break;
                            }
                            break;
                        case 4:
                            System.out.println("Introduce el id del profesor a eliminar");
                            id= scanner.nextInt();
                            profesorRepository.borrarProfesor(id);
                            break;

                    }
                break;
                default:
                    System.out.println("Opción no contemplada");
                    break;
            }

        }catch (InputMismatchException | IllegalArgumentException e){
            System.out.println("Error en la introducción de datos");
            System.out.println(e.getMessage());
        }


    }
}
