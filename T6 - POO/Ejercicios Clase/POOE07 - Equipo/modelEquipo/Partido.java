package modelEquipo;

public class Partido {
    private Equipo equipoA, equipoB;
    private boolean partidoEnJuego;
    private int tiempo;


    //constructores

    public Partido(Equipo equipoA, Equipo equipoB) {
        this.equipoA = equipoA;
        this.equipoB = equipoB;
    }


    //método

    public void iniciarPartido(){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
             if(equipoA.atacar() && equipoA.getNivelAtaque()>equipoB.getNivelDefensa())  equipoA.marcaGol();
             if(equipoB.atacar() && equipoB.getNivelAtaque()>equipoA.getNivelDefensa()) equipoB.marcaGol();
            }
        }
    }

    public void mostrarResultado(){

        System.out.printf("El resultado final del partido ⚽ Equipo A : %d -- Equipo B : %d ⚽", equipoA.getGoles(), equipoB.getGoles());

    }


    //Getter && Setter


}
