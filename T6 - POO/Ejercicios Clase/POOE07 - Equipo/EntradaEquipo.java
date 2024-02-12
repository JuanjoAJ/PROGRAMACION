import modelEquipo.Equipo;
import modelEquipo.Partido;

public class EntradaEquipo {
    public static void main(String[] args) {
       /* Equipo equipoA=new Equipo("Equipo A");
        Equipo equipoB=new Equipo("Equipo B", 90, 90, 60 );

        for (int i = 0; i < 3; i++) {

            equipoA.atacar();
            System.out.println("⚽  El resultado es Equipo A - " + equipoA.getGoles() + " a Equipo B - " + equipoB.getGoles() +"⚽");
            equipoB.atacar();
            System.out.println("⚽  El resultado es Equipo A - " + equipoA.getGoles() + " a Equipo B - " + equipoB.getGoles() +"⚽");
        }*/

        Partido partido=new Partido(new Equipo("Equipo A", 90, 50, 60), new Equipo("Equipo B", 90, 50, 60));
        partido.iniciarPartido();
        partido.mostrarResultado();

        //muchos equipos // competición //liga

        // asignación de partidos. SORTEO DE LIGA. IDA y VUELTA.

        //Lógica de sorteo Y formato similar competición coches carrera

        // ¿Y si más adelante un equipo tiene jugadoreste ?



    }
}
