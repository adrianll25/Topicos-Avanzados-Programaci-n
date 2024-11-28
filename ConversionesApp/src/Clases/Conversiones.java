/* -----------------------------------------------------------------------------
                       INSTITUTO TECNOLOGICO DE LA LAGUNA
                     INGENIERIA EN SISTEMAS COMPUTACIONALES
                       TOPICOS AVANZADOS DE PROGRAMACION "B"

                   SEMESTRE: ENE-JUN/2013    HORA: 10-11 HRS

 Clase con las conversiones y su formulas para saber el resultado del usuario


  Archivo     : Conversiones.java
  Autor       : jesus Adrian Lopez Luevanos 18131253
  Fecha       : 11/10/2020
  Compilador  : Java j2SE V1.8.0
  Descripción : Clase que contiene metodos estaticos donde se 
                encuentran las formulas de las conversiones: 
                             °f a °C 
                             °c a °f
                             Yds a Mts
                             Mts a Yds
                             Lb a Kg
                             kg a Lb
                             Decimal a Binario
                             Binario a Decimal

--------------------------------------------------------------------------------
Ultima Modificacion: 
Fecha: 12/10/20
Modifico: Jesus Adrian Lopez Luevanos
Motivo: Añadio el metodo estatico Binario Decimal  
*/
package Clases;

import java.text.DecimalFormat;

/**
 *
 * @author adria
 */
public class Conversiones {
    public static String Celsius_Farenheit ( double Celsius ){
        
        DecimalFormat df = new DecimalFormat ( "#.##" );
        double  Fahrenheit;
        Fahrenheit = ( Celsius * ( 9 / 5.0 ) ) + 32; 
        return  df.format( Fahrenheit );
    }
    
    public static String Farenheit_Celsius( double Farenheit ){
        DecimalFormat df = new DecimalFormat ( "#.##" );
        double  Celsius;
        Celsius = ( Farenheit - 32 ) / ( 9 / 5.0 );
        return df.format( Celsius );
    }
    
    public static String Metros_Yardas ( double Metros ){
        DecimalFormat df = new DecimalFormat ( "#.##" );
        double  Yardas;
        Yardas =  Metros  *  1.0936 ;
        return df.format( Yardas );
    }
    
    public static String Yardas_Metros ( double Yardas ){
        DecimalFormat df = new DecimalFormat ( "#.##" );
        double  Metros;
        Metros = Yardas / 1.0936 ;
        return df.format ( Metros );
    }
    
    public static String Kg_Lb ( double Libras ){
        DecimalFormat df = new DecimalFormat ( "#.##" );
        double  Kilos;
        Kilos = Libras / 2.2046 ;
        return df.format ( Kilos );
    }
    
    public static String Lb_kg ( double Kilos ){
        DecimalFormat df = new DecimalFormat ( "#.##" );
        double Libras;
        Libras = Kilos * 2.2046; 
        return df.format ( Libras );
    }

    public static long Binario_Decimal (String binario) {
  
        long Decimal = 0;
        int Posicion = 0;
  
        for ( int x = binario.length() - 1; x >= 0; x-- ) {
      
           short digito = 1;
           
        if ( binario.charAt(x) == '0' ) {
            digito = 0;
        }

        double multiplicador = Math.pow( 2, Posicion );
        Decimal += digito * multiplicador;
        Posicion++;
  }
     
        return Decimal;
}
    public static String Decimal_Binario (long decimal) {
	if ( decimal <= 0 ) {
		return "0" ;
	}
	StringBuilder binario = new StringBuilder();
        
	while ( decimal > 0 ) {
		short residuo = ( short ) ( decimal % 2 );
		decimal = decimal / 2;
		
		binario.insert( 0, String.valueOf( residuo ) );
	}
	return binario.toString();
}
    
}
