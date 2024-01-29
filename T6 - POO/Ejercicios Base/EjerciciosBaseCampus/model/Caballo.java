package model;

public class Caballo {
    private String nombre, color;
   private int edad, carrerasGanadas;

    //constructores

    public Caballo() {
    }

    public Caballo(String nombre, String color, int edad, int carrerasGanadas) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
        this.carrerasGanadas = carrerasGanadas;
    }

    //métodos
    public void cabalga() {
        System.out.println("Tocotoc tocotoc tocotoc");
    }
    public void relincha() {
        System.out.println("Hiiiiiiieeeeee");
    }
    public void rumia() {
        System.out.println("Ñam ñam ñam");
    }

    //Getter & Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCarrerasGanadas() {
        return carrerasGanadas;
    }

    public void setCarrerasGanadas(int carrerasGanadas) {
        this.carrerasGanadas = carrerasGanadas;
    }
}
