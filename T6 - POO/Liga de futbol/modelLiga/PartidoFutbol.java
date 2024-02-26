package modelLiga;

public class PartidoFutbol {

    private final EquipoFutbol local;
    private final EquipoFutbol visitante;


    //constructor

    public PartidoFutbol(EquipoFutbol equipoA, EquipoFutbol equipoB) {
        this.local = equipoA;
        this.visitante = equipoB;
    }

    //método

    public void iniciarPartido() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (local.atacar() && (local.getNivelAtaque() + local.getNivelCentro()) > visitante.getNivelDefensa())
                    local.marcaGol();
                if (visitante.atacar() && (visitante.getNivelAtaque() + visitante.getNivelCentro()) > local.getNivelDefensa())
                    visitante.marcaGol();
            }
        }
        ganadorPartido();
        mostrarResultado();

    }


    private void mostrarResultado() {

        System.out.printf("El resultado final del partido ⚽ Equipo %s : %d -- Equipo %s : %d ⚽", local.getNombre(), local.getGoles(), visitante.getNombre(), visitante.getGoles());
        System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------\n" +
                "\t ⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽\n" +
                "------------------------------------------------------------------------------------------------------------------------------------------------------\n");


    }

    private void ganadorPartido() {
        if (local.getGoles() > visitante.getGoles()) {
            local.sumaPuntos(3);
        } else if (local.getGoles() < visitante.getGoles()) {
            visitante.sumaPuntos(3);
        } else {
            local.sumaPuntos(1);
            visitante.sumaPuntos(1);
        }
    }

    public void mostrarPartido() {
        System.out.println("\n Enfrentamiento de " + local.getNombre() +
                " contra " + visitante.getNombre() + "\n⚽⚽⚽⚽⚽⚽⚽⚽");
    }



    //Getter
    public EquipoFutbol getLocal() {
        return local;
    }
    public EquipoFutbol getVisitante() {
        return visitante;
    }
}
