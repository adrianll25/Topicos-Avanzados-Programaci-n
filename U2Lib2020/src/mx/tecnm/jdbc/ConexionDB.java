
package mx.tecnm.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adria
 */
public class ConexionDB {
    public static final String JAVADB    = "Java DB";
    public static final String SQLSERVER = "SQL server";
    public static final String MYSQL     = "MySQL";
    public static final String ORACLEXE  = "Oracle xe";
    public static final String ACCESS    = "MS Access";
             
    
    
    
    private static ConexionDB instancia = null;
    private Connection conexion;
    
    private static String driverJDBC  = "org.apache.derby.jdbc.ClientDriver";
    private static String urlConexion = "jdbc:derby://localhost:1527/";
    private static String servidor    = "";
    private static String puerto      = "";
    private static String baseDeDatos = "TAPdb2";
    private static String usuario     = "Topicos";
    private static String contraseña  = "2020";
    
    private ConexionDB (){
        try {
            //Realizar la conexion BD
            Class.forName ( driverJDBC );
             conexion = DriverManager.getConnection(
                   urlConexion + baseDeDatos, usuario, contraseña);
             
        } catch ( Exception ex ) {
            System.out.println( ex );
        }
       
        
    }
    
    public static ConexionDB getInstancia (){
        if ( instancia == null )
            instancia = new ConexionDB ();
        return instancia;
    }
    
    public Connection getConexion (){
        return conexion;
    }
    
    public void conectar ( String dbms, String servidor, String puerto, String bd, 
                           String usuario, String contraseña){
        
        ConexionDB.servidor    = servidor;
        ConexionDB.puerto      = puerto;
        ConexionDB.baseDeDatos = bd;
        ConexionDB.usuario     = usuario;
        ConexionDB.contraseña  = contraseña;
        
        //Determinar el driver JDBC Y la URL DEL SERVIDOR
        
        if ( dbms.equals ( JAVADB ) ) {
            driverJDBC  = "org.apache.derby.jdbc.ClientDriver";
            urlConexion = "jdbc:derby://" + servidor + ":" + puerto + "/";
       }else if ( dbms.equals ( SQLSERVER ) ) {
       }else if ( dbms.equals ( MYSQL     ) ) {
       }else if ( dbms.equals ( ORACLEXE  ) ) {
       }else if ( dbms.equals ( ACCESS    ) ) {
       }
       
       //Intentar hacer la conecion con la bd
       conexion = null;
        try {
            //Realizar la conexion BD
            Class.forName ( driverJDBC );
             conexion = DriverManager.getConnection(
                   urlConexion + baseDeDatos, usuario, contraseña);
             
        } catch ( Exception ex ) {
            System.out.println( ex );
        }
       
        
        
    }
    public void desconectar (){
        if ( conexion != null){
            try{
                conexion.close();
            }catch ( SQLException ex ){
                System.out.println( ex );
            }
        }
            
    }
    
    public boolean conectado (){
        if ( conexion != null )
            return true;
            return false;
        
        
    }
}
