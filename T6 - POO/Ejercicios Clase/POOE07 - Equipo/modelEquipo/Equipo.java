package modelEquipo;

public class Equipo {
    private String nombre;
    private int nivelAtaque, nivelCentro, nivelDefensa, goles;

    //constructor

    public Equipo() {
    }

    public Equipo(String nombre) {
        this.nombre = nombre;
        nivelAtaque = (int) (Math.random() * 101);
        nivelCentro = (int) (Math.random() * 101);
        nivelDefensa = (int) (Math.random() * 101);
        goles = 0;
    }

    public Equipo(String nombre, int nivelAtaque, int nivelCentro, int nivelDefensa) {
        this.nombre = nombre;
        this.nivelAtaque = nivelAtaque;
        this.nivelCentro = nivelCentro;
        this.nivelDefensa = nivelDefensa;
    }

    //metodos

    public boolean atacar(){
        if( ((int) (nivelAtaque * Math.random() * 2) + (nivelCentro * (int) Math.random() * 2 / 2)) > 90) {
            goles++;
            return true;
        }
        return false;
    }


    public int getGoles(){
        return goles;
    }
}