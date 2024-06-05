package util;


import modelLibrary.Libro;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class TablaJFrame<T extends Libro> {
    private ArrayList<T> datos;
    private String[] nombreColumnas;
    private DefaultTableModel tablaDefecto;
    private JTable tablaDatos;
    private JFrame visible;
    private JScrollPane scroll; //Vendrá bien si tenemos muchos datos en la tabla


    public TablaJFrame(){}
    public TablaJFrame(ArrayList<T> datos){

        this.datos=datos;
        nombreColumnas=new String[]{"Titulo", "ISBN"};
        tablaDefecto=new DefaultTableModel();
        tablaDatos=new JTable(tablaDefecto);


        //Construimos la tabla
        tablaDefecto.setColumnIdentifiers(nombreColumnas);

        for(Libro item:datos){
            tablaDefecto.addRow(new Object[]{item.getTitulo(), item.getIsbn()});
        }


        //Mostramos la tabla con JFRAME
        visible=new JFrame();
        scroll=new JScrollPane(tablaDatos);
        visible.setBounds(600, 350, 400, 300);
        visible.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        visible.add(scroll);
        visible.setVisible(true);
    }



}
