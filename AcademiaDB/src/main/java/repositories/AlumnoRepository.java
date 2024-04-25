package repositories;

import database.DBConnection;
import model.Alumno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class AlumnoRepository {
    //Tendrá todas las acciones CRUD que necesito del modelo Alumno
    private Connection connection;
    public void insertarAlumno(Alumno alumno){
        //abrir conexión
        connection = DBConnection.getConnection();
        //trabajar conexión
        //INSERT INTO alumnos(nombre, apellidos, correo, telefono) VALUES ('Borja', 'Martin', 'correo', 1234)

        Statement statement= null;

        try {
            statement= connection.createStatement();
            // se puede hacer String query="INSERT INTO alumnos(nombre, apellidos, correo, telefono) VALUES ('Borja', 'Martin', 'correo', 1234)";
            //statement.execute("INSERT INTO alumnos(nombre, apellido, correo, telefono) VALUES ('Borja', 'Martin', 'correo', 1234)");
            //statement.close();//importante cerrar tambien
            String query="INSERT INTO alumnos(nombre, apellido, correo, telefono) VALUES (?,?,?,?)";
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.setString(1, alumno.getNombre());
            preparedStatement.setString(2, alumno.getApellido());
            preparedStatement.setString(3, alumno.getCorreo());
            preparedStatement.setInt(4, alumno.getTelefono());
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println("Fallo en la sentencia SQL");
            System.out.println(e.getMessage());
        }


        //cerrar conexión
        DBConnection.closeConnection();
    }




}
