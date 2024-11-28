/* -----------------------------------------------------------------------------
                       INSTITUTO TECNOLOGICO DE LA LAGUNA
                     INGENIERIA EN SISTEMAS COMPUTACIONALES
                       TOPICOS AVANZADOS DE PROGRAMACION "B"

                   SEMESTRE: ENE-JUN/2013    HORA: 10-11 HRS

 Clase con las funciones matematicas factorial, permutaciones, combinaciones


  Archivo     : U1MatematicaApp
  Autor       : Jesus Rodolfo Teran Cuellar 18131392
  Fecha       : 30/09/2020
  Compilador  : Java j2SE V1.8.0
  Descripción : Clase donde se encuentran las funciones matematicas
                1-. Facrorial: ( n )!
                2-. Permutaciones: ( Factorial ( n ) / Factorial ( n - x ) )
                3-. Combinaciones: ( Permutaciones ( n, x ) / Factorial ( x ) )

--------------------------------------------------------------------------------
Ultima Modificacion: 
Fecha: 02/10/2020
Modifico: Jesus Rodolfo Teran Cuellar
Motivo: Se añadio la operación matematica Formula General
*/

package matematica;

import java.text.DecimalFormat;

public class Matematica {
        //----------------------------------------------------------------------
        // Factorial. n! = 1 x 2 x 3 x .......... x n - 1 x
       //       excepto 0! = 1
    
	public static long factorial( int n ) {
		 long fact;
		
		  if ( n == 0 ) return 1;
		  fact = 1;
		  for ( int i = 1; i <= n; i++)
		    fact *= i;
		  return fact;
	}

        //----------------------------------------------------------------------
        // Permutaciones. P ( n, x ) = n! / ( n - x)!
        
	public static long permutaciones( int n, int x ) {
		 long p;
		 p = ( factorial ( n ) / factorial ( n - x ) );
		 return p;
	}

        //----------------------------------------------------------------------
        // Combinaciones. C ( n, x ) = P ( n, x ) / x!
        
	public static long combinaciones( int n, int x ) {
		 long c;
		
		 c = ( permutaciones ( n, x ) / factorial ( x ) );
		 return c;
	}
        
        //----------------------------------------------------------------------
        
     public static void formulaGeneral ( Numero n1, Numero n2, int a, int b, int c ) {
         DecimalFormat f = new DecimalFormat ( "##.####" );
         double disc = Math.pow ( b, 2 ) - ( 4 * a * c );
         if ( disc > -1 ){
             n1.num = f.format ( ( ( -b ) + Math.sqrt ( Math.pow ( b, 2 ) - ( 4 * a * c ) ) ) / ( 2 * a ) ) + "";
             n2.num = f.format ( ( ( -b ) - Math.sqrt ( Math.pow ( b, 2 ) - ( 4 * a * c ) ) ) / ( 2 * a ) ) + "";
         } else {
             n1.num = f.format ( ( ( -b ) + Math.sqrt ( Math.pow ( b, 2 ) - ( 4 * a * c ) * -1 ) ) / ( 2 * a ) ) + "i";
             n2.num = f.format ( ( ( -b ) - Math.sqrt ( Math.pow ( b, 2 ) - ( 4 * a * c ) * -1 ) ) / ( 2 * a ) ) + "i";
         }
     }
}