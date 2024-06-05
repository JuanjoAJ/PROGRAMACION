package utilsTiendaAnidada;

import java.util.Random;

public enum Tipo {
    mtb((int) ((Math.random()*101)+100)*2), carretera((int) (Math.random()*101)+150) , paseo((int) (Math.random()*51)+50);

    int constanteReparacion;

    Tipo(int constanteReparacion) {
        this.constanteReparacion = constanteReparacion;
    }

    public int getConstanteReparacion() {
        return constanteReparacion;
    }

    public void setConstanteReparacion(int constanteReparacion) {
        this.constanteReparacion = constanteReparacion;
    }
}
