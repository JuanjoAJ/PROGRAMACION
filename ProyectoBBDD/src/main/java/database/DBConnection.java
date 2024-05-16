package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    static Connection connection=null;


    private static void createConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String uri="jdbc:mysql://127.0.0.1:3306/curso_ue";
            connection= DriverManager.getConnection(uri, "root", "");

        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el driver");
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error en la ejecución tipo SQL");
        }


    }
    public static Connection getConnection(){

        if(connection==null){
            createConnection();
        }

        return connection;
    }

    public static void closeConnection(){
        try {
            connection.close();
            connection=null;
        } catch (SQLException e) {
            System.out.println("Error en el cerrado de DB");
        }
    }

}
