/* -----------------------------------------------------------------------------
                       INSTITUTO TECNOLOGICO DE LA LAGUNA
                     INGENIERIA EN SISTEMAS COMPUTACIONALES
                       TOPICOS AVANZADOS DE PROGRAMACION "B"

                   SEMESTRE: ENE-JUN/2020   HORA: 10-11 HRS

                        Clase Mi Hilo ( runnable )


  Archivo     : MiHilo.java
  Autor       : jesus Adrian Lopez Luevanos 18131253
  Fecha       : 12/01/2021
  Compilador  : Java V1.8.2
  Descripción : Clase Extendida de Thread, contiene atributos, constructores,
                se utiliza para implementar metodos que contiene en jFrame.

--------------------------------------------------------------------------------
Ultima Modificacion: 
Fecha: 15/01/2021
Modifico: Jesus Adrian Lopez Luevanos
Motivo: añadir prologo 
*/
package app.Carreritas;

import app.Carreritas.HilosFrame;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MiHilo extends Thread {
 
//------------------------------------------------------------------------------
    private HilosFrame frame;
    
//------------------------------------------------------------------------------
    public MiHilo () {
        super ();
        
    }
 
//------------------------------------------------------------------------------
    public MiHilo ( String Nombre ){
        super ( Nombre );
        
    }
   
//------------------------------------------------------------------------------
    public MiHilo ( String Nombre, HilosFrame frame ){
        super ( Nombre );
        this.frame = frame;
        
    }
 
//------------------------------------------------------------------------------
    @Override
    public void run() {
        for ( int i = 0; i <=100; i++ ){
            System.out.println ( getName() + ": " +  i);
            if (frame != null )
                frame.setProgreso( getName(), i);
            try {
                Thread.sleep(  100 );
            } catch (InterruptedException ex) {
                Logger.getLogger(MiHilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
