/* -----------------------------------------------------------------------------
                       INSTITUTO TECNOLOGICO DE LA LAGUNA
                     INGENIERIA EN SISTEMAS COMPUTACIONALES
                       TOPICOS AVANZADOS DE PROGRAMACION "B"

                   SEMESTRE: ENE-JUN/2020   HORA: 10-11 HRS

                      Clase java Globo extendida a Thread


  Archivo     : Globo.java
  Autor       : jesus Adrian Lopez Luevanos 18131253
  Fecha       : 15/01/2021
  Compilador  : Java V1.8.2
  Descripción : Clase en la que se encuentran atributos, constructores, se encuentra
                extendida de Thread, se utiliza para implementar metodos que tiene
                en un Frame y asi poder lograr los globos con el movimiento pedido.

--------------------------------------------------------------------------------
Ultima Modificacion: 
Fecha: 
Modifico: 
Motivo: 
*/
package mx.tecnm.itl.Globos;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

//------------------------------------------------------------------------------
public class Globo extends Thread {

//------------------------------------------------------------------------------
    //Declaracion de variables
    GlobosFrame parent;
    Color        color;
    int   radioInicial;
    int   radioActual ;
    int   periodoSleep;
    int   x;
    int   y;
    boolean creciendo ;

//------------------------------------------------------------------------------
    //Constructor
    public Globo ( GlobosFrame parent, Color color, 
                   int radioInicial, int periodoSleep, int x, int y ){
        
        this.parent       = parent;
        this.color        = color ;
        this.radioInicial = radioInicial;
        this.radioActual  = radioInicial;
        this.periodoSleep = periodoSleep;
        this.x            = x;
        this.y            = y;
        creciendo         = ( Math.random() > 0.5 ) ? true : false;
        
        
    }

//------------------------------------------------------------------------------    
    @Override
    public void run(){
      
        while ( true ){
            try{
            if ( creciendo )
                radioActual++;
            
            else
                radioActual--;
            
            if ( radioActual <= 5 || radioActual >= radioInicial * 2 )
                creciendo =! creciendo;
                parent.repaint();

                    Thread.sleep( periodoSleep );
                } catch (InterruptedException ex) {
                    System.out.println( ex );
                }
            }
            
        }

//------------------------------------------------------------------------------
    //Metodo para dibujar y colorear los globos    
    public void dibujar ( Graphics g ){
        g.setColor ( color );
        g.fillOval ( x - radioActual, y - radioActual, 2 * radioActual, 2 * radioActual ); 
        
    }
      
    }

