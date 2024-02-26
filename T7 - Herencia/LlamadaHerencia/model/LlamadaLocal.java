package model;

public class LlamadaLocal extends Llamada{


    //Constructores
    public LlamadaLocal() {}
    public LlamadaLocal(int nOrigen, int nDestino, int duracion) {
        super(nOrigen, nDestino, duracion);
    }

    //Métodos


    @Override
    public int coste(int duracion) {
        return 0;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("--Llamada Local--");
        super.mostrarDatos();
        System.out.println(" y sin coste");
    }
}
