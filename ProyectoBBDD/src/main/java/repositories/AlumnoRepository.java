package repositories;

import database.DBConnection;
import database.SchemeDB;
import model.AlumnoDB;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class AlumnoRepository implements SchemeDB {

    private Connection connection;

    public void insertarAlumno(AlumnoDB alumno) {

        connection = DBConnection.getConnection();

        Statement statement = null;

        try {
            statement= connection.createStatement();
            String query=String.format("INSERT INTO %s (%s , %s, %s, %s) VALUES ('%s', '%s', '%s', %s);",
                    SchemeDB.TAB_ALUMNOS,
                    SchemeDB.COLUMN_NOMBRE, SchemeDB.COLUMN_APELLIDO, SchemeDB.COLUMN_CORREO, SchemeDB.COLUMN_TELEFONO,
                    alumno.getNombre(), alumno.getApellido(), alumno.getCorreo(), alumno.getTelefono());
            statement.execute(query);
            statement.close();
        } catch (SQLException e) {
            System.out.println("Fallo en la conexión");
        }finally {
            DBConnection.closeConnection();
            connection=null;
        }
        System.out.println("Alumno insertado correctamente");

    }

    public void actualizarAlumno(AlumnoDB alumno) {
        connection =DBConnection.getConnection();
        Statement statement=null;
        try{
            statement= connection.createStatement();
            String query=String.format("UPDATE %s SET %s=?, %s=?, %s=?, %s=? WHERE %s=?;",
                    SchemeDB.TAB_ALUMNOS,
                    SchemeDB.COLUMN_NOMBRE, SchemeDB.COLUMN_APELLIDO, SchemeDB.COLUMN_CORREO, SchemeDB.COLUMN_TELEFONO,
                    SchemeDB.COLUMN_ID);
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.setString(1, alumno.getNombre());
            preparedStatement.setString(2, alumno.getApellido());
            preparedStatement.setString(3, alumno.getCorreo());
            preparedStatement.setInt(4, alumno.getTelefono());
            preparedStatement.setInt(5, alumno.getId());
            preparedStatement.execute();
            preparedStatement.close();

        }catch (SQLException e) {
            System.out.println("Fallo en la conexión");
        }finally {
            DBConnection.closeConnection();
            connection=null;
        }
        System.out.println("Alumno actualizado correctamente");
    }

    public void eliminarAlumno(int id) {
        connection = DBConnection.getConnection();

        Statement statement = null;

        try {
            statement= connection.createStatement();
            String query=String.format("DELETE FROM %s WHERE %s = %s;", SchemeDB.TAB_ALUMNOS, SchemeDB.COLUMN_ID, id);
            statement.execute( query );
            statement.close();
        } catch (SQLException e) {
            System.out.println("Fallo en la conexión");
        }finally {
            DBConnection.closeConnection();
            connection=null;
        }
        System.out.println("Se ha borrado el alumno con id " + id);
    }
}
