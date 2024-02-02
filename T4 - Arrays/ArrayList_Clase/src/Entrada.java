import model.Garaje;
import modelAgenda.Agenda;

public class Entrada {
   public static void main(String[] args){
      /*Prueba de la clase Garaje
       Garaje garaje=new Garaje();
       for (int i = 0; i < 5; i++) {
           garaje.ingresarCoche();
       }
       garaje.listarCoches();
       garaje.mostrarCostes();
       garaje.eliminaCoche();
       garaje.listarCoches();
       garaje.buscarCoche();
       garaje.vaciarGaraje();
       garaje.listarCoches();
       */
   Agenda agenda=new Agenda();
      for (int i = 0; i < 3; i++) {
         agenda.agregarUsuario();
      }

      agenda.buscarUser();

      agenda.borrarUser();

      agenda.listarUsuario();


   }

}
