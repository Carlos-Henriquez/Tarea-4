/**
 *
 * @author Carlos Henriquez, matricula: 2020-10203
 *
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Esto es para establecer la conexion con la base de datos.
public class Conexion {

    Connection con;

    public Connection getConnection() {
        try {
            //Esta es la parte fundamental para establecer el codigo con la base
            //de datos.
            String BaseDatos = "jdbc:mysql://localhost:3306/datosusuarios";
            con = DriverManager.getConnection(BaseDatos, "root", "");
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;
    }
}
