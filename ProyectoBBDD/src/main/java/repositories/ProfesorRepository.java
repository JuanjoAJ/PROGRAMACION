package repositories;

import database.DBConnection;
import model.ProfesorDB;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ProfesorRepository {
    private Connection connection;

    public void insertarProfesor(ProfesorDB profesor){
        connection= DBConnection.getConnection();
        Statement statement=null;
        try {
            statement= connection.createStatement();
            statement.execute("INSERT INTO profesor (nombre, correo, sueldo) VALUES('"+profesor.getNombre()+"','"+profesor.getCorreo()+"',"+profesor.getSueldo()+")");
            statement.close();
        } catch (SQLException e) {
            System.out.println("Fallo en la conexión");
        }
        DBConnection.closeConnection();
        System.out.println("Profesor insertado correctamente");
    }

    public void actualizarProfesor(ProfesorDB profesor){

    }

    public void borrarProfesor(int id){


    }

}
