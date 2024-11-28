/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*                                  Clase con casos de prueba
:*        
:*  Archivo     : PrismaTest.java
:*  Autor       : Magnolia Hernández Aguilera     18131248
:*  Fecha       : 25/09/2020
:*  Compilador  : JAVA J2SE v1.8.2
:*  Descripción : jUntilTest, es un Test que permite saber si los resultados 
                   obtenidos de los metodos son los esperados de los calculos, 
                   usando assertEquals.
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  25/Sep/2020 Magnolia Hdz A       Documentar código y aplicar reglas de calidad.
:*------------------------------------------------------------------------------------------*/

package pruebas;



import figura.Cilindro;
import figura.PrismaRectangular;
import figura.PrismaTriangular;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class PrismasTest {
    
    //--------------------------------------------------------------------------
    
    public PrismasTest() {
    }
    
    //--------------------------------------------------------------------------
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    //--------------------------------------------------------------------------
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    //--------------------------------------------------------------------------
    
    @Before
    public void setUp() {
    }
    
    //--------------------------------------------------------------------------
    
    @After
    public void tearDown() {
    }

    //-----------------------------------------------------------------------------------------------------------
    
    @Test
    public void cilindroTest () {
        double radio = 0, altura = 0;
        Cilindro cilindro = new Cilindro ();
        assertEquals ( "Cilindro radio 0, altuta 0 ( área base ): ", 0.0000, cilindro.areaBase(),    0.0001 );
        assertEquals ( "Cilindro radio 0, altuta 0 ( área base ): ", 0.0000, cilindro.areaLateral(), 0.0001 );
        assertEquals ( "Cilindro radio 0, altuta 0 ( área base ): ", 0.0000, cilindro.areaTotal(),   0.0001 );
        assertEquals ( "Cilindro radio 0, altuta 0 ( área base ): ", 0.0000, cilindro.volumen(),     0.0001 );
                
        radio = 4; altura = 10;
        cilindro = new Cilindro ( radio, altura );
        assertEquals ( "Cilindro radio 4, altuta 10 ( área base ): ", 50.2654,  cilindro.areaBase(),    0.0001 );
        assertEquals ( "Cilindro radio 4, altuta 10 ( área lateal ): ", 251.3274, cilindro.areaLateral(), 0.0001 );
        assertEquals ( "Cilindro radio 4, altuta 10 ( área total ): ", 351.8583, cilindro.areaTotal(),   0.0001 );
        assertEquals ( "Cilindro radio 4, altuta 10 ( volumen ): ", 502.6548, cilindro.volumen(),     0.0001 );
                
        cilindro = new Cilindro (); 
        cilindro.setAltura ( altura );
        cilindro.setRadio  ( radio );
        assertEquals ( "Cilindro radio 4, altuta 10 ( área base ): ",    50.2654,  cilindro.areaBase(),    0.0001 );
        assertEquals ( "Cilindro radio 4, altuta 10 ( área lateral ): ", 251.3274, cilindro.areaLateral(), 0.0001 );
        assertEquals ( "Cilindro radio 4, altuta 10 ( área total ): ",   351.8583, cilindro.areaTotal(),   0.0001 );
        assertEquals ( "Cilindro radio 4, altuta 10 ( volumen ): ",      502.6548, cilindro.volumen(),     0.0001 );
         
    }
    
    //--------------------------------------------------------------------------------------------------------------
    
    @Test
    public void PrismaRectangularTest () {
        PrismaRectangular pr = new PrismaRectangular ();
        assertEquals ( "Prisma rectangular con área base: ",    0.0000, pr.areaBase(),    0.0001 );
        assertEquals ( "Prisma rectangular con área lateral: ", 0.0000, pr.areaLateral(), 0.0001 );
        assertEquals ( "Prisma rectangular con área total: ",   0.0000, pr.areaTotal(),   0.0001 );
        assertEquals ( "Prisma rectangular con volumen de: ",   0.0000, pr.volumen(),     0.0001 );
        
        pr = new PrismaRectangular();
        pr.setLargo  ( 13.4 );
        pr.setAncho  ( 4.4 );
        pr.setAltura ( 12.82 );
        
        assertEquals ( "Prisma rectangular con área base: ",    58.9600000000001,   pr.areaBase(),    0.0001 );
        assertEquals ( "Prisma rectangular con área lateral: ", 456.39200000000005, pr.areaLateral(), 0.0001 );
        assertEquals ( "Prisma rectangular con área total: ",   574.3120000000005,  pr.areaTotal(),   0.0001 );
        assertEquals ( "Prisma rectangular con volumen de: ",   755.8672000000001,  pr.volumen(),     0.0001 );
    }
    
    
    //--------------------------------------------------------------------------------------------------------------
    
    @Test
    public void PrismaTriangularTest (){
        int base = 0, altura = 0, alturaPrisma = 0;
        PrismaTriangular prismaTrian = new PrismaTriangular ();
        assertEquals ( "Prisma triangular con área base: ",     0.0000, prismaTrian.areaBase(),    0.0001 );
        assertEquals ( "Prisma triangular con área lateral: ",  0.0000, prismaTrian.areaLateral(), 0.0001 );
        assertEquals ( "Prisma triangular con área total: ",    0.0000, prismaTrian.areaTotal(),   0.0001 );
        assertEquals ( "Prisma triangular con volumen de: ",    0.0000, prismaTrian.volumen(),     0.0001 );
        
//        base = 4; altura = 10; alturaPrisma = 8;
//        prismaTrian = new PrismaTriangular ( base, altura, alturaPrisma );
//        assertEquals ( "Prisma triangular con área base: ",     20,       prismaTrian.areaBase(),    0.0001 );
//        assertEquals ( "Prisma triangular con área lateral: ",  198.1626, prismaTrian.areaLateral(), 0.0001 );
//        assertEquals ( "Prisma triangular con área total: ",    238.1626, prismaTrian.areaTotal(),   0.0001 );
//        assertEquals ( "Prisma triangular con volumen de: ",    218.1626, prismaTrian.volumen(),     0.0001 );
    }
    //-------------------------------------------------------------------------------------------------------------        
}
