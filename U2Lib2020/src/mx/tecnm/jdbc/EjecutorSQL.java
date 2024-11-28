
package mx.tecnm.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class EjecutorSQL {
    
    public static final String INT    = "int";
    public static final String FLOAT  = "float";
    public static final String STRING = "String";
    
    public static ResultSet sqlQuery ( String sql ) throws SQLException{
        return sqlQuery ( sql, null );
    }
    
    public static ResultSet sqlQuery ( String sql, Object [][] args ) throws SQLException{
        final int Tipo  = 0;
        final int Valor = 1;
        
        PreparedStatement ps = ConexionDB.getInstancia().getConexion()
                                                 .prepareStatement ( sql );
        
        prepararArgumentos ( ps, args );
        return ps.executeQuery();
    }
    
    public static int sqlEjecutar ( String sql ) throws SQLException{

        return sqlEjecutar ( sql, null );
    }
        
    public static int sqlEjecutar ( String sql, Object [][] args ) throws SQLException{
        PreparedStatement ps = ConexionDB.getInstancia().getConexion()
                                             .prepareStatement ( sql );
        
        prepararArgumentos ( ps, args );
        return ps.executeUpdate();
    }
    
    public static void prepararArgumentos ( PreparedStatement ps,Object [][] args  ) throws SQLException{
        final int Tipo  = 0;
        final int Valor = 1;
        
        if ( args != null ){
            int numArg = 1;
            for ( Object [] arg : args ){
                switch ( arg [ Tipo ].toString() ){
                    case INT     : ps.setInt ( numArg, 
                                                 Integer.parseInt( arg [ Valor ].toString () ) );
                    break;
                    
                    case FLOAT    : ps.setFloat(numArg, 
                                                  Float.parseFloat( arg [Valor].toString () ) );
                    break;
                    case STRING   : ps.setString(numArg, 
                                                   arg [Valor].toString () );
                    break;
                }
                
                numArg++;
            }
        }
      
    }
}
