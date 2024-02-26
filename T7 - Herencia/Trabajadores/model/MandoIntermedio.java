package model;

public abstract class MandoIntermedio extends Trabajador{
    private int sueldoAnual;
    private boolean contratado;

    //Constructor


    public MandoIntermedio() {
    }

    public MandoIntermedio(String nombre, String apellido, String dni, int sueldoAnual, boolean contratado) {
        super(nombre, apellido, dni);
        this.sueldoAnual = sueldoAnual;
        this.contratado = contratado;
    }

    //Método
     @Override
     public void mostrarDatos(){
         super.mostrarDatos();
         System.out.print(" Salario Anual: " + sueldoAnual);
         if (isContratado()) System.out.print(" Actualmente trabaja con la empresa");
         else System.out.println(" En estos momentos no está contratado por la empresa");
     }

    //Getter & Setter


    public int getSueldoAnual() {
        return sueldoAnual;
    }

    public void setSueldoAnual(int sueldoAnual) {
        this.sueldoAnual = sueldoAnual;
    }

    public boolean isContratado() {
        return contratado;
    }

    public void setContratado(boolean contratado) {
        this.contratado = contratado;
    }
}
