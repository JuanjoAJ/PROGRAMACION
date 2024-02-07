package modelLlamadas;

import java.util.ArrayList;
import java.util.Scanner;

public class Centralita {
    private ArrayList<LlamadaLocal>llamadaLocals;
    private ArrayList<LlamadaNacional> llamadaNacionals;
    private int costeAcumulado;

    //constructores

    public Centralita(){
        llamadaLocals=new ArrayList<>();
        llamadaNacionals=new ArrayList<>();
    }

    //métodos

    public void agregarLocal(LlamadaLocal llamadaLocal){
        llamadaLocals.add(llamadaLocal);
    }
    public void agregarNacional(LlamadaNacional llamadaNacional){
        llamadaNacionals.add(llamadaNacional);
    }
    public void listarLocales(){
        for (LlamadaLocal imp:llamadaLocals) {
            imp.mostrarDatos();
        }
    }
    public void listarNacionales(){
        for (LlamadaNacional imp:llamadaNacionals) {
            imp.mostrarDatos();
        }
    }
    public void mostrarCostes(){
        for (LlamadaLocal sum:llamadaLocals) {
            costeAcumulado+=sum.getCoste();
        }
        for (LlamadaNacional sum:llamadaNacionals) {
            costeAcumulado+=sum.getCoste();
        }
        System.out.println("El coste acumulado es de " + costeAcumulado);

    }

    //Getter & Setter


    public ArrayList<LlamadaLocal> getLlamadaLocals() {
        return llamadaLocals;
    }

    public void setLlamadaLocals(ArrayList<LlamadaLocal> llamadaLocals) {
        this.llamadaLocals = llamadaLocals;
    }

    public ArrayList<LlamadaNacional> getLlamadaNacionals() {
        return llamadaNacionals;
    }

    public void setLlamadaNacionals(ArrayList<LlamadaNacional> llamadaNacionals) {
        this.llamadaNacionals = llamadaNacionals;
    }

    public int getCosteAcumulado(){
        return costeAcumulado;
    }

}
