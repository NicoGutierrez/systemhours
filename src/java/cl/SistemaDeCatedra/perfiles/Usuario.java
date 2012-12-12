package cl.SistemaDeCatedra.perfiles;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sam
 */
public class Usuario {
    private String nombre;
    private String apellidos;
    private String fNacimiento;
    private String usuario;
    private String password;

    public Usuario(String nombre, String apellidos, String fNacimiento, String usuario, String password) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fNacimiento = fNacimiento;
        this.usuario = usuario;
        this.password = password;
    }


    /*
     * @params  usuario: string que representa el usuario, no importa si esta en minusculas o mayusculas
     *          password: String que representa la contrasenna este distingue entre mayusculas y minusculas
     * 
     * @return true si la combinacion es correcta, false si es incorrecta
     */
    public boolean compareUser(String usuario, String password) {
        return (this.usuario.compareToIgnoreCase(usuario) ==0 && this.password.compareTo(password)==0);
    }

    public String getUsuario() {
        return usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getfNacimiento() {
        return fNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setfNacimiento(String fNacimiento) {
        this.fNacimiento = fNacimiento;
    }
    
}
