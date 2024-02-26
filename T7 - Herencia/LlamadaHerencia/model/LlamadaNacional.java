package model;

public class LlamadaNacional extends Llamada{

    private int franja;

    public LlamadaNacional() {
    }

    public LlamadaNacional(int nOrigen, int nDestino, int duracion, int franja) {
        super(nOrigen, nDestino, duracion);
        if(franja<1 || franja>2){
            this.franja=3;
        }else {
            this.franja = franja;
        }
    }

    //Métodos

    @Override
    public int coste(int duracion) {
        if (franja==1){
           return 20*duracion;
        }else if(franja==2){
            return 25*duracion;
        }else {
            return 30*duracion;
        }
    }

    @Override
    public void mostrarDatos() {
        System.out.println("--Llamada Nacional--");
        super.mostrarDatos();
        System.out.print(" en la franja horaria " + franja);
        System.out.println(" y con un coste de " + coste(getDuracion()));
    }

    //Getter & Setter

    public int getFranja() {
        return franja;
    }

    public void setFranja(int franja) {
        this.franja = franja;
    }
}
