package model;

import javax.swing.*;

public class Run implements Runnable {

    public static int lugar;
    private int posicion;
    private String nombre;

    private JLabel coches, labelFinal;
    private Coche participantes;

    public Run() {
    }

    public Run(String nombre, JLabel coches, JLabel labelFinal, Coche participantes) {
        this.nombre = nombre;
        this.coches = coches;
        this.labelFinal = labelFinal;
        this.participantes = participantes;
        Thread hilo = new Thread(this, nombre);
        hilo.start();

    }

    @Override
    public void run() {
        int retardo;
        try {
            lugar = 1;

            retardo = (int) (Math.random() * 20) + 1;
            labelFinal.setVisible(false);
            coches.setVisible(true);

            for (int i = 50; i <= 500; i++) {
                coches.setLocation(i, coches.getY());
                Thread.sleep(retardo);
            }
            coches.setVisible(false);
            labelFinal.setVisible(true);
            posicion = lugar;
            labelFinal.setText("El coche con matrícula " + nombre + " ha llegado en la " + posicion + " posición.");
            sumaPuntosPanel(participantes);
            lugar++;

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }

    private void sumaPuntosPanel(Coche participantes) {
        if (posicion == 1) participantes.sumaPuntuacion(10);
        else if (posicion == 2) participantes.sumaPuntuacion(8);
        else if (posicion == 3) participantes.sumaPuntuacion(5);
    }


}



