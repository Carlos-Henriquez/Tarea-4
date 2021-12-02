/**
 *
 * @author Carlos Henriquez, matricula: 2020-10203
 *  
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {

    //Conexion.
    //'Connection' resumido es 'con'.
    Connection con;
    //Declaración preparada.
    //'PreparedStatement' resumido es 'ps'.
    PreparedStatement ps;
    //Conjunto resultante.
    //'ResultSet' resumido es 'rs'.
    ResultSet rs;
    Conexion cn = new Conexion();

    public Usuarios log(String Usuario, String Contraseña) {
        Usuarios user = new Usuarios();
        //El siguiente codigo es para buscar en cada fila de la base de datos
        //el conjunto de usuario y contraseña para poder acceder en el login.
        String sql = "SELECT * FROM listadousuarios WHERE Usuario = ? AND Contraseña = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, Usuario);
            ps.setString(2, Contraseña);
            rs = ps.executeQuery();
            if (rs.next()) {
                user.setUsuario(rs.getString("Usuario"));
                user.setApellido(rs.getString("Apellido"));
                user.setCorreoElectronico(rs.getString("CorreoElectronico"));
                user.setTelefono(rs.getString("Telefono"));
                user.setContraseña(rs.getString("Contraseña"));
                user.setConfirmarContraseña(rs.getString("ConfirmarContraseña"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return user;
    }

}
