/* -----------------------------------------------------------------------------
                       INSTITUTO TECNOLOGICO DE LA LAGUNA
                     INGENIERIA EN SISTEMAS COMPUTACIONALES
                       TOPICOS AVANZADOS DE PROGRAMACION "B"

                   SEMESTRE: ENE-JUN/2020   HORA: 10-11 HRS

                            Clase Main HilosApp Java 

  Archivo     : HilosApp.java
  Autor       : jesus Adrian Lopez Luevanos 18131253
  Fecha       : 12/01/2021
  Compilador  : Java j2SE V1.8.0
  Descripción : clase main donde se ejecutan la carrera se implementa runnable 

--------------------------------------------------------------------------------
Ultima Modificacion: 
Fecha: 15/01/21
Modifico: Jesus Adrian Lopez Luevanos 
Motivo: Añadir Prologo
*/

package mx.tecnm.itl.Hilo.MiHiloApp;

import mx.tecnm.itl.HiloRunnable.MiHilo;

public class HilosApp {
    
//------------------------------------------------------------------------------
    //Main donde se nombra los hilos y se inician    
    public static void main ( String [] args ) {
        MiHilo hilo1 = new MiHilo ( "Tio Oswi"       );
        MiHilo hilo2 = new MiHilo ( "Tio Ulloita"    );
        MiHilo hilo3 = new MiHilo ( "Tio Rios"       );
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
    
}
