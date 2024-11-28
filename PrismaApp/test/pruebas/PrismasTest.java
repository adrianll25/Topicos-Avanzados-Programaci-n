/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*                               Clase PrismasTest
:*        
:*  Archivo     : TrianguloRect.java
:*  Autor       : Jesus Adrian Lopez Luevanos  #18131253
:*  Fecha       : 15/09/2020
:*  Compilador  : JAVA v1.8.2
:*  Descripción : Clase que permite realizar Test de pruebas
                 
:*------------------------------------------------------------------------------------------
:*  Ultima modif:
:*  Fecha: 21/Octubre/20202 
    Modificó: jesus Adrian Lopez Luevanos             
    Motivo: Actualizacion del codigo    
:*------------------------------------------------------------------------------------------*/

package pruebas;

import Figuras.Cilindro;
import Figuras.PrismaRectangular;
import Figuras.PrismaTriangular;
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
public class PrismasTest {
    
    public PrismasTest() {
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

     //-----------------------------------------------------------------------------------------------------------
    
    @Test
    public void cilindroTest () {
        double radio = 0;
        double altura = 0;
        
        Cilindro cilindro = new Cilindro ();
        assertEquals ( "Cilindro radio 0, altuta 0 ( área base ): ", 0.0000, cilindro.areaBase(),    0.0001 );
        assertEquals ( "Cilindro radio 0, altuta 0 ( área base ): ", 0.0000, cilindro.areaLateral(), 0.0001 );
        assertEquals ( "Cilindro radio 0, altuta 0 ( área base ): ", 0.0000, cilindro.areaTotal(),   0.0001 );
        assertEquals ( "Cilindro radio 0, altuta 0 ( área base ): ", 0.0000, cilindro.Volumen(),     0.0001 );
                
        radio = 4;
        altura = 10;
        cilindro = new Cilindro ( radio, altura );
        assertEquals ( "Cilindro radio 4, altuta 10 ( área base ): ", 50.2654,  cilindro.areaBase(),    0.0001 );
        assertEquals ( "Cilindro radio 4, altuta 10 ( área lateal ): ", 251.3274, cilindro.areaLateral(), 0.0001 );
        assertEquals ( "Cilindro radio 4, altuta 10 ( área total ): ", 351.8583, cilindro.areaTotal(),   0.0001 );
        assertEquals ( "Cilindro radio 4, altuta 10 ( volumen ): ", 502.6548, cilindro.Volumen(),     0.0001 );
                
        cilindro = new Cilindro (); 
        cilindro.setAltura ( altura );
        cilindro.setRadio  ( radio );
        assertEquals ( "Cilindro radio 4, altuta 10 ( área base ): ",    50.2654,  cilindro.areaBase(),    0.0001 );
        assertEquals ( "Cilindro radio 4, altuta 10 ( área lateral ): ", 251.3274, cilindro.areaLateral(), 0.0001 );
        assertEquals ( "Cilindro radio 4, altuta 10 ( área total ): ",   351.8583, cilindro.areaTotal(),   0.0001 );
        assertEquals ( "Cilindro radio 4, altuta 10 ( volumen ): ",      502.6548, cilindro.Volumen(),     0.0001 );
         
    }
    
    //--------------------------------------------------------------------------------------------------------------
    
    @Test
    public void PrismaRectangularTest () {
        PrismaRectangular pr = new PrismaRectangular ();
        assertEquals ( "Prisma rectangular con área base: ",    0.0000, pr.areaBase(),    0.0001 );
        assertEquals ( "Prisma rectangular con área lateral: ", 0.0000, pr.areaLateral(), 0.0001 );
        assertEquals ( "Prisma rectangular con área total: ",   0.0000, pr.areaTotal(),   0.0001 );
        assertEquals ( "Prisma rectangular con volumen de: ",   0.0000, pr.Volumen(),     0.0001 );
        
        pr = new PrismaRectangular();
        pr.setLargo  ( 13.4 );
        pr.setAncho  ( 4.4 );
        pr.setAltura ( 12.82 );
        
        assertEquals ( "Prisma rectangular con área base: ",    58.9600000000001,   pr.areaBase(),    0.0001 );
        assertEquals ( "Prisma rectangular con área lateral: ", 456.39200000000005, pr.areaLateral(), 0.0001 );
        assertEquals ( "Prisma rectangular con área total: ",   574.3120000000005,  pr.areaTotal(),   0.0001 );
        assertEquals ( "Prisma rectangular con volumen de: ",   755.8672000000001,  pr.Volumen(),     0.0001 );
    }
    
    
    //--------------------------------------------------------------------------------------------------------------
    
    @Test
    public void PrismaTriangularTest (){
        int base = 0;
        int altura = 0;
        int alturaPrisma = 0;
        PrismaTriangular prismaTrian = new PrismaTriangular ();
        assertEquals ( "Prisma triangular con área base: ",     0.0000, prismaTrian.areaBase(),    0.0001 );
        assertEquals ( "Prisma triangular con área lateral: ",  0.0000, prismaTrian.areaLateral(), 0.0001 );
        assertEquals ( "Prisma triangular con área total: ",    0.0000, prismaTrian.areaTotal(),   0.0001 );
        assertEquals ( "Prisma triangular con volumen de: ",    0.0000, prismaTrian.Volumen(),     0.0001 );
        
        base = 4; 
        altura = 10; 
        alturaPrisma = 8;
        
        prismaTrian = new PrismaTriangular ( base, altura, alturaPrisma );
        assertEquals ( "Prisma triangular con área base: ",     20,       prismaTrian.areaBase(),    0.0001 );
        assertEquals ( "Prisma triangular con área lateral: ",  190.1626, prismaTrian.areaLateral(), 0.0001 );
        assertEquals ( "Prisma triangular con área total: ",    238.1626, prismaTrian.areaTotal(),   0.0001 );
        assertEquals ( "Prisma triangular con volumen de: ",    218.1626, prismaTrian.Volumen(),     0.0001 );

    }
    
}
