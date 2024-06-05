package ejercicio2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


public class mainFichero implements Comparable {
    public static void main(String[] args) {
        ArrayList<mainFichero> alumnos=new ArrayList<>();
        BufferedReader bufferedReader=null;
        try {
            File file=new File("src/ejercicio2/alumnos.txt");
            bufferedReader=new BufferedReader(new FileReader(file));
            String lectura=null;
            while ((lectura= bufferedReader.readLine())!=null){
                alumnos.add(new mainFichero(lectura.split(", ")[0],
                        lectura.split(", ")[1],
                        lectura.split(", ")[2],
                        Integer.parseInt(lectura.split(", ")[3])));
            }

        Collections.sort(alumnos);
            for (mainFichero item:alumnos){
                System.out.println(item);
            }

            System.out.printf("Siendo el alumno con mayor calificación "+ alumnos.getFirst()+"con una calificacion de %s", alumnos.getFirst().calificacion);
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        } catch (IOException e) {
            System.out.println("Error en manejo de ficheros");
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("Error en cierre");
            }
        }





    }
    private String nombre, apellido, correo;
    private int calificacion;

    public mainFichero(String nombre, String apellido, String correo, int calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.calificacion = calificacion;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof mainFichero){
            if (((mainFichero) o).getCalificacion()>calificacion) return 1;
            else if (((mainFichero) o).getCalificacion()<calificacion) return -1;
            else return 0;

        }
        return 0;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                ", calificacion=" + calificacion +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}
