package cl.SistemaDeCatedra.perfiles;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sam
 */
public class Monitor extends Usuario{
    private String usuario;
    private String contrasenna;

    public Monitor(String usuario, String contrasenna, String nombre, String apellidos, String fNacimiento) {
        super(nombre, apellidos, fNacimiento);
        this.usuario = usuario;
        this.contrasenna = contrasenna;
    }
 

    public String getUsuario() {
        return usuario;
    }
    
}
