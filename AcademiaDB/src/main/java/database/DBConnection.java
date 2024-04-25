package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    //Configuración para tener la conexión con la base de datos

   static Connection connection =null; //La conexión con la base de datos
    //PATRON SINGLETON Solo hay una conexion entrante. SOlo una instancia en el mismo momento
    //Siempre es el mismo patron: Crea la conexion ->  pide la conexión -> cierra la conexxon



    //abrir la conexión
    private static void createConnection(){

        try {
            //cargar el driver en memoria
            Class.forName("com.mysql.cj.jdbc.Driver");
            //uri -> jdbc:mysql://127.0.0.1 recomendable el puerto y la base de datos
            String uri="jdbc:mysql://127.0.0.1:3306/curso_ue";
            //abrir conexion desde una uri, con un usuario que tiene una pass
           connection= DriverManager.getConnection(uri, "root", "");

        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el driver");
        } catch (SQLException e) {
            System.out.println("Error en la ejecución sql");
        }




    }
    //pide conexión
    public static Connection getConnection(){
        if (connection == null){
            //crea la conexión
            createConnection();
        }
        return  connection;
    }

    //cierra conexión
    public static void closeConnection(){
        try {
            connection.close();
            connection=null;
        } catch (SQLException e) {
            System.out.println("Error de cerrado");
        }
    }


}
