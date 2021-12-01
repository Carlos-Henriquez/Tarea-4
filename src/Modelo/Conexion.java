package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Conexion con la base de datos
public class Conexion
{
    Connection con;
    
    public Connection getConnection()
    {
        try{
            String BaseDatos = "jdbc:mysql://localhost:3306/datosusuarios";
            con = DriverManager.getConnection(BaseDatos, "root", "");
            return con;
           }
        catch (SQLException e)
        {
            System.out.println(e.toString());
        }
    return null;
    }
}
