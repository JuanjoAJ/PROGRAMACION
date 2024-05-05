package repositories;

import database.DBConnection;
import model.AlumnoDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class AlumnoRepository {

    private Connection connection;

    public void insertarAlumno(AlumnoDB alumno) {

        connection = DBConnection.getConnection();

        Statement statement = null;

        try {
            statement= connection.createStatement();
            statement.execute("INSERT INTO alumnos (nombre, apellido, correo, telefono) VALUES('"+alumno.getNombre()+"','"+alumno.getApellido()+"','"+alumno.getCorreo()+"',"+alumno.getTelefono()+");");
            statement.close();
        } catch (SQLException e) {
            System.out.println("Fallo en la conexión");
        }


        DBConnection.closeConnection();
        System.out.println("Alumno insertado correctamente");

    }

    public void actualizarAlumno(AlumnoDB alumno) {
        connection =DBConnection.getConnection();
        Statement statement=null;
        try{
            statement= connection.createStatement();
            String query="UPDATE alumnos SET nombre=?, apellido=?, correo=?, telefono=? WHERE alumnos.id=?;";
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
        }


        DBConnection.closeConnection();
        System.out.println("Alumno actualizado correctamente");
    }

    public void eliminarAlumno(int id) {
        connection = DBConnection.getConnection();

        Statement statement = null;

        try {
            statement= connection.createStatement();
            System.out.println("funciona1");
            statement.execute( "DELETE FROM alumnos WHERE alumnos.id="+id + ";" );
            System.out.println("funciona2");
            statement.close();
            System.out.println("funciona 3");
        } catch (SQLException e) {
            System.out.println("Fallo en la conexión");
        }

        DBConnection.closeConnection();
        System.out.println("Se ha borrado el alumno con id " + id);
    }
}
