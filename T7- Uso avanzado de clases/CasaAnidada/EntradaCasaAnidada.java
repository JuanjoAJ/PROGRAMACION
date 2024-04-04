import modelCasaAnidada.Terreno;
import utilsCasaAnidada.ExcepcionTerreno;

public class EntradaCasaAnidada {
    public static void main(String[] args) {

       try {
           Terreno terreno=new Terreno(500, 200000);
           terreno.construirCasa(200, "norte");
           terreno.mostrarDatos();
           System.out.println();
           System.out.println();
           terreno.construirHabitacion(30);
           terreno.construirHabitacion(20);
           terreno.construirHabitacion(10);
           terreno.construirPiscina();
           terreno.construirAnexo(100);
           terreno.construirHabitacion(500);
           terreno.mostrarDatos();


       }catch (ExcepcionTerreno e){
           System.err.println(e.getMessage());
       }catch (NullPointerException e){
           System.err.println(e.getMessage());
       }catch (Exception e){
           System.err.println("Error fatal en la construcción del terreno");
           e.printStackTrace();
       }



    }
}
