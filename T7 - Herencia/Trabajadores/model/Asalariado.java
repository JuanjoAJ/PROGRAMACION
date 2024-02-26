package model;

public final class Asalariado extends MandoIntermedio {
    private int numPagas;

    //Constructores
    public Asalariado(){}

    public Asalariado(String nombre, String apellido, String dni, int sueldoAnual, boolean contratado, int numPagas) {
        super(nombre, apellido, dni, sueldoAnual, contratado);
        this.numPagas = numPagas;
    }

    //Método

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.print(" con un Salario mensual: " +(getSueldoAnual()/12) );
        System.out.print(" y Número de pagas: " + numPagas);
        System.out.println();
    }


    //Getter & Setter


    public int getNumPagas() {
        return numPagas;
    }

    public void setNumPagas(int numPagas) {
        this.numPagas = numPagas;
    }
}
