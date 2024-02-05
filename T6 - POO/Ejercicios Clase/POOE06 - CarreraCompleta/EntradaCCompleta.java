import modelCarreraCompleta.CocheCarrera;

import java.util.ArrayList;

public class EntradaCCompleta {
    public static void main(String[] args) {

        ArrayList<CocheCarrera> carrera=new ArrayList<>();
        carrera.add(new CocheCarrera("Toyota","1234AAA",130));
        carrera.add(new CocheCarrera("Volkswagen","5678BBB",75));

        do {
            for (CocheCarrera coche:carrera) {
                coche.acelerar((int)((Math.random()*21)+10));
            }
        }while (!carrera.getFirst().carreraTerminada() && !carrera.getLast().carreraTerminada());


    }
}
