package controller;

import model.Llamada;
import model.LlamadaLocal;
import model.LlamadaNacional;
import model.LlamadaProvincial;

import java.util.ArrayList;
import java.util.Scanner;

public class Centralita {
    ArrayList<Llamada> telefono;
    Scanner sc=new Scanner(System.in);
    //Constructor
    public Centralita(){
        telefono=new ArrayList<>();
    }
    public Centralita(ArrayList<Llamada> telefono) {
        this.telefono = telefono;
    }

    //Métodos

    public void registrarLlamadas(){
        System.out.println("""
                ¿Qué tipo de llamada desea registrar?
                 1) Llamada local
                 2) Llamada provincial
                 3) Llamada nacional""");
        switch (sc.nextInt()){
            case 1:
                System.out.println("Introduzca numero de origen, número de destino y duración");
                telefono.add(new LlamadaLocal(sc.nextInt(), sc.nextInt(), sc.nextInt()));
                break;
            case 2:
                System.out.println("Introduzca numero de origen, número de destino y duración");
                telefono.add(new LlamadaProvincial(sc.nextInt(), sc.nextInt(), sc.nextInt()));
                break;
            case 3:
                System.out.println("Introduzca numero de origen, número de destino, duración y franja horaria");
                telefono.add(new LlamadaNacional(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
                break;
            default:
                break;
        }
    }
    public void mostrarCostes(){
        int costeTotal=0;
        for (Llamada item:telefono){
            costeTotal+= item.coste(item.getDuracion());
        }
        System.out.println("El coste total de todas las llamadas es de " + costeTotal);
    }
    public void mostrarLlamadas(){
        for (Llamada item:telefono){
         item.mostrarDatos();
        }
    }


    //Getter & Setter


    public ArrayList<Llamada> getTelefono() {
        return telefono;
    }

    public void setTelefono(ArrayList<Llamada> telefono) {
        this.telefono = telefono;
    }
}
