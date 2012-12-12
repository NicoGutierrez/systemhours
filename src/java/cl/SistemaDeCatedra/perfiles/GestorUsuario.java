package cl.SistemaDeCatedra.perfiles;

import cl.SistemaDeCatedra.persistencia.GestorPersistencia;
import java.util.ArrayList;

public class GestorUsuario {
    private ArrayList<Monitor> monitores;
    private ArrayList<Alumno> alumnos;
    private GestorPersistencia persistencia;
    
	public GestorUsuario() {
        monitores = new ArrayList<Monitor>();
        alumnos = new ArrayList<Alumno>();
        persistencia = new GestorPersistencia();
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
        /**
         * @param usuario
         * @return Alumno
         */
        public Alumno getAlumno(String usuario){
            for (Alumno alumno:alumnos)
                if (alumno.getUsuario().equalsIgnoreCase(usuario))
                    return alumno;
            
            Alumno alumno = persistencia.getAlumno(usuario);
            if (alumno!=null)
                return alumno;
            return null;
        }
        /**
         * @param usuario
         * @return Alumno
         */
        public Monitor getMonitor(String usuario){
            for (Monitor monitor:monitores)
                if (monitor.getUsuario().equalsIgnoreCase(usuario))
                    return monitor;
            
            return new Monitor("Juna", "123", "Juan", "MOnitor", "18/08/1998");
            
        }
    
}
