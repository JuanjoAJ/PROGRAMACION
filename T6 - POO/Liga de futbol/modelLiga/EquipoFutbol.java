package modelLiga;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class EquipoFutbol {
    Scanner s=new Scanner(System.in);
    private String nombre;
    private int nivelAtaque, nivelCentro, nivelDefensa, goles, puntos;
    private ArrayList<Jugador> banquillo;
    private Jugador [] onceInicial;

    //constructor

    public EquipoFutbol() {

        onceInicial=new Jugador[11];
        banquillo = new ArrayList<>();
    }

    public EquipoFutbol(String nombre) {
        this.nombre = nombre;
        goles = 0;
        onceInicial=new Jugador[11];
        banquillo = new ArrayList<>();
    }

    public EquipoFutbol(String nombre, int nivelAtaque, int nivelCentro, int nivelDefensa) {
        this.nombre = nombre;
        this.nivelAtaque = nivelAtaque;
        this.nivelCentro = nivelCentro;
        this.nivelDefensa = nivelDefensa;

    }

    //metodos

    public void agregarJugadores(){
        for (int i = 0; i < onceInicial.length; i++) {
            System.out.println("Añade jugador: ");
            onceInicial[i]=new Jugador(s.next(), s.next(), s.nextInt(), s.nextInt());
            asignarNivelEquipo(onceInicial[i]);
        }
        System.out.println("¿Quieres agregar gente al banquillo?");
        if (s.next().equalsIgnoreCase("si")){
            do {
                banquillo.add(new Jugador(s.next(), s.next(), s.nextInt(), s.nextInt()));
                System.out.println("Para salir introduce un número negativo, para seguir añadiendo introduce cualquier otro número");
            }while (s.nextInt()>-1);
        }
    } //Método para asignar once inicial y jugadores de banquillo, además de asignar el nivel del equipo

    private int asignarNivelEquipo(Jugador jugador){
       if (jugador.getPosicion().equalsIgnoreCase("delantero")) return this.nivelAtaque+= jugador.getCalidad();
       else if (jugador.getPosicion().equalsIgnoreCase("central")) return this.nivelCentro+= jugador.getCalidad();
       else return this.nivelDefensa+= jugador.getCalidad();
    }

    public void listarOnceInicial() {
        Arrays.sort(onceInicial, Comparator.comparing(Jugador::getPosicion ));
        for (int i = 0; i < onceInicial.length; i++) {
            onceInicial[i].mostrarDatos();
        }
    } //Método para listar jugadores
    public void listarBanquillo(){
        for (Jugador imp:banquillo) {
            imp.mostrarDatos();
        }
    }

    public int sumaPuntos(int punt){
       return puntos+=punt;
    } //Método para sumar puntos


    public boolean atacar() {
        return ((int) (nivelAtaque * Math.random() * 2) + (nivelCentro * (int) (Math.random() * 2) / 2)) > 90;
    }
    public void marcaGol(){
        goles++;
    }


    //Getter & Setter


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivelAtaque() {
        return nivelAtaque;
    }

    public void setNivelAtaque(int nivelAtaque) {
        this.nivelAtaque = nivelAtaque;
    }

    public int getNivelCentro() {
        return nivelCentro;
    }

    public void setNivelCentro(int nivelCentro) {
        this.nivelCentro = nivelCentro;
    }

    public int getNivelDefensa() {
        return nivelDefensa;
    }

    public void setNivelDefensa(int nivelDefensa) {
        this.nivelDefensa = nivelDefensa;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public ArrayList<Jugador> getBanquillo() {
        return banquillo;
    }

    public void setBanquillo(ArrayList<Jugador> banquillo) {
        this.banquillo = banquillo;
    }

    public Jugador[] getOnceInicial() {
        return onceInicial;
    }

    public void setOnceInicial(Jugador[] onceInicial) {
        this.onceInicial = onceInicial;
    }
}