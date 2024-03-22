package actividad2;

public class Triangulo extends Figura2D{

    private int ladoUno, ladoDos, ladoTres;


    public Triangulo(){
    }

    public Triangulo(String nombre, int ladoUno, int ladoDos, int ladoTres) {
        super(nombre);
        this.ladoUno = ladoUno;
        this.ladoDos = ladoDos;
        this.ladoTres = ladoTres;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Triangulo){
            return ladoUno==((Triangulo) obj).ladoUno&&ladoDos==((Triangulo) obj).ladoDos&&ladoTres==((Triangulo) obj).ladoTres&&getNombre().equals(((Triangulo) obj).getNombre());
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + " y como lados " + ladoUno + " " + ladoDos + " y " + ladoTres;
    }

    @Override
    public double calcularPerimetro() {
        return ladoUno+ladoDos+ladoTres;
    }

    public int getLadoUno() {
        return ladoUno;
    }

    public void setLadoUno(int ladoUno) {
        this.ladoUno = ladoUno;
    }

    public int getLadoDos() {
        return ladoDos;
    }

    public void setLadoDos(int ladoDos) {
        this.ladoDos = ladoDos;
    }

    public int getLadoTres() {
        return ladoTres;
    }

    public void setLadoTres(int ladoTres) {
        this.ladoTres = ladoTres;
    }
}
