package modelCasaAnidada;

import lombok.Getter;
import lombok.Setter;
import utilsCasaAnidada.ExcepcionTerreno;



@Getter
@Setter
public class Terreno {
    private Casa casa;
    private int m2, valoracion, metrosDisponibles ;
    private Orientacion orientacion;

    public Terreno() {
    }

    public Terreno(int m2, int valoracion) {
        this.m2 = m2;
        metrosDisponibles=m2;
        this.valoracion=valoracion;

    }

    private void revalorizarCasa(){
        if (casa!=null && casa.isPiscina()){
            valoracion*=1.5;
        }else if(casa!=null &&casa.getM2()>=100){
            valoracion*=1.30;
        } else if (casa!=null) {
            valoracion*=1.25;
        }
    }

    public void construirCasa(int metros, String orientacion)throws ExcepcionTerreno{
        if(metros<this.m2){
            casa=new Casa(metros);
            metrosDisponibles-=metros;
            revalorizarCasa();
        }else{
         throw new ExcepcionTerreno("No se puede construir una casa de más metros que el terreno");
        }

        if (orientacion.equalsIgnoreCase("norte")) this.orientacion=Orientacion.norte;
        else if (orientacion.equalsIgnoreCase("sur"))this.orientacion=Orientacion.sur;
        else if (orientacion.equalsIgnoreCase("este")) this.orientacion=Orientacion.este;
        else if (orientacion.equalsIgnoreCase("oeste")) this.orientacion=Orientacion.oeste;
        else throw new ExcepcionTerreno("La orientación debe basarse en los cuatro puntos cardenales");

    }

    public void construirHabitacion(int metros){
        try {
            casa.construirHabitacion(metros);
        }catch (ExcepcionTerreno e){
            System.err.println(e.getMessage());
        }
    }

    public void construirPiscina(){
        try{
            casa.construirPiscina();
        }catch(ExcepcionTerreno e){
            System.err.println(e.getMessage());
        }
    }

    public void construirAnexo(int metros){
        try{
            casa.construirAnexo(metros);
        }catch (ExcepcionTerreno e){
            e.getMessage();
        }catch (NullPointerException e){
            System.err.println("Debe introducir un dato");
        }catch (IllegalArgumentException e){
            System.err.println("Debe introducir un número");
        }
    }

    public void mostrarDatos(){
        System.out.println("El terreno tiene un total de " + m2);

        if (casa!=null){
            System.out.println("Con una casa de " + casa.m2 + " con " + casa.habitaciones + " habitaciones");
            System.out.println("La casa tiene una orientación " + orientacion);
            if (casa.piscina) System.out.println("Dispone de una piscina");
            if (casa.anexo) System.out.println("Además tiene un anexo");
        }
        System.out.println("El terreno está valorado en " + valoracion + " €");


    }




    @Getter
    @Setter
    class Casa{

       private int m2, metrosDisponibles, habitaciones;
       private boolean piscina, anexo;

        public Casa() {
            piscina=false;
            anexo=false;
        }

        public Casa(int m2) {
            habitaciones=1;
            this.m2 = m2;
            metrosDisponibles =m2;
            piscina=false;
        }

        public void construirHabitacion(int metros)throws ExcepcionTerreno{
            if(metros<m2){
                habitaciones++;
                metrosDisponibles -=metros;
            }else {
                throw new ExcepcionTerreno("No se pueden construir más habitaciones");
            }
        }

        public void construirPiscina()throws ExcepcionTerreno{
            if(!piscina){
                piscina=true;
                revalorizarCasa();
                System.out.println("Se ha construido la piscina");
            }else throw new ExcepcionTerreno("La piscina ya existe");
        }

        public void construirAnexo(int metros)throws ExcepcionTerreno{
            if(Terreno.this.metrosDisponibles>metros){
                anexo=true;
                Terreno.this.metrosDisponibles-=metros;
            }else{
                throw new ExcepcionTerreno("No hay metros suficientes para el terreno");
            }
        }

    }
    enum Orientacion{
        norte, sur, este, oeste;

    }
}
