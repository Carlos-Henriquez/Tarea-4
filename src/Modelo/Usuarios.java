package Modelo;

public class Usuarios {
    
    private String Usuario;
    private String Nombre;
    private String Apellido;
    private String CorreoElectronico;
    private String Telefono;
    private String Contraseña;
    private String ConfirmarContraseña;

    public Usuarios() {
    }
   
    public Usuarios(String Usuario, String Nombre, String Apellido, String CorreoElectronico, String Telefono, String Contraseña, String ConfirmarContraseña) {
        this.Usuario = Usuario;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.CorreoElectronico = CorreoElectronico;
        this.Telefono = Telefono;
        this.Contraseña = Contraseña;
        this.ConfirmarContraseña = ConfirmarContraseña;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String CorreoElectronico) {
        this.CorreoElectronico = CorreoElectronico;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getConfirmarContraseña() {
        return ConfirmarContraseña;
    }

    public void setConfirmarContraseña(String ConfirmarContraseña) {
        this.ConfirmarContraseña = ConfirmarContraseña;
    }
    
}
