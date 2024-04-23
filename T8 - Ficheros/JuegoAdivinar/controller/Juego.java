package controller;

import model.Jugador;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import static java.util.Collections.*;

public class Juego{
    private HashMap<String, Jugador> jugadores;

    public Juego() {
        jugadores=new HashMap<>();
    }
    public void aniadirJugador(String nombre){
        jugadores.put(nombre, new Jugador(nombre));
    }



    public void imprimirFichero(){
        File file=new File("T8 - Ficheros/JuegoAdivinar/resources/juego.txt");
        PrintWriter printWriter=null;
        if (!file.exists()){
            try{
                file.createNewFile();
            }catch (IOException e){
                System.out.println("Error en la creación");
            }
        }
        try{
        printWriter=new PrintWriter(new FileWriter(file, true));
            for (String item:jugadores.keySet()) {
                printWriter.append(jugadores.get(item).toString());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
          try{
              assert printWriter != null;
              printWriter.close();
          }catch (NullPointerException e){
              System.err.println("Error en el cierre del print");
          }
        }
    }

    public void lecturaFichero(){
        File file=new File("T8 - Ficheros/JuegoAdivinar/resources/juego.txt");
        BufferedReader bufferedReader=null;
        try{
            if (!file.exists()){
                throw new RuntimeException("Imposible leer el fichero, ya que no existe");
            }
            bufferedReader=new BufferedReader(new FileReader(file));
            ArrayList<Jugador> jugadoresRegistrados=new ArrayList<>();
            String linea="";
            while ((linea=bufferedReader.readLine())!=null){
                linea=linea.replaceAll("\\(","").replaceAll("\\)","");
                jugadoresRegistrados.add(new Jugador(linea.split(",")[0], Integer.parseInt(linea.split(",")[1])) );

            }
            Collections.sort(jugadoresRegistrados);
            System.out.printf("El record lo tiene %s con %d intentos \n",jugadoresRegistrados.get(0).getNombre(), jugadoresRegistrados.get(0).getRecordIntentos() );
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("Fallo en el trabajo con el fichero");
        } finally {
            try {
                assert bufferedReader != null;
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("Fallo en el cierre");
            }
        }



    }


    public HashMap<String, Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(HashMap<String, Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}
