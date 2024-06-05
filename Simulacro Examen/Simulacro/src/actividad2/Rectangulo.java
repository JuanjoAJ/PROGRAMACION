package actividad2;

public class Rectangulo extends Figura2D{

    private int longitudBase, longitudAltura;

    public Rectangulo() {
    }

    public Rectangulo(String nombre, int longitudBase, int longitudAltura) {
        super(nombre);
        this.longitudBase = longitudBase;
        this.longitudAltura = longitudAltura;
    }

    @Override
    public double calcularPerimetro() {
        return 2*longitudAltura+2*longitudBase;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rectangulo){
            return longitudAltura==((Rectangulo) obj).longitudAltura && longitudBase==((Rectangulo) obj).longitudBase && getNombre().equals(((Rectangulo) obj).getNombre());
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() +" tiene de longitud base "+ longitudBase + " y de altura " + longitudAltura;
    }

    public int getLongitudBase() {
        return longitudBase;
    }

    public void setLongitudBase(int longitudBase) {
        this.longitudBase = longitudBase;
    }

    public int getLongitudAltura() {
        return longitudAltura;
    }

    public void setLongitudAltura(int longitudAltura) {
        this.longitudAltura = longitudAltura;
    }
}
