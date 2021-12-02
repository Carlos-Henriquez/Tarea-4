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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class UsuariosDAO {

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

    //La siguiente funcion es para buscar en cada fila de la base de datos
    //el conjunto de usuario y contraseña para poder acceder en el login.
    public Usuarios log(String Usuario, String Contraseña) {
        Usuarios user = new Usuarios();
        String sql = "SELECT * FROM listadousuarios WHERE Usuario = ? AND Contraseña = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, Usuario);
            ps.setString(2, Contraseña);
            rs = ps.executeQuery();
            if (rs.next()) {
                user.setUsuario(rs.getString("Usuario"));
                user.setNombre(rs.getString("Nombre"));
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

    //La siguiente función es para que a la hora de registrarse, los datos 
    //ingresados en los diversos campos se guarden y sean insertados dentro de la
    //base de datos.
    public boolean Registrarse(Usuarios reg) {
        String sql = "INSERT INTO listadousuarios (Usuario, Nombre, Apellido, CorreoElectronico, Telefono, Contraseña, ConfirmarContraseña) VALUES (?,?,?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, reg.getUsuario());
            ps.setString(2, reg.getNombre());
            ps.setString(3, reg.getApellido());
            ps.setString(4, reg.getCorreoElectronico());
            ps.setString(5, reg.getTelefono());
            ps.setString(6, reg.getContraseña());
            ps.setString(7, reg.getConfirmarContraseña());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }

        }
    }

    //Solamente en esto se utilizara Alfa.
    //Esta funcion es para tomar la info dentro de la base de datos, comvertirlo
    //en una lista para posteriormente plazmarlos en el listado de usurios.
    public List<Usuarios> Listado() {
        List<Usuarios> Lista = new ArrayList();
        String sql = "SELECT * FROM listadousuarios";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Usuarios Alfa = new Usuarios();
                Alfa.setUsuario(rs.getString("Usuario"));
                Alfa.setNombre(rs.getString("Nombre"));
                Alfa.setApellido(rs.getString("Apellido"));
                Alfa.setCorreoElectronico(rs.getString("CorreoElectronico"));
                Alfa.setTelefono(rs.getString("Telefono"));

                Lista.add(Alfa);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return Lista;
    }

    //Esta funcion toma el usuario seleccionado y luego lo elimina de la base de
    //datos.
    //Los '?' son para traer los valores de las variables de las cuales son llamados.
    public boolean EliminarUsuario(String usuario) {

        String sql = "DELETE FROM listadousuarios WHERE Usuario = ? ";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }

    //La siguiente funcion sirve para hacer la actualizacion de los los datos de
    //usuario que sea seleccionado.
    public boolean Actualizar(Usuarios reg) {
        String sql = "UPDATE listadousuarios "
                + "SET Nombre= ? ,  Apellido= ? , CorreoElectronico= ? ,"
                + " Telefono= ? , Contraseña = ? , ConfirmarContraseña = ? "
                + "WHERE Usuario = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, reg.getNombre());
            ps.setString(2, reg.getApellido());
            ps.setString(3, reg.getCorreoElectronico());
            ps.setString(4, reg.getTelefono());
            ps.setString(5, reg.getContraseña());
            ps.setString(6, reg.getConfirmarContraseña());
            ps.setString(7, reg.getUsuario());

            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }

        }
    }

    //Esta funcion identifica los datos del usuario en base a el mismo usuario.
    public Usuarios BuscarPorIdentificador(String Usuario) {
        Usuarios user = new Usuarios();
        String sql = "SELECT * FROM listadousuarios WHERE Usuario = ? ";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, Usuario);
            rs = ps.executeQuery();
            if (rs.next()) {
                user.setUsuario(rs.getString("Usuario"));
                user.setNombre(rs.getString("Nombre"));
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
