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

    public Usuario(String nombre, String apellidos, String fNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fNacimiento = fNacimiento;
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

    public void setfNacimiento(String fNacimiento) {
        this.fNacimiento = fNacimiento;
    }
    
}
