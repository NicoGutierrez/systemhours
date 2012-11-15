package cl.SistemaDeCatedra.perfiles;

import java.util.ArrayList;

public class GestorUsuario {
    private ArrayList<Monitor> monitores;
    private ArrayList<Alumno> alumnos;
    
	public GestorUsuario() {
        monitores = new ArrayList<Monitor>();
        alumnos = new ArrayList<Alumno>();
	}
    /**
     * 
     * @param monitores Lisra de Monitores 
     * @param alumnos Lista de alumnos
     */
    public GestorUsuario(ArrayList<Monitor> monitores, ArrayList<Alumno> alumnos) {
        this.monitores = monitores;
        this.alumnos = alumnos;
    }
    /**
     * 
     * @param alumno Objeto del tipo alumno
     * @return  Retorna verdadero si crea en usuario, en caso de no poder agregarlo, retorna Falso
     */
	public boolean AgregarAlumno (Alumno alumno) {	
        alumnos.add(alumno);
        return true;
	}
    /**
     * 
     * @param monitor Objeto del tipo Monitor
     * @return Retorna verdadero si crea en usuario, en caso de no poder agregarlo, retorna Falso
     */
	public boolean AgregarCliente (Monitor monitor) {	
        monitores.add(monitor);
        return true;
	}
    
}
