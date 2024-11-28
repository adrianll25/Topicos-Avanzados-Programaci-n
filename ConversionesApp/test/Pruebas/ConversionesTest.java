/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import Clases.Conversiones;
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
public class ConversionesTest {
    
    public ConversionesTest() {
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
    public void  celsius_fahrenheit () {
        
        assertEquals ( "La Conversion de ( -18.3 )", -0.94, Conversiones.Celsius_Farenheit ( -18.3 ) );
        assertEquals ( "La Conversion de ( 0 )", 32, Conversiones.Celsius_Farenheit ( 32 ) );
        assertEquals ( "La Conversion de ( 27 )", 80.6, Conversiones.Celsius_Farenheit ( 27 ) );
        assertEquals ( "La Conversion de ( 12.2 )", 53.96, Conversiones.Celsius_Farenheit ( 12.2 ) );

    }
    
    //-------------------------------------------------------------------------------------------------
    
    @Test
    public void fahrenheit_celsius () {
        
        assertEquals ( "La Conversion de ( 0 )", -17.78, Conversiones.Farenheit_Celsius ( 0 ) );
        assertEquals ( "La Conversion de ( 25.12 )", -3.82, Conversiones.Farenheit_Celsius ( 25.12 ) );
        assertEquals ( "La Conversion de ( 75 )", 23.89, Conversiones.Farenheit_Celsius ( 75 ) );
        assertEquals ( "La Conversion de ( 12.2 )", -11, Conversiones.Farenheit_Celsius ( 12.2 ) );
   
    }
    
     //-------------------------------------------------------------------------------------------------
    
    @Test
    public void Yardas_Metros(){
        assertEquals ( " La conversion de ( 1 ) ", 0.91, Conversiones.Yardas_Metros( 1 ) );
        assertEquals ( " La conversion de ( 11 ) ", 10.06, Conversiones.Yardas_Metros( 11 ) );
        assertEquals ( " La conversion de ( 4 ) ", 3.66, Conversiones.Yardas_Metros ( 4 ) );
        assertEquals ( " La conversion de ( 2 ) ", 1.83, Conversiones.Yardas_Metros ( 2 ) );
        
    }
    
    //----------------------------------------------------------------------------------------------------
    
    @Test
    public void Metros_yardas(){
        assertEquals ( " La conversion de ( 2 ) ", 2.19, Conversiones.Metros_Yardas ( 2 ) );
        assertEquals ( " La conversion de ( 7 ) ", 7.66, Conversiones.Metros_Yardas ( 7 ) );
        assertEquals ( " La conversion de ( 12 ) ", 13.12, Conversiones.Metros_Yardas ( 12 ) );
        assertEquals ( " La conversion de ( 1 ) ", 1.09, Conversiones.Metros_Yardas ( 1 ) );
        
    }
    
    //---------------------------------------------------------------------------------------------------
    
    @Test
    public void Lb_Kg(){
        assertEquals ( " La conversion de ( 2 ) ", 4.41, Conversiones.Lb_kg ( 2 ) );
        assertEquals ( " La conversion de ( 7 ) ", 15.43, Conversiones.Lb_kg ( 7 ) );
        assertEquals ( " La conversion de ( 12 ) ", 26.46, Conversiones.Lb_kg ( 12 ) );
        assertEquals ( " La conversion de ( 1 ) ", 2.2, Conversiones.Lb_kg ( 1 ) );
        
    }
    
    //-----------------------------------------------------------------------------------------------------
    
    @Test
    public void Kg_Lb(){
        assertEquals ( " La conversion de ( 2 ) ", 0.91, Conversiones.Kg_Lb ( 2 ) );
        assertEquals ( " La conversion de ( 7 ) ", 3.18, Conversiones.Kg_Lb ( 7 ) );
        assertEquals ( " La conversion de ( 12 ) ", 5.44, Conversiones.Kg_Lb ( 12 ) );
        assertEquals ( " La conversion de ( 1 ) ", 0.45, Conversiones.Kg_Lb ( 1 ) ); 
    }

}
