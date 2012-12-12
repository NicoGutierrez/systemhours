
package cl.SistemaDeCatedra.persistencia;

import cl.SistemaDeCatedra.perfiles.Alumno;
import cl.SistemaDeCatedra.perfiles.Monitor;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestorPersistencia {
    private String dbUrl = "jdbc:mysql://localhost:3306/systemHours";
    private String dbClass = "com.mysql.jdbc.Driver";
    private Connection con;
    private boolean  conecctionOk;
    
    public GestorPersistencia() {
        
        con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection (dbUrl,"root","");
            conecctionOk  = true;
            System.out.println("asdadasd");
        } catch (SQLException ex) {
            Logger.getLogger(GestorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            conecctionOk = false;
            System.out.println("Error, no se ha podido conectar a la base de datos, use sus datos por defecto");
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(GestorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            conecctionOk = false;
            System.out.println("Error, no se ha podido conectar a la base de datos, use sus datos por defecto");
        }
    }
    
    public Alumno getAlumno(String usuario){
        try {
            if (!conecctionOk){
                    System.out.println("Error al intentar acceder se usa el usuario jperez con contrasenna 123");
                   return new Alumno("jperez", "123", "juan perez", "123", "12/08/1584");
            }
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM  Alumnos WHERE  `usuario` = '"+usuario+"'"); 
  
            if (!rs.next())
                return null;
            String nombre = rs.getString("nombres");
            String apellidos = rs.getString("apellidos");
            String fnacimiento = rs.getString("fechaNacimiento");
            String password = rs.getString("contrasenna");
            return new Alumno(nombre, apellidos, fnacimiento, usuario, password);
            
        } catch (SQLException ex) {
            Logger.getLogger(GestorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return null;
    }
    
    public Monitor getMonitor(String usuario){
        try {
            if (!conecctionOk){
                    System.out.println("Error al intentar acceder se usa el usuario jperez con contrasenna 123");
                   return new Monitor("jperez", "123", "juan monitor", "123", "12/08/1864");
            }
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM  Alumnos WHERE  `usuario` = '"+usuario+"'"); 
  
            if (!rs.next())
                return null;
            String nombre = rs.getString("nombres");
            String apellidos = rs.getString("apellidos");
            String fnacimiento = rs.getString("fechaNacimiento");
            String password = rs.getString("contrasenna");
            return new Monitor(nombre, apellidos, fnacimiento, usuario, password);
            
        } catch (SQLException ex) {
            Logger.getLogger(GestorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return null;
    }
    /*public boolean addAlumno(){
    
    }
    public boolean addCliente(Cliente cliente){
        if (getCliente(cliente.getRut())==null){
            try {
                Statement st = con.createStatement();
                if (!existeUsuario(cliente.getRut()+""))
                   st.executeUpdate("INSERT INTO `clinicaveterinaria`.`usuarios` (`rut`, `Nombre`, `Apellidos`, `direccion`, `tMovil`, `tFijo`, `email`) "
                           + "VALUES ('"+cliente.getRut()+"', '"+cliente.getNombre()+"', '"+cliente.getApellidos()+"', '"+cliente.getDireccion()+"', '"+
                           cliente.getTelefonoMovil()+"', '"+cliente.getTelefonoFijo()+"', '"+cliente.getCorreoElectronico()+"');");
                
                st.executeUpdate("INSERT INTO  `clinicaveterinaria`.`clientes` (`idCliente` ,`tipoPago` ,`estadoCuenta`) "
                        + "VALUES ('"+cliente.getRut()+"', '"+cliente.getTipoPago()+"', '"+((cliente.getEstadoCuenta())?1:0)+"');");
                st.close();
                return true;
            } catch (SQLException ex) {
                Logger.getLogger(GestorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        return false;
    }
    private boolean existeUsuario(String rut){
        try {
            Statement st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM   usuarios WHERE  `rut` ='"+rut+"'"); 
            return rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(GestorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return false;
    }
   
    public Encargado getEncargado(int rut){
        System.out.println("entro con rut "+rut);
        try {
            System.out.println("entro con rut "+rut);
            Statement st =  con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM  `usuarios`, encargados WHERE rut = idUsuario and `rut` = '"+rut+"'"); 
            if (!rs.next())
                return null;
            
            return new Encargado(rut,
                                    rs.getString("Nombre"), rs.getString("Apellidos"),
                                    rs.getString("direccion"), 
                                    rs.getString("tMovil"), rs.getString("tFijo"),
                                    rs.getString("email"),rs.getString("cargo"));
        } catch (SQLException ex) {
            Logger.getLogger(GestorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return null;
    }
    public boolean addEncargado(Encargado encargado){
        if (getEncargado(encargado.getRut())==null){
            try {
                Statement st = (Statement) con.createStatement();
                if (!existeUsuario(encargado.getRut()+""))
                   st.executeUpdate("INSERT INTO `clinicaveterinaria`.`usuarios` (`rut`, `Nombre`, `Apellidos`, `direccion`, `tMovil`, `tFijo`, `email`) "
                           + "VALUES ('"+encargado.getRut()+"', '"+encargado.getNombre()+"', '"+encargado.getApellidos()+"', '"+encargado.getDireccion()+"', '"+
                           encargado.getTelefonoMovil()+"', '"+encargado.getTelefonoFijo()+"', '"+encargado.getCorreoElectronico()+"');");
                
                st.executeUpdate("INSERT INTO  `clinicaveterinaria`.`encargados` (`idUsuario` ,`cargo`)"
                        + "VALUES ('"+encargado.getRut()+"', '"+encargado.getCargo()+"');");
                st.close();
                return true;
            } catch (SQLException ex) {
                Logger.getLogger(GestorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        return false;   
    }
    public void updateCliente(Cliente cliente){
        System.out.println("pasooooo");
        try {
            Statement st = con.createStatement();
            st.executeUpdate("DELETE FROM clientes where idCliente = '"+cliente.getRut()+"'");
            st.executeUpdate("DELETE FROM usuarios where rut = '"+cliente.getRut()+"'");
            addCliente(cliente);
            /*
            PreparedStatement modi = con.prepareStatement("UPDATE  `clinicaveterinaria`.`usuarios` SET  "
                    + "`direccion` =  '?',"
                    + "`tMovil` =  '?',"
                    + "`tFijo` =  '?',"
                    + "`email` =  '?'"
                    + " WHERE  `usuarios`.`rut` ='?';");
            modi.setString(1, cliente.getDireccion());
            modi.setString(2, cliente.getTelefonoMovil());
            modi.setString(3, cliente.getTelefonoFijo());
            modi.setString(4, cliente.getCorreoElectronico());
            modi.setInt(5, cliente.getRut());
            modi.executeUpdate();
            /*
            st.executeUpdate("UPDATE  `clinicaveterinaria`.`usuarios` SET  "
                    + "`direccion` =  '"+c.getDireccion()+"',"
                    + "`tMovil` =  '"+c.getTelefonoMovil()+"',"
                    + "`tFijo` =  '"+c.getTelefonoMovil()+"',"
                    + "`email` =  '"+c.getCorreoElectronico()+"'"
                    + " WHERE  `usuarios`.`rut` ='"+c.getRut()+"';");
                    * 
                    *//*
            st.executeUpdate("UPDATE  `clinicaveterinaria`.`clientes` SET  "
                    + "`tipoPago` =  '"+c.getTipoPago()+"',"
                    + "`estadoCuenta` =  '"+c.getApellidos()+"' "
                    + "WHERE  `clientes`.`idCliente` ='"+c.getRut()+"';");
            st.close();
            * 
            
            PreparedStatement modi2 = con.prepareStatement("UPDATE  `clinicaveterinaria`.`clientes` SET  "
                    + "`tipoPago` =  '?',"
                    + "`estadoCuenta` =  '?' "
                    + "WHERE  `clientes`.`idCliente` ='?';");
            modi2.setString(1, cliente.getTelefonoFijo());
            modi2.setInt(2, ((cliente.getEstadoCuenta())?1:0));
            modi2.executeUpdate();
            * */
           /*
            
        } catch (SQLException ex) {
            Logger.getLogger(GestorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void updateEncargado(Encargado encargado){
        try {
            Statement st = con.createStatement();
            int salida = st.executeUpdate("DELETE FROM encargados where idUsuario = '"+encargado.getRut()+"'");
            int salida2 = st.executeUpdate("DELETE FROM usuarios where rut = '"+encargado.getRut()+"'");
            addEncargado(encargado);
            System.err.println("eliminada 1   "+salida);
            System.err.println("eliminada 2   "+salida2);
            
            /*
            Statement st = (Statement) con.createStatement();
            PreparedStatement modi = con.prepareStatement("UPDATE  `clinicaveterinaria`.`usuarios` SET  "
                    + "`direccion` =  '?',"
                    + "`tMovil` =  '?',"
                    + "`tFijo` =  '?',"
                    + "`email` =  '?'"
                    + " WHERE  `usuarios`.`rut` ='?';");
            modi.setString(1, encargado.getDireccion());
            modi.setString(2, encargado.getTelefonoMovil());
            modi.setString(3, encargado.getTelefonoFijo());
            modi.setString(4, encargado.getCorreoElectronico());
            modi.setInt(5, encargado.getRut());
            modi.executeUpdate();
            /*
             * 
            st.executeUpdate("UPDATE  `clinicaveterinaria`.`usuarios` SET  "
                    + "`direccion` =  '"+e.getDireccion()+"',"
                    + "`tMovil` =  '"+e.getTelefonoMovil()+"',"
                    + "`tFijo` =  '"+e.getTelefonoMovil()+"',"
                    + "`email` =  '"+e.getCorreoElectronico()+"'"
                    + " WHERE  `usuarios`.`rut` ="+e.getRut()+";");
            st.executeUpdate("UPDATE  `clinicaveterinaria`.`encargados` SET  "
                    + "`cargo` =  '"+e.getCargo()+"' WHERE  `encargados`.`idUsuario` ="+e.getRut()+";");
            st.close();
            * 
            *//*
            PreparedStatement modi2 = con.prepareStatement("UPDATE  `clinicaveterinaria`.`encargados` SET  "
                    + "`cargo` =  '?' "
                    + "WHERE  `encargados`.`idUsuario` = '?';");
            modi2.setString(1, encargado.getCargo());
            modi2.setInt(2, encargado.getRut());
            modi2.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(GestorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
*/
}
