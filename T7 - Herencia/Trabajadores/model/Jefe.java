package model;

public final class Jefe extends Trabajador{
    private int acciones, beneficios;



    //Constructores
    public Jefe() {
    }
    public Jefe(String nombre, String apellido, String dni, int acciones, int beneficios) {
        super(nombre, apellido, dni);
        this.acciones = acciones;
        this.beneficios = beneficios;
    }

    //Métodos
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.print(" Acciones: " + acciones);
        System.out.print(" Beneficio: " + beneficios);
        System.out.println();
    }

    public void despedirEmpleado(MandoIntermedio trabajador){
        if(trabajador.isContratado()) {
            trabajador.setContratado(false);
            System.out.println("El jefe " + getNombre() + " ha despedido correctamente a " + trabajador.getNombre());
        }else {
            System.out.println("El empleado no trabaja con nosotros");
        }
    }
    public void contratarEmpleado(MandoIntermedio trabajador){
        if(!trabajador.isContratado()) {
            trabajador.setContratado(true);
            System.out.println("El jefe " + getNombre() + " ha contratado correctamente a " + trabajador.getNombre());
        }else {
            System.out.println("El empleado ya trabajaba con nosotros");
        }
    }


    //Getter & Setter
    public int getAcciones() {
        return acciones;
    }

    public void setAcciones(int acciones) {
        this.acciones = acciones;
    }

    public int getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(int beneficios) {
        this.beneficios = beneficios;
    }
}
