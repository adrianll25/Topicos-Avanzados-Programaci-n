/* -----------------------------------------------------------------------------
                       INSTITUTO TECNOLOGICO DE LA LAGUNA
                     INGENIERIA EN SISTEMAS COMPUTACIONALES
                       TOPICOS AVANZADOS DE PROGRAMACION "B"

                   SEMESTRE: ENE-JUN/2013    HORA: 10-11 HRS

 Clase con las funciones matematicas factorial, permutaciones, combinaciones


  Archivo     : U1MatematicaApp
  Autor       : jesus Adrian Lopez Luevanos 18131253
  Fecha       : 30/09/2020
  Compilador  : Java j2SE V1.8.0
  Descripción : Clase donde se encuentran las funciones matematicas
                1-. Facrorial: ( n )!
                2-. Permutaciones: ( Factorial ( n ) / Factorial ( n - x ) )
                3-. Combinaciones: ( Permutaciones ( n, x ) / Factorial ( x ) )

--------------------------------------------------------------------------------
Ultima Modificacion: 
Fecha: 02/10/2020
Modifico: Jesus Adrian Lopez Luevanos
Motivo: Se añadio la operación matematica Formula General
*/


package Matematica;

import java.text.DecimalFormat;

public class Matematica {

    //--------------------------------------------------------------------------
	public static long Factorial(int n) {
		long fact;
		
		if ( n == 0 ) return 1;
		fact = 1;
		for ( int i = 1; i <= n; i++)
		fact *= i; 
		return  fact;
	}
        
    //--------------------------------------------------------------------------
	public static long Permutaciones(int n, int x) {
		long p;
		
		p = ( Factorial ( n ) / Factorial ( n - x ) );
		return p;
	}
        
    //--------------------------------------------------------------------------
	public static long Combinaciones(int n, int x) {
		long c;
		
		c = ( Permutaciones ( n, x ) / Factorial ( x ) );
		 return c;
	}
        
    //--------------------------------------------------------------------------
        
        public static void FormulaGeneral ( int a, int b, int c, Numero n1, Numero n2){
           DecimalFormat f = new DecimalFormat ( "##.####" );
           
         double Discriminante = Math.pow ( b, 2 ) - ( 4 * a * c );
         
         if ( Discriminante > -1 ){
             
             n1.num = f.format ( ( ( -b ) + Math.sqrt ( Math.pow ( b, 2 ) - ( 4 * a * c ) ) ) / ( 2 * a ) ) + "";
             n2.num = f.format ( ( ( -b ) - Math.sqrt ( Math.pow ( b, 2 ) - ( 4 * a * c ) ) ) / ( 2 * a ) ) + "";
             
         } else {
             
             n1.num = f.format ( ( ( -b ) + Math.sqrt ( Math.pow ( b, 2 ) - ( 4 * a * c ) * -1 ) ) / ( 2 * a ) ) + "i";
             n2.num = f.format ( ( ( -b ) - Math.sqrt ( Math.pow ( b, 2 ) - ( 4 * a * c ) * -1 ) ) / ( 2 * a ) ) + "i";
         }
         
        }
}

        
