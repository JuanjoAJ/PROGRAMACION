import modelGasolinera.Coche;
import modelGasolinera.Gasolinera;
import modelGasolinera.Surtidor;

public class EntradaGasolinera {
    public static void main(String[] args) {
        Surtidor surtidorA=new Surtidor(200,"gasolina");
        Surtidor surtidorB=new Surtidor(200,"diesel");
        Surtidor surtidorC=new Surtidor("gasolina98");
        Gasolinera repsol=new Gasolinera("repsol");
        repsol.agregarSurtidores(surtidorA);
        repsol.agregarSurtidores(surtidorB);
        repsol.agregarSurtidores(surtidorC);

        Coche coche=new Coche("gasolina");

        coche.ponerGasolina(surtidorA, 100);
        coche.ponerGasolina(surtidorB, 5);
        coche.ponerGasolina(surtidorA, 200);
        surtidorA.rellenar(200);
        

    }
}
