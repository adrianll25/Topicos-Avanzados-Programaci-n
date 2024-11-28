/* -----------------------------------------------------------------------------
                       INSTITUTO TECNOLOGICO DE LA LAGUNA
                     INGENIERIA EN SISTEMAS COMPUTACIONALES
                       TOPICOS AVANZADOS DE PROGRAMACION "B"

                   SEMESTRE: ENE-JUN/2013    HORA: 10-11 HRS

         Casos de pruebas utilizando la libreria JUnit para la clase matematica.


  Archivo     : U1MatematicaApp
  Autor       : jesus Adrian Lopez Luevanos 18131253
  Fecha       : 30/09/2020
  Compilador  : Java j2SE V1.8.0
  Descripción : Casos de prueba JUnit para las funciones matematicas
                (factorial, permutacion, combinacion) que se encuentran
                en la clase matematica.

--------------------------------------------------------------------------------
Ultima Modificacion:
Fecha:
Modifico:
Motivo:
*/

package PruebasMatematicas;

//------------------------------------------------------------------------------

import matematica.Matematica;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

//------------------------------------------------------------------------------

/**
 *
 * @author chuy-
 */
public class MatematicaTest {
    
//------------------------------------------------------------------------------
    
    public MatematicaTest() {
    }
    
//------------------------------------------------------------------------------
    
    @BeforeClass
    public static void setUpClass() {
    }
    
//------------------------------------------------------------------------------    
    
    @AfterClass
    public static void tearDownClass() {
    }
    
//------------------------------------------------------------------------------    
    
    @Before
    public void setUp() {
    }
    
//------------------------------------------------------------------------------    
    
    @After
    public void tearDown() {
    }

//------------------------------------------------------------------------------   
    
    @Test
    public void factorialTest () {
        assertEquals ( "Factorial ( 0 )", 1, Matematica.factorial ( 0 ) );
        assertEquals ( "Factorial ( 1 )", 1, Matematica.factorial ( 1 ) );
        assertEquals ( "Factorial ( 5 )", 120, Matematica.factorial ( 5 ) );
        assertEquals ( "Factorial ( 17 )", 355687428096000L, Matematica.factorial ( 17 ) );
    }
    
//------------------------------------------------------------------------------
    
     @Test
    public void permutacionesTest (){
        assertEquals ( "Permutaciones ( 10, 5 )", 30240, Matematica.permutaciones ( 10, 5 ) );
        assertEquals ( "Permutaciones ( 5, 5 )", 120, Matematica.permutaciones ( 5, 5 ) );
        assertEquals ( "Permutaciones ( 15, 9 )", 1816214400, Matematica.permutaciones ( 15, 9 ) );
        assertEquals ( "Permutaciones ( 18, 6 )", 13366080, Matematica.permutaciones ( 18, 6 ) );
    }
    
//------------------------------------------------------------------------------    
    
    @Test
    public void combinacionesTest (){
        assertEquals ( "Combinaciones ( 10, 5 )", 252, Matematica.combinaciones ( 10, 5 ) );
        assertEquals ( "Combinaciones ( 5, 5 )", 1, Matematica.combinaciones ( 5, 5 ) );
        assertEquals ( "Combinaciones ( 15, 9 )", 5005, Matematica.combinaciones ( 15, 9 ) );
        assertEquals ( "Combinaciones ( 18, 6 )", 18564, Matematica.combinaciones ( 18, 6 ) );
    }
    
//------------------------------------------------------------------------------    
    @Test
    public void formulaGeneral () {
//        String [] raices = Matematica.formulaGeneral(n1, n2, 0, 0, 0)
//        assertEquals ( "Formula General ( 1, 4, -5 )", "1.0", raices [0] );
//        assertEquals ( "Formula General ( 1, 4, -5 )", "-5.0", raices [1] );
//        assertEquals ( "Formula General ( 1, 4, -5 )", "7.0", raices [2] );
        
    }
}
