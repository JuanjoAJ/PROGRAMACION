package model;

public abstract class Llamada {
    private int nOrigen, nDestino, duracion;

//Constructores
    public Llamada() {
    }

    public Llamada(int nOrigen, int nDestino, int duracion) {
        this.nOrigen = nOrigen;
        this.nDestino = nDestino;
        this.duracion = duracion;
    }

    //Métodos

    public abstract int coste(int duracion);

    public void mostrarDatos(){
        System.out.printf("Llamada con número de origen: %d y destino: %d. Con una duración total de %d segundos",nOrigen,nDestino,duracion );
    }

    //Getter & Setter


    public int getnOrigen() {
        return nOrigen;
    }

    public void setnOrigen(int nOrigen) {
        this.nOrigen = nOrigen;
    }

    public int getnDestino() {
        return nDestino;
    }

    public void setnDestino(int nDestino) {
        this.nDestino = nDestino;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
