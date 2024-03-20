package model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PanelCarrera extends JFrame {

    private JLabel cocheUno, cocheDos, cocheTres, cocheCuatro, cocheCinco, cochePos, cocheDosPos, cocheTresPos, cocheCuatroPos, cocheCincoPos;
    private JPanel panel;
    private JButton botonIniciarCarrera;

    private ArrayList<Run> coches;

    public PanelCarrera() {
        super("Competición de Coches");
        coches = new ArrayList<>();

        setSize(600, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);

        Image imageCocheUno = new ImageIcon("imagenes/CocheUno.gif").getImage();
        ImageIcon iconCoche = new ImageIcon(imageCocheUno.getScaledInstance(70, 70, Image.SCALE_DEFAULT));
        cocheUno = new JLabel();
        cocheUno.setIcon(iconCoche);
        cocheUno.setBounds(50, 50, 70, 70);

        Image imageCocheDos = new ImageIcon("imagenes/CocheDos.gif").getImage();
        ImageIcon iconCocheDos = new ImageIcon(imageCocheDos.getScaledInstance(70, 70, Image.SCALE_DEFAULT));
        cocheDos = new JLabel();
        cocheDos.setIcon(iconCocheDos);
        cocheDos.setBounds(50, 130, 70, 70);

        Image imageCocheTres = new ImageIcon("imagenes/CocheTres.gif").getImage();
        ImageIcon iconCocheTres = new ImageIcon(imageCocheTres.getScaledInstance(70, 70, Image.SCALE_DEFAULT));
        cocheTres = new JLabel();
        cocheTres.setIcon(iconCocheTres);
        cocheTres.setBounds(50, 210, 70, 70);

        Image imageCocheCuatro = new ImageIcon("imagenes/CocheCuatro.gif").getImage();
        ImageIcon iconCocheCuatro = new ImageIcon(imageCocheCuatro.getScaledInstance(70, 70, Image.SCALE_DEFAULT));
        cocheCuatro = new JLabel();
        cocheCuatro.setIcon(iconCocheCuatro);
        cocheCuatro.setBounds(50, 290, 70, 70);

        Image imageCocheCinco = new ImageIcon("imagenes/CocheCinco.gif").getImage();
        ImageIcon iconCocheCinco = new ImageIcon(imageCocheCinco.getScaledInstance(70, 70, Image.SCALE_DEFAULT));
        cocheCinco = new JLabel();
        cocheCinco.setIcon(iconCocheCinco);
        cocheCinco.setBounds(50, 380, 70, 70);

        cochePos = new JLabel();
        cochePos.setBounds(50, 50, 350, 50);

        cocheDosPos = new JLabel();
        cocheDosPos.setBounds(50, 100, 350, 50);

        cocheTresPos = new JLabel();
        cocheTresPos.setBounds(50, 150, 350, 50);

        cocheCuatroPos = new JLabel();
        cocheCuatroPos.setBounds(50, 200, 350, 50);

        cocheCincoPos = new JLabel();
        cocheCincoPos.setBounds(50, 250, 350, 50);

        botonIniciarCarrera = new JButton("🏁 🏁 Iniciar la carrera 🏁️ 🏁");
        botonIniciarCarrera.setBounds(250, 470, 200, 50);

        panel.add(botonIniciarCarrera);
        add(panel);


    }
    public void agregarCochesPanel(ArrayList<Coche> participantes) {

        botonIniciarCarrera.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                coches.add(new Run(participantes.get(0).getMatricula(), cocheUno, cochePos, participantes.get(0)));

                if (participantes.size() == 1) return;
                coches.add(new Run(participantes.get(1).getMatricula(), cocheDos, cocheDosPos, participantes.get(1)));

                if (participantes.size() == 2) return;
                coches.add(new Run(participantes.get(2).getMatricula(), cocheTres, cocheTresPos, participantes.get(2)));

                if (participantes.size() == 3) return;
                coches.add(new Run(participantes.get(3).getMatricula(), cocheCuatro, cocheCuatroPos, participantes.get(3)));

                if (participantes.size() == 4) return;
                coches.add(new Run(participantes.get(4).getMatricula(), cocheCinco, cocheCincoPos, participantes.get(4)));
            }
        });

        panel.add(cocheUno);
        panel.add(cochePos);
        if (participantes.size() == 1) return;
        panel.add(cocheDos);
        panel.add(cocheDosPos);
        if (participantes.size() == 2) return;
        panel.add(cocheTres);
        panel.add(cocheTresPos);
        if (participantes.size() == 3) return;
        panel.add(cocheCuatro);
        panel.add(cocheCuatroPos);
        if (participantes.size() == 4) return;
        panel.add(cocheCinco);
        panel.add(cocheCincoPos);

    }

}
