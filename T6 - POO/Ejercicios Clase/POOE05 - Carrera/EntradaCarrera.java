import java.util.ArrayList;
import java.util.Arrays;

import modelCarrera.Coche;

public class EntradaCarrera {
    public static void main(String[] args) {
        ArrayList<Coche> coches=new ArrayList<>(Arrays.asList(new Coche(),new Coche("Toyota","1234AAA",130)));
        //Muestra por pantalla los datos de los dos coches
        for (Coche imp:coches) {
            System.out.println("\t--------------------------------------------------------------------------------------------------");
            imp.mostrarDatos();
        }
        //Modifica los datos del CocheA
        coches.getFirst().setModelo("Volkswagen");
        coches.getFirst().setMatricula("5678BBB");
        coches.get(0).setCv(75);
        //Modifica la velocidad y muestra por pantalla los datos
        for (Coche coche:coches) {
            coche.setVelocidad((int)((Math.random()*21)+10));
            coche.acelerar((int)((Math.random()*21)+10));
        }
        for (Coche imp:coches) {
            System.out.println("\t--------------------------------------------------------------------------------------------------");
            imp.mostrarDatos();
        }
        //Imprime por pantalla el siguiente mensaje, teniendo en cuenta que el coche ganador será el que más km haya recorrido
        System.out.println("\t🏁-------------------------------------------------------------------------------------------------🏁");
        if (coches.getFirst().getKmRecorridos()>coches.getLast().getKmRecorridos()) System.out.printf("El ganador es %s %s con %.2f km recorridos", coches.get(0).getModelo(), coches.get(0).getMatricula(), coches.get(0).getKmRecorridos());
        else System.out.printf("El ganador es %s %s con %.2f km recorridos", coches.get(1).getModelo(), coches.get(1).getMatricula(), coches.get(1).getKmRecorridos());





    }
}
