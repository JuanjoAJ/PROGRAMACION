package repositories;

import database.DBConnection;
import database.SchemeDB;
import model.AlumnoDB;
import model.ProfesorDB;

import java.sql.*;

public class ProfesorRepository implements SchemeDB{
    private Connection connection;

    public void insertarProfesor(ProfesorDB profesor){
        connection= DBConnection.getConnection();
        Statement statement=null;
        try {
            statement= connection.createStatement();
           String query=String.format("INSERT INTO %s (%s, %s, %s) VALUES ('%s', '%s', %s);",
                    SchemeDB.TAB_PROFESOR,
                    SchemeDB.COLUMN_NOMBRE, SchemeDB.COLUMN_CORREO, SchemeDB.COLUMN_SUELDO,
                    profesor.getNombre(), profesor.getCorreo(), profesor.getSueldo()
                    );
            statement.execute(query);
            statement.close();
        } catch (SQLException e) {
            System.out.println("Fallo en la conexión");
            System.out.println(e.getMessage());
        }finally {
            DBConnection.closeConnection();
            connection=null;
        }
        System.out.println("Profesor insertado correctamente");
    }

    public void actualizarProfesor(int id, ProfesorDB profesor){
        connection=DBConnection.getConnection();

        try {
            String query=String.format("UPDATE %s SET %s=?, %s=?, %s=? WHERE %s=?;",
                    SchemeDB.TAB_PROFESOR,
                    SchemeDB.COLUMN_NOMBRE,
                    SchemeDB.COLUMN_CORREO,
                    SchemeDB.COLUMN_SUELDO,
                    SchemeDB.COLUMN_ID);
            PreparedStatement preparedStatement= connection.prepareStatement(query);
            preparedStatement.setString(1, profesor.getNombre());
            preparedStatement.setString(2, profesor.getCorreo());
            preparedStatement.setDouble(3, profesor.getSueldo());
            preparedStatement.setInt(4,id);
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println("Fallo en la conexión con la bbdd");
        }finally {
            DBConnection.closeConnection();
            connection=null;
        }

        System.out.println("Profesor editado correctamente");
    }

    public void borrarProfesor(int id){
        connection=DBConnection.getConnection();
        Statement statement=null;
        try{
            String query=String.format("DELETE %s WHERE %s = %s ;",
                    SchemeDB.TAB_PROFESOR,
                    SchemeDB.COLUMN_ID, id);
            statement.execute(query);

            statement.close();
        } catch (SQLException e) {
            System.out.println("Fallo en la conexión con la base de datos");
        }finally {
            DBConnection.closeConnection();
            connection=null;
        }
        System.out.println("Profesor con id"+id+" eliminado correctamente" );

    }

    public void obtenerProfesor(){
        connection=DBConnection.getConnection();
        Statement statement=null;

        try {
            statement= connection.createStatement();
            ResultSet result= statement.executeQuery(String.format("Select * FROM %s",
                    SchemeDB.TAB_PROFESOR));
            while(result.next()){
                ProfesorDB profesorDB=new ProfesorDB(result.getInt(SchemeDB.COLUMN_ID),
                        result.getString(SchemeDB.COLUMN_NOMBRE),
                        result.getString(SchemeDB.COLUMN_CORREO),
                        result.getDouble(SchemeDB.COLUMN_SUELDO)
                        );
                System.out.println(profesorDB);
            }
        } catch (SQLException e) {
            System.out.println("Error en sql");
        }finally {
            DBConnection.closeConnection();
            connection=null;
        }
    }

    public ProfesorDB estaProfesor(String nombre, String correo){
       ProfesorDB profesorDB=null;
        String query=String.format("SELECT * FROM %s WHERE %s='%s' AND %s='%s'",
                SchemeDB.TAB_PROFESOR,
                SchemeDB.COLUMN_NOMBRE, nombre,
                SchemeDB.COLUMN_CORREO, correo);
        connection= DBConnection.getConnection();
        try {
            PreparedStatement preparedStatement= connection.prepareStatement(query);
            ResultSet resultSet= preparedStatement.executeQuery();
            while(resultSet.next()) {
                profesorDB = new ProfesorDB(resultSet.getInt(SchemeDB.COLUMN_ID),
                        resultSet.getString(SchemeDB.COLUMN_NOMBRE),
                        resultSet.getString(SchemeDB.COLUMN_CORREO),
                        resultSet.getDouble(SchemeDB.COLUMN_SUELDO)
                );
            }
        } catch (SQLException e) {
            System.out.println("Error en sql");
        }finally {
            DBConnection.closeConnection();
            connection=null;
        }
        return profesorDB;
    }

}
