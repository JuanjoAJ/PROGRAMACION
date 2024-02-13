package modelEquipo;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private int nivelAtaque, nivelCentro, nivelDefensa, goles;

    private ArrayList<Jugador> listadoJugadores;

    //constructor

    public Equipo() {
        listadoJugadores=new ArrayList<>();
    }

    public Equipo(String nombre) {
        this.nombre = nombre;
        nivelAtaque = (int) (Math.random() * 101);
        nivelCentro = (int) (Math.random() * 101);
        nivelDefensa = (int) (Math.random() * 101);
        goles = 0;
        listadoJugadores=new ArrayList<>();
    }

    public Equipo(String nombre, int nivelAtaque, int nivelCentro, int nivelDefensa) {
        this.nombre = nombre;
        this.nivelAtaque = nivelAtaque;
        this.nivelCentro = nivelCentro;
        this.nivelDefensa = nivelDefensa;
        listadoJugadores=new ArrayList<>();
    }

    //metodos

    public boolean atacar(){
        if( ((int) (nivelAtaque * Math.random() * 2) + (nivelCentro * (int) (Math.random() * 2) / 2)) > 90) {
           // goles++;
            return true;
        }
        return false;
    }

    public void listarDelanteros(){
        for (int i = 0; i < listadoJugadores.size(); i++) {
            if (listadoJugadores.get(i).getPosicion().equalsIgnoreCase("delantero")){
                System.out.println("El delantero "+listadoJugadores.get(i).getNombre());
                System.out.println("Tiene una calidad de "+ listadoJugadores.get(i).getCalidad());
                if (listadoJugadores.get(i).isEstrella()) System.out.println("Y además, es la estrella del equipo");
            }else {
                System.out.println("No hay delanteros asociados al equipo");
            }
        }
    }

    public void marcaGol(){
        goles++;
    }


//Setter & Getter

    public int getNivelAtaque() {
        return nivelAtaque;
    }

    public int getNivelCentro() {
        return nivelCentro;
    }

    public int getNivelDefensa() {
        return nivelDefensa;
    }

    public int getGoles(){
        return goles;
    }

    public void setGoles(int goles){
        this.goles=goles;
    }

}