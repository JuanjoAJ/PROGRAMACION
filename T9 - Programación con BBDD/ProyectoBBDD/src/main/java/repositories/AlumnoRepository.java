package repositories;

import database.DBConnection;
import database.SchemeDB;
import model.AlumnoDB;
import model.ProfesorDB;


import java.sql.*;

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

    public void obtenerAlumno(){

        connection=DBConnection.getConnection();
        Statement statement=null;
        try {
            statement= connection.createStatement();
            ResultSet result= statement.executeQuery(String.format("Select * FROM %s",
                    SchemeDB.TAB_ALUMNOS));
            while(result.next()){
                AlumnoDB alumnoDB=new AlumnoDB(
                        result.getInt(SchemeDB.COLUMN_ID),
                        result.getString(SchemeDB.COLUMN_NOMBRE),
                        result.getString(SchemeDB.COLUMN_APELLIDO),
                        result.getString(SchemeDB.COLUMN_CORREO),
                        result.getInt(SchemeDB.COLUMN_TELEFONO)
                );
                System.out.println(alumnoDB);
            }
        } catch (SQLException e) {
            System.out.println("Error en sql");
        }finally {
            DBConnection.closeConnection();
            connection=null;
        }
    }

    public AlumnoDB estaAlumno(String nombre, String correo){
        AlumnoDB alumnoDB=null;
        connection=DBConnection.getConnection();
        String query=String.format("SELECT * FROM %s WHERE %s='%s' AND %s='%s'",
                SchemeDB.TAB_ALUMNOS,
                SchemeDB.COLUMN_NOMBRE,nombre,
                SchemeDB.COLUMN_CORREO, correo);
        PreparedStatement preparedStatement=null;
        try {
            preparedStatement= connection.prepareStatement(query);
            ResultSet resultSet= preparedStatement.executeQuery(query);
            while (resultSet.next()){
                alumnoDB=new AlumnoDB(
                        resultSet.getInt(SchemeDB.COLUMN_ID),
                        resultSet.getString(SchemeDB.COLUMN_NOMBRE),
                        resultSet.getString(SchemeDB.COLUMN_APELLIDO),
                        resultSet.getString(SchemeDB.COLUMN_CORREO),
                        resultSet.getInt(SchemeDB.COLUMN_TELEFONO)
                );
            }
        } catch (SQLException e) {
            System.out.println("Error en sql");
        }finally {
            DBConnection.closeConnection();
            connection=null;
        }
        return alumnoDB;

    }

}
