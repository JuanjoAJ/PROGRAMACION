package model;

public final class Autonomo extends MandoIntermedio {

    //Constructores
    public Autonomo() {
    }

    public Autonomo(String nombre, String apellido, String dni, int sueldoAnual, boolean contratado) {
        super(nombre, apellido, dni, sueldoAnual, contratado);
    }

    //Método

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println();
    }
}
