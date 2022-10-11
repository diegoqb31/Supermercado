package supermarket.entity;

/**
 *
 * @author Diego Quiros
 */
public class Usuario {
    
    private int id;
    private int rol;
    private String nombre;
    private String clave;
    private String correo;

    public Usuario() {
    }

    public Usuario(int id, int rol, String nombre, String clave, String correo) {
        this.id = id;
        this.rol = rol;
        this.nombre = nombre;
        this.clave = clave;
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", rol=" + rol + ", nombre=" + nombre + ", clave=" + clave + ", correo=" + correo + '}';
    }
    
    
}
