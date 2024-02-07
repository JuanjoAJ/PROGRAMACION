

import java.util.Scanner;
import modelCoche.*;
/*Desarrollar una clase llamada Aplicacion que en su método main:

- Cree un garaje.
- Cree 2 coches.
- El garaje irá cogiendo los coches y devolviéndolos, acumulando un importe aleatorio (Math.random()) de la avería tratada.
- Si la avería del coche es “aceite” incrementar en 10 los litros de aceite.
- Los coches entrarán al menos 2 veces en el garaje.
- Mostrar la información de los coches al final del main.*/
public class Aplicacion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Coche[] coche = {new Coche("seat", "ibiza"), new Coche("ford", "mustang")};
        Garaje garaje = new Garaje();

        for (int i = 0; i < coche.length; i++) {
            for (int j = 0; j < coche.length; j++) {
                garaje.aceptarCoche(coche[j], scanner.next());
                garaje.devolverCoche();
            }
        }
       for (Coche imp:coche) garaje.mostrarDatosGaraje(imp);
    }
}
