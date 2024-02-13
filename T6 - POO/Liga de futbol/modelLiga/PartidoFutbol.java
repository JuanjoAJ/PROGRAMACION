package modelLiga;

import modelEquipo.Equipo;

public class PartidoFutbol {

    private EquipoFutbol local;
    private EquipoFutbol visitante;


    //constructores

    public PartidoFutbol(EquipoFutbol equipoA, EquipoFutbol equipoB) {
        this.local = equipoA;
        this.visitante = equipoB;
    }

    //método

    public void iniciarPartido(){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if(local.atacar() && local.getNivelAtaque()>visitante.getNivelDefensa())  local.marcaGol();
                if(visitante.atacar() && visitante.getNivelAtaque()>local.getNivelDefensa()) visitante.marcaGol();
            }
        }
    }

    public void mostrarResultado(){

        System.out.printf("El resultado final del partido ⚽ Equipo %s : %d -- Equipo %s : %d ⚽",local.getNombre(), local.getGoles(), visitante.getNombre(), visitante.getGoles());

    }



}
