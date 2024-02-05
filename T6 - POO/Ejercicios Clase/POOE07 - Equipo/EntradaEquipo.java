import modelEquipo.Equipo;

public class EntradaEquipo {
    public static void main(String[] args) {
        Equipo equipoA=new Equipo("Equipo A");
        Equipo equipoB=new Equipo("Equipo B", 90, 90, 60 );

        for (int i = 0; i < 3; i++) {

            equipoA.atacar();
            System.out.println("⚽  El resultado es Equipo A - " + equipoA.getGoles() + " a Equipo B - " + equipoB.getGoles() +"⚽");
            equipoB.atacar();
            System.out.println("⚽  El resultado es Equipo A - " + equipoA.getGoles() + " a Equipo B - " + equipoB.getGoles() +"⚽");
        }



    }
}
