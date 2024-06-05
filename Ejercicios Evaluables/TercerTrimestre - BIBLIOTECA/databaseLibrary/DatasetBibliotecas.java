package databaseLibrary;

import controller.Biblioteca;
import modelLibrary.*;


import java.io.Serializable;
import java.util.ArrayList;

public class DatasetBibliotecas{
    ArrayList<Biblioteca> bibliotecasGeneralistas=new ArrayList<>();
    ArrayList<Biblioteca<LibroTerror>>bibliotecasTerror=new ArrayList<>();
    ArrayList<Biblioteca<LibroComedia>>bibliotecasComedias=new ArrayList<>();
    ArrayList<Biblioteca<LibroPoliciaca>>bibliotecasPoliciacas=new ArrayList<>();




    public int tipoBiblioteca(int codigo){
       if (bibliotecaGeneral(codigo)!=null) return 1;
       else if (bibliotecaTerror(codigo)!=null) return 2;
       else if (bibliotecaComedia(codigo)!=null) return 3;
       else if (bibliotecaPoliciaca(codigo)!=null) return 4;
       else return -1;
    }
    public Biblioteca bibliotecaGeneral(int codigo){
        for (Biblioteca item:bibliotecasGeneralistas) if (item.getCodigoUnico()==codigo)return item;
        return null;
    }
    public Biblioteca<LibroTerror> bibliotecaTerror(int codigo){
        for (Biblioteca item:bibliotecasTerror) if (item.getCodigoUnico()==codigo)return item;
        return null;
    }
    public Biblioteca<LibroComedia> bibliotecaComedia(int codigo){
        for (Biblioteca item:bibliotecasComedias) if (item.getCodigoUnico()==codigo)return item;
        return null;
    }
    public Biblioteca<LibroPoliciaca> bibliotecaPoliciaca(int codigo){
        for (Biblioteca item:bibliotecasPoliciacas) if (item.getCodigoUnico()==codigo)return item;
        return null;
    }

    public void listarBibliotecas(){
        System.out.println("Listado de bibliotecas \n\n");
        if (bibliotecasTerror.isEmpty() && bibliotecasPoliciacas.isEmpty() && getBibliotecasComedias().isEmpty() && bibliotecasGeneralistas.isEmpty()){
            System.out.println("No se ha creado ninguna biblioteca");
        }
        if(!bibliotecasGeneralistas.isEmpty()){
            System.out.println("Bibliotecas Generalistas");
            for (Biblioteca item:bibliotecasGeneralistas){
                System.out.println(item);
            }
            System.out.println();
        }
        if (!bibliotecasTerror.isEmpty()){
            System.out.println("Bibliotecas de Terror");
            for (Biblioteca item:bibliotecasTerror){
                System.out.println(item);
            }
            System.out.println();
        }
        if (!bibliotecasComedias.isEmpty()){
            System.out.println("Bibliotecas de Comedia");
            for (Biblioteca item:bibliotecasComedias){
                System.out.println(item);
            }
            System.out.println();
        }

      if(!bibliotecasPoliciacas.isEmpty()){
          System.out.println("Bibliotecas Policiacas");
          for (Biblioteca item:getBibliotecasPoliciacas()){
              System.out.println(item);
          }
          System.out.println();
      }

    }


    //Getter & Setter

    public ArrayList<Biblioteca> getBibliotecasGeneralistas() {
        return bibliotecasGeneralistas;
    }

    public void setBibliotecasGeneralistas(ArrayList<Biblioteca> bibliotecasGeneralistas) {
        this.bibliotecasGeneralistas = bibliotecasGeneralistas;
    }

    public ArrayList<Biblioteca<LibroTerror>> getBibliotecasTerror() {
        return bibliotecasTerror;
    }

    public void setBibliotecasTerror(ArrayList<Biblioteca<LibroTerror>> bibliotecasTerror) {
        this.bibliotecasTerror = bibliotecasTerror;
    }

    public ArrayList<Biblioteca<LibroComedia>> getBibliotecasComedias() {
        return bibliotecasComedias;
    }

    public void setBibliotecasComedias(ArrayList<Biblioteca<LibroComedia>> bibliotecasComedias) {
        this.bibliotecasComedias = bibliotecasComedias;
    }

    public ArrayList<Biblioteca<LibroPoliciaca>> getBibliotecasPoliciacas() {
        return bibliotecasPoliciacas;
    }

    public void setBibliotecasPoliciacas(ArrayList<Biblioteca<LibroPoliciaca>> bibliotecasPoliciacas) {
        this.bibliotecasPoliciacas = bibliotecasPoliciacas;
    }
}
