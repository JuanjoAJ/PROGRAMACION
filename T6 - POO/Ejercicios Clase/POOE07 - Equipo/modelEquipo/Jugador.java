package modelEquipo;

public class Jugador {
    private String nombre, posicion;
    private boolean estrella;
    private int calidad;


    //constructores
    public Jugador(){}
    public Jugador(String nombre, String posicion, int calidad) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.calidad = calidad;
        if (calidad>90) estrella=true;
        else estrella=false;
    }
    //metodos
    public void mostrarDatos(){
        System.out.println("El jugador " + nombre);
        System.out.println("Juega en la posición " + posicion);
        System.out.println("Con una calidad de " + calidad);
        if (estrella) System.out.println("Y es la estrella del equipo ⚽");
    }

}
