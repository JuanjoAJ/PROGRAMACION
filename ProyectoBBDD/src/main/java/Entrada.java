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
        int telefono, opcion, id;
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
                        //Read
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
                            //Actualizar
                            break;
                        case 3:
                            //Leer
                            break;




                    }
                break;
                default:
                    System.out.println("Opción no contemplada");
                    break;
            }

        }catch (InputMismatchException | IllegalArgumentException e){
            System.out.println("Error en la introducción de datos");
        }


    }
}
