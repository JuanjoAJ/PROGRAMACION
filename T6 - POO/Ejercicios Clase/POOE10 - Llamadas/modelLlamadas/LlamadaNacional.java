package modelLlamadas;

public class LlamadaNacional {
    private long numeroOrigen, numeroDestino;
    private double coste, duracion;
    private char destino;


    //constructores


    public LlamadaNacional(long numeroOrigen, long numeroDestino, double duracion, char destino) {
        this.numeroOrigen = numeroOrigen;
        this.numeroDestino = numeroDestino;
        this.duracion = duracion;
        this.destino = destino;
        if (destino=='A'){
            coste=0.4*this.duracion;
        } else if (destino=='B') {
            coste=0.5*this.duracion;
        } else if (destino=='C') {
            coste=0.6*this.duracion;
        }else{
            coste=0.7*this.duracion;
        }
    }

    //metodos
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
