package cl.SistemaDeCatedra.perfiles;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sam
 */
public class Alumno extends Usuario{
    private String usuario;
    private String contrasenna;

    public Alumno(String nombre, String apellidos, String fNacimiento) {
        super(nombre, apellidos, fNacimiento);
    }

    public Alumno(String usuario, String contrasenna, String nombre, String apellidos, String fNacimiento) {
        super(nombre, apellidos, fNacimiento);
        this.usuario = usuario;
        this.contrasenna = contrasenna;
    }


    public String getUsuario() {
        return usuario;
    }
   
    
    
    /*
     * @params  usuario: string que representa el usuario, no importa si esta en minusculas o mayusculas
     *          password: String que representa la contrasenna este distingue entre mayusculas y minusculas
     * 
     * @return true si la combinacion es correcta, false si es incorrecta
     */
    public boolean compareAlumno(String usuario, String password) {
        return (this.usuario.compareToIgnoreCase(usuario) ==0 && this.contrasenna.compareTo(password)==0);
    }
    
}
