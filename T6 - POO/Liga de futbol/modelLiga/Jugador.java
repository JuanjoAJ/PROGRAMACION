package modelLiga;

public class Jugador {
    private String nombre, posicion;
    private boolean estrella;
    private int calidad, dorsal;


    //constructores
    public Jugador(){}
    public Jugador(String nombre, String posicion, int dorsal, int calidad) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.dorsal=dorsal;
        this.calidad = calidad;
        if (calidad>90) estrella=true;
        else estrella=false;
    }
    //metodos
    public void mostrarDatos(){
        System.out.println("El jugador " + nombre +" con dorsal " + dorsal);
        System.out.println("Juega en la posición " + posicion);
        System.out.println("Con una calidad de " + calidad);
        if (estrella) System.out.println("Y es la estrella del equipo ⚽");
    }

    //Setter & getter
    public String getNombre() {
        return nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public boolean isEstrella() {
        return estrella;
    }

    public int getCalidad() {
        return calidad;
    }
}