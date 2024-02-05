package modelCarreraCompleta;

import modelCarrera.Coche;

public class CocheCarrera extends Coche {
    private int kmEtapa;


    public CocheCarrera(String modelo, String matricula,int cv){
        super(modelo, matricula, cv);

    }


    //metodos
    public boolean carreraTerminada(){
        kmEtapa=10000;
        if (getKmRecorridos()>=kmEtapa){
            System.out.println("La carrera ha terminado, el ganador es el coche "+getModelo()+" con matricula "+getMatricula() + " con un total de " + (int)getKmRecorridos()+" km recorridos.");
            return true;
        }
        return false;
    }
}
