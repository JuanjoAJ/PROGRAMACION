package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Garaje {
    private ArrayList<Coche> coches = new ArrayList<>();
    Scanner scanner=new Scanner(System.in);

    public void Garaje(){}


    public void ingresarCoche() {

        System.out.println("Introduzca la marca");
        String marca = scanner.next();
        System.out.println("Introduzca el modelo");
        String modelo = scanner.next();
        System.out.println("Introduzca el coste");
        int coste = scanner.nextInt();
        System.out.println("Introduzca matricula");
        String matricula = scanner.next();
        if (encontrarMatricula(matricula)) System.out.println("Ya existe un coche con esa matrícula");
        else {
            coches.add(new Coche(marca, modelo, matricula, coste));
            System.out.println("Coche añadido exitosamente a la lista");
        }
    }
    public void listarCoches(){
        if (coches.isEmpty()){
            System.out.println("Actualmente no hay coches en el garaje");
        }
        else {
            for (Coche imp:coches) {
                System.out.println("Marca: " + imp.getMarca());
                System.out.println("Modelo: " + imp.getModelo());
                System.out.println("Coste de reparación: " + imp.getCosteReparacion());
                System.out.println("Matrícula: " + imp.getMatricula());
                System.out.println();
            }
        }
    }
    public void mostrarCostes() {
        int costeTotal=0;
        for (Coche suma:coches) {
           costeTotal+=suma.getCosteReparacion();
        }
        System.out.println("El coste total de todas las reparaciones de los coches es de " + costeTotal + "€");
    }

    public void buscarCoche() {
        System.out.println("Introduce la matricula");
        String matricula= scanner.next();
        for (Coche coch : coches) {
            if (coch.getMatricula().equals(matricula)) {
                System.out.println("Marca: " + coch.getMarca());
                System.out.println("Modelo: " + coch.getModelo());
                System.out.println("Coste de reparación: " + coch.getCosteReparacion());
                System.out.println("Matrícula: " + coch.getMatricula());
                System.out.println();
                return;
            }
        }
        System.out.println("El coche no está en nuestro garaje.");

    }
    public void eliminaCoche() {
        System.out.println("Introduce la matricula del coche a eliminar");
        String matricula= scanner.next();
        if (encontrarMatricula(matricula)) {
            for (int i = 0; i < coches.size(); i++) {
                if (coches.get(i).getMatricula().equals(matricula)) coches.remove(i);
            }
        }else System.out.println("El coche con esa matricula no se encuentra en el garaje");
    }

    public void vaciarGaraje() {
        coches.clear();
    }

    private boolean encontrarMatricula(String matricula) {
        for (Coche item : coches) {
            if (item.getMatricula().equals(matricula)) return true;
        }
        return false;
    }
}
