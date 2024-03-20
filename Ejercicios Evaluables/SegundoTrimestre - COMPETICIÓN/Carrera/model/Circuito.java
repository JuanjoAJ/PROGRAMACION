package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Circuito {
    Scanner scanner = new Scanner(System.in);
    private int vueltas, kilometros;
    private Coche primero, segundo, tercero;

    //constructores
    public Circuito() {

    }

    public Circuito(int vueltas, int kilometros) {
        this.vueltas = vueltas;
        this.kilometros = kilometros;

    }

    //metodos
    public void iniciarCarrera(ArrayList<Coche> participantes) {
        for (int i = 0; i < vueltas; i++) {
            System.out.println("Vuelta " + (i + 1));
            for (int j = 0; j < participantes.size(); j++) {
                System.out.println("\u001B[32mIntroduce la velocidad del coche " + (j + 1) + "\u001B[0m");
                participantes.get(j).acelerar(scanner.nextInt());
                ganador(participantes);
            }
        }
        if ((tercero == null && participantes.size() > 2) || (segundo == null && participantes.size() < 3))
            System.out.println("\u001B[36mHAN TERMINADO LAS VUELTAS OFICIALES. PERO LA CARRERA CONTINÚA HASTA ENCONTRAR A NUESTROS TRES CAMPEONES:\u001B[0m");
        while ((tercero == null && participantes.size() > 2) || (segundo == null && participantes.size() < 3)) {
            for (int j = 0; j < participantes.size(); j++) {
                System.out.println("\u001B[32mIntroduce la velocidad del coche " + (j + 1) + "\u001B[0m");
                participantes.get(j).acelerar(scanner.nextInt());
                ganador(participantes);
            }
        }
        podium();
    }

    private void ganador(ArrayList<Coche> participantes) {
        for (int i = 0; i < participantes.size(); i++) {
            if (participantes.get(i).getKmRecorridos() >= kilometros) {
                if (primero == null) {
                    primero = participantes.get(i);
                    participantes.get(i).sumaPuntuacion(10);
                } else if (segundo == null && participantes.get(i) != primero) {
                    segundo = participantes.get(i);
                    participantes.get(i).sumaPuntuacion(8);
                } else if (tercero == null && participantes.get(i) != primero && participantes.get(i) != segundo && participantes.size() > 2) {
                    tercero = participantes.get(i);
                    participantes.get(i).sumaPuntuacion(5);
                }
            }
        }
    }

    private void podium() {
        if (null != primero && null != segundo) {
            System.out.println("\u001B[33mEn primera posición tenemos a: ");
            primero.mostrarDatos();
            System.out.println("\u001B[34mEn segunda posición nos encontramos con: ");
            segundo.mostrarDatos();
            if (null != tercero) {
                System.out.println("\u001B[31mY por último en una muy merecida tercera posición: ");
                tercero.mostrarDatos();
            }
            System.out.println("\u001B[0mGRACIAS A TODOS POR PARTICIPAR" +
                    "\n---------------------------------------------------------------------------------------\n");
        }
    }

    public void mostrarDatosCircuito() {
        System.out.println("🌲🏁Circuito con " + vueltas + " vueltas y " + kilometros + " km. por cada vuelta 🏁🌲");
    }

    //Setter & Getter
    public int getVueltas() {
        return vueltas;
    }

    public void setVueltas(int vueltas) {
        this.vueltas = vueltas;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public Coche getPrimero() {
        return primero;
    }

    public Coche getSegundo() {
        return segundo;
    }

    public Coche getTercero() {
        return tercero;
    }
}
