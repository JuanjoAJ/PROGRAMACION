package modelLiga;

import java.util.ArrayList;

public class LigaFutbol {
    private ArrayList<EquipoFutbol> equiposPrimera;
    private ArrayList<PartidoFutbol> partidosLiga;


    //Constructor

    public LigaFutbol(){
        this.equiposPrimera=new ArrayList<>();
        this.partidosLiga=new ArrayList<>();
    }


    public LigaFutbol(ArrayList<EquipoFutbol> equiposPrimera, ArrayList<PartidoFutbol> partidosLiga) {
        this.equiposPrimera = equiposPrimera;
        this.partidosLiga = partidosLiga;
    }


    public void sorteoEquipos(){



    }
    //DEspues del partido si gana


}
