package modelLlamadas;
public class LlamadaLocal {
    private long numeroOrigen, numeroDestino;
    private double coste, duracion;

    //constructor
    public LlamadaLocal(double numeroOrigen, double numeroDestino, double duracion) {
        this.numeroOrigen = (long) numeroOrigen;
        this.numeroDestino = (long) numeroDestino;
        this.duracion=duracion;
        this.coste=0.5+(duracion*0.15);
    }
    //método
    public void mostrarDatos(){
        System.out.println("El número de origen es " + numeroOrigen);
        System.out.println("El número de destino es " + numeroDestino);
        System.out.println("La duración de la llamada fue de "+ duracion);
        System.out.println("El coste de la llamada es " + coste);
    }
    //Getter & Setter


    public long getNumeroOrigen() {
        return numeroOrigen;
    }

    public void setNumeroOrigen(long numeroOrigen) {
        this.numeroOrigen = numeroOrigen;
    }

    public long getNumeroDestino() {
        return numeroDestino;
    }

    public void setNumeroDestino(long numeroDestino) {
        this.numeroDestino = numeroDestino;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
}
