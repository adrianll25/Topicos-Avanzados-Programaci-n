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

import Matematica.Matematica;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adria
 */
public class MatematicaTest {
    
    public MatematicaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void FactorialTest () {
        assertEquals ( "Factorial ( 0 ) ", 1, Matematica.Factorial ( 0 ) ); 
        assertEquals ( "Factorial ( 1 ) ", 1, Matematica.Factorial ( 1 ) ); 
        assertEquals ( "Factorial ( 5 ) ", 120, Matematica.Factorial ( 5 ) );
        assertEquals ( "Factorial ( 17 ) ", 355687428096000L, Matematica.Factorial ( 17 ) ); 
    }
    
    @Test
    public void PermutacionesTest () {
        assertEquals ( "Permutaciones ( 10, 5 )", 30240, Matematica.Permutaciones( 10, 5 ) );
        assertEquals ( "Permutaciones ( 5, 5 )", 120, Matematica.Permutaciones( 5, 5 ) );
        assertEquals ( "Permutaciones ( 15, 9 )", 1816214400, Matematica.Permutaciones( 15, 9 ) );
        assertEquals ( "Permutaciones ( 18, 6 )", 13366080, Matematica.Permutaciones( 18, 6 ) );
    }
    
    @Test 
    public void CombinacionesTest () {
        assertEquals ( "Combinaciones ( 10, 5 )", 252, Matematica.Combinaciones( 10, 5 ) );
        assertEquals ( "Combinaciones ( 5, 5 )", 1, Matematica.Combinaciones( 5, 5 ) );
        assertEquals ( "Combinaciones ( 15, 9 )", 5005, Matematica.Combinaciones( 15, 9 ) );
        assertEquals ( "Combinaciones ( 18, 6 )", 18564, Matematica.Combinaciones( 18, 6 ) );
    }
    
}
