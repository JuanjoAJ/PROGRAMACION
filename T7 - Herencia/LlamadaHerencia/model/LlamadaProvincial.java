package model;

public class LlamadaProvincial extends Llamada{


    public LlamadaProvincial() {
    }

    public LlamadaProvincial(int nOrigen, int nDestino, int duracion) {
        super(nOrigen, nDestino, duracion);
    }

    @Override
    public int coste(int duración) {
        return 15*duración;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("--Llamada Provincial--");
        super.mostrarDatos();
        System.out.println(" y con un coste de " + coste(getDuracion()));
    }
}
