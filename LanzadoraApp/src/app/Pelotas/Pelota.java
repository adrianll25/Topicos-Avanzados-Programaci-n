/* -----------------------------------------------------------------------------
                       INSTITUTO TECNOLOGICO DE LA LAGUNA
                     INGENIERIA EN SISTEMAS COMPUTACIONALES
                       TOPICOS AVANZADOS DE PROGRAMACION "B"

                   SEMESTRE: ENE-JUN/2020   HORA: 10-11 HRS

                clase pelota Java extendiende de Thread

  Archivo     : Pelota.java
  Autor       : jesus Adrian Lopez Luevanos 18131253
  Fecha       : 14/01/2021
  Compilador  : Java j2SE V1.8.0
  Descripción : clase con atributos, constructres, se utiliza para implementar
                metodos en el bean PelotasRebotando.
                Los metodos aqui utilizados son: mover, rebotar, limpiarm, pausar.

--------------------------------------------------------------------------------
Ultima Modificacion: 
Fecha: 15/01/2021
Modifico: Jesus Adrian Lopez Luevanos
Motivo: Añadir Prologo
*/

package Pelotas;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

//------------------------------------------------------------------------------
public class Pelota extends Thread {
    private JPanel jpnlMarcoPelota;
    int x;
    int y;
    int ancho, alto;
    int despx, despy;
    boolean seguirRebotando = true;
    private Graphics lienzo;
    int periodo;
    

//------------------------------------------------------------------------------   
public Pelota ( JPanel jpnlMarcoPelota ){
    super();
    this.jpnlMarcoPelota = jpnlMarcoPelota;
    lienzo = jpnlMarcoPelota.getGraphics();
    ancho = jpnlMarcoPelota.getWidth    ();
    alto  = jpnlMarcoPelota.getHeight   ();
    x = ancho / 2;
    y = alto  / 2;
    despx    = 1 +    (int)( Math.random() * 7  ) ;
    despy    = 1 +    (int)( Math.random() * 3  ) ;  
    periodo = 10 +    (int)( Math.random() * 40 ) ;    
    
}   

//------------------------------------------------------------------------------
    @Override
 public void run (){
     while ( seguirRebotando ){
         mover();
         rebotar();
         limpiar();
         dibujar();
         pausa();
         
     }
     
 }
 
//------------------------------------------------------------------------------
 private void mover(){
     x += despx;
     y += despy;
     
 } 
 
//------------------------------------------------------------------------------
 private void rebotar(){
     if ( x <= 0 || x >= ancho ){
         despx *= -1;
         
     }
     if ( y <= 0 || y >= alto ){
         despy *= -1;
         
     }
 }

//------------------------------------------------------------------------------
 private void dibujar(){
     lienzo.setColor( Color.red );
     
     lienzo.fillOval( x, y, 20, 20 );
 }

//------------------------------------------------------------------------------ 
 private void pausa(){
        try {
            Thread.sleep ( periodo );
        } catch (InterruptedException ex) {
            Logger.getLogger(Pelota.class.getName()).log(Level.SEVERE, null, ex);
        }
 }

//------------------------------------------------------------------------------
 private void limpiar(){
     lienzo.setColor(Color.white);
     lienzo.fillRect(0, 0, ancho, alto);
     
 }
}
