/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*                Clase con métodos que se implementan en un jFrame
:*        
:*  Archivo     : Rectangulo.java
:*  Autor       : Magnolia Hernández Aguilera     18131248
:*  Fecha       : 21/09/2020
:*  Compilador  : JAVA J2SE v1.8.2
:*  Descripción : Clase que tiene metodos estaticos que permiten hacer operaciones
                  de, factorizacion, permutaciones y combinaciones recibiendo parametros.
                  Muestra los resultados en un Jlabel en un jFrame
:*------------------------------------------------------------------------------------------
:*  Ultima modif:
:*  Fecha: 02/Octubre/20202 
    Modificó: Magnolia Hernández Aguilera             
    Motivo: Actualizacion del codigo    
:*------------------------------------------------------------------------------------------*/

package figura;

public class Rectangulo extends Figura {
    
    private double ancho;
    private double largo;

    //--------------------------------------------------------------------------
    
    public Rectangulo () {
        ancho = 0;
        largo = 0;
    }
    
    //--------------------------------------------------------------------------
    
    public Rectangulo ( double ancho, double largo ) {
        this.ancho = ancho;
        this.largo = largo;
    }
    
    //--------------------------------------------------------------------------
    
    public double diagonar () {
        return Math.sqrt ( Math.pow ( ancho, 2 ) + Math.pow( largo, 2) );
    }
    
    //--------------------------------------------------------------------------

    public void setAncho ( double ancho ) {
        this.ancho = ancho;
    }
    
    //--------------------------------------------------------------------------

    public double getAncho () {
        return ancho;
    }
    
    //--------------------------------------------------------------------------

    public double getLargo () {
        return largo;
    }
   
    //--------------------------------------------------------------------------

    public void setLargo ( double largo ) {
        this.largo = largo;
    }
    
    //--------------------------------------------------------------------------

    @Override
    public String toString () {
        return "Rectangulo de ancho =" + ancho + "largo" + largo;
    }
      
    //--------------------------------------------------------------------------
   
    @Override
    public double perimetro () {
       return 2 * largo + 2 * ancho; 
    }   
    
    //--------------------------------------------------------------------------
    
    @Override
    public double area () {
        return ancho *  largo; 
    }
    
}
