/* -----------------------------------------------------------------------------
                       INSTITUTO TECNOLOGICO DE LA LAGUNA
                     INGENIERIA EN SISTEMAS COMPUTACIONALES
                       TOPICOS AVANZADOS DE PROGRAMACION "B"

                   SEMESTRE: ENE-JUN/2020   HORA: 10-11 HRS

                        Clase Mi Hilo ( runnable )


  Archivo     : MiHilo.java
  Autor       : jesus Adrian Lopez Luevanos 18131253
  Fecha       : 11/10/2020
  Compilador  : Java V1.8.2
  Descripción : Clase implementada de runnable, contiene atributos, constructores,
                se utiliza para implementar metodos que contiene en jFrame.

--------------------------------------------------------------------------------
Ultima Modificacion: 
Fecha: 15/01/2021
Modifico: Jesus Adrian Lopez Luevanos
Motivo: añadir prologo 
*/

package mx.tecnm.itl.HiloRunnable;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MiHilo implements Runnable{

//------------------------------------------------------------------------------
    private String nombre = "";

//------------------------------------------------------------------------------
    public MiHilo(){
        
    }
    
//------------------------------------------------------------------------------
    public MiHilo ( String nombre ){
        this.nombre = nombre;
        
    }
    
//------------------------------------------------------------------------------
    public void start(){
        Thread thread = new Thread ( this );
        thread.start();
        
    }

//------------------------------------------------------------------------------    
    @Override
    public void run(){
         for ( int i = 0; i <=100; i++ ){
            System.out.println ( getNombre() + ": " +  i);
            try {
                Thread.sleep(  100 );
            } catch (InterruptedException ex) {
                Logger.getLogger(MiHilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }

//------------------------------------------------------------------------------
    public String getNombre() {
        return nombre;
    }

//------------------------------------------------------------------------------
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
