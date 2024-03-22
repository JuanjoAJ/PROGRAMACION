package actividad2;

public class Circulo extends Figura2D{

    private double radio;


    public Circulo() {
    }

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2*Math.PI*radio;
    }

    @Override
    public boolean equals(Object obj) {

        if(obj instanceof Circulo){
            return radio== ((Circulo) obj).radio && getNombre().equals(((Circulo) obj).getNombre());
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + " tiene un radio de " + radio;
    }
    //Getter & Setter

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
