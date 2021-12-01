package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class UsuariosDAO {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();

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

    //Solamente en esto se utilizara Alfa
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
