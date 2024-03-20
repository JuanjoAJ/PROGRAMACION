package Controller;

import model.Circuito;
import model.Coche;
import model.PanelCarrera;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class Competicion {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Circuito> circuitos;

    private ArrayList<Coche> participantes;

    private PanelCarrera panel;

    //constructor
    public Competicion() {
        circuitos = new ArrayList<>();
        participantes = new ArrayList<>();
        panel = new PanelCarrera();
    }


    //metodos

    //Ingresar datos
    public void ingresarParticipantes() {
        System.out.println("¿Cuantos participantes desea inscribir?");
        int nParticipantes = scanner.nextInt();
        String matricula;

        for (int i = 0; i < nParticipantes; i++) {
            do {
                System.out.println("Introduce la matricula");
                matricula = scanner.next();
                if (buscarParticipante(matricula) != null) System.out.println("Esa matrícula ya está registrada");
            } while (buscarParticipante(matricula) != null);

            System.out.println("Por favor, introduce marca, modelo, color, CV, CC y velocidad");
            participantes.add(new Coche(scanner.next(), scanner.next(), matricula, scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
            System.out.println("🏁 Coche registrado correctamente 🏁");
            System.out.println();


        }
    }

    public void eliminarParticipante() {
        System.out.println("Introduce la matricula del coche a eliminar");
        String matricula = scanner.next();
        if (buscarParticipante(matricula) == null) {
            System.out.println("Ese coche no está inscrito");
        } else {
            participantes.remove(buscarParticipante(matricula));
            System.out.println("Participante eliminado correctamente");
        }
    }

    private Coche buscarParticipante(String matricula) {
        for (Coche item : participantes) {
            if (matricula.equals(item.getMatricula())) return item;
        }
        return null;
    }

    public void ingresarCompeticion() {
        System.out.println("¿Cuantas carreras desea tener en su competición?");
        int carreras = scanner.nextInt();
        for (int i = 0; i < carreras; i++) {
            System.out.println("Indique las vueltas y los kilometros de la vuelta " + (i + 1));
            ingresarCircuitoIndividual(scanner.nextInt(), scanner.nextInt());
        }
    }

    private void ingresarCircuitoIndividual(int vueltas, int kilometros) {
        circuitos.add(new Circuito(vueltas, kilometros));
    }

    // Iniciar competiciones
    public void iniciarCompeticion() {
        for (Circuito carrera : circuitos) {
            System.out.println("Comienza una nueva carrera en nuestra competición ");
            carrera.iniciarCarrera(participantes);
            resetearVelocidad();
        }
    }

    private void resetearVelocidad() {
        for (int i = 0; i < participantes.size(); i++) {
            participantes.get(i).setVelocidad(participantes.get(i).getVelocidadBase());
        }
    }

    //Mostrar datos
    public void mostrarDatos() {
        for (Coche imp : participantes) {
            imp.mostrarDatos();
        }
    }

    public void mostrarDatosIndividual() {
        System.out.println("Introduce la matricula del coche que desea ver los datos");
        String matricula = scanner.next();
        if (buscarParticipante(matricula) == null) {
            System.out.println("Ese coche no está inscrito");
        } else buscarParticipante(matricula).mostrarDatos();
    }

    public void mostrarCircuitos() {
        int i = 1;
        for (Circuito item : circuitos) {
            System.out.println("Circuito de Carreras nº " + i);
            item.mostrarDatosCircuito();
            System.out.println("🏁🌲-----------------------------------------------🌲🏁");
            i++;
        }
    }

    public void podiumFinal() {

        if (participantes.size() > 1) {
            participantes.sort(new Comparator<Coche>() {
                @Override
                public int compare(Coche o1, Coche o2) {
                    if (o1.getPuntuacion() > o2.getPuntuacion()) return -1;
                    else if (o1.getPuntuacion() < o2.getPuntuacion()) return 1;
                    else return 0;
                }
            });

            System.out.println("🥇 En el primer puesto de la competición. El ganador: ");
            participantes.get(0).mostrarDatos();
            System.out.println("🥈 En el segundo puesto tenemos: ");
            participantes.get(1).mostrarDatos();
            if (participantes.size() > 2) {
                System.out.println("🥉 Por último, en el tercer puesto tenemos: ");
                participantes.get(2).mostrarDatos();
            }
        } else System.out.println("No hay participantes suficientes como para hacer un podium");
    }

    //Resetear valores
    public void resetearPuntuacion() {
        for (Coche item : participantes) {
            item.setPuntuacion(0);
        }
    }

    public void resetearCircuitos() {
        circuitos.clear();
    }

    //Carrera "en vivo"
    public void iniciarPanel() {
        if (!participantes.isEmpty()) {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    panel.agregarCochesPanel(participantes);
                    panel.setVisible(true);

                }
            });
            panel = new PanelCarrera();
        } else System.out.println("No se puede hacer carrera sin participantes");

    }


    //Getter & Setter
    public ArrayList<Circuito> getCircuitos() {
        return circuitos;
    }

    public void setCircuitos(ArrayList<Circuito> circuitos) {
        this.circuitos = circuitos;
    }

    public ArrayList<Coche> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Coche> participantes) {
        this.participantes = participantes;
    }
}
