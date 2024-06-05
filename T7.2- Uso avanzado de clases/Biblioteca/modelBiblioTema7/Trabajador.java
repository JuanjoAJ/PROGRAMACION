package modelBiblioTema7;

public class Trabajador extends Persona{
    public Trabajador() {
    }
    public Trabajador(String nombre, String apellidos, String dni) {
        super(nombre, apellidos, dni);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("El trabajador: ");
        super.mostrarDatos();
        System.out.println();
    }
}
