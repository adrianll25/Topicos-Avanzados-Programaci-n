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
:*  Archivo     : Circulo.java
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

public class Circulo extends Figura {
   
    private double radio;
    
     //--------------------------------------------------------------------------
    
    public Circulo () {
        radio = 0;
    }

    //--------------------------------------------------------------------------
    
    public Circulo ( double r ) {
        radio = r;
    }
    
    //--------------------------------------------------------------------------
    
    public double diametro (){
    return 2 * radio ;      
    }
    
    //--------------------------------------------------------------------------
    
    public double circunferencia (){
        return Math.PI * diametro() ; 
    }
    
    //--------------------------------------------------------------------------
    
    public double getRadio () {
        return radio;
    }
    
    //--------------------------------------------------------------------------

    public void setRadio ( double radio ) {
        this.radio = radio;
    }
    
    //--------------------------------------------------------------------------

    @Override
    public String toString () {
        return " Circulo de radio = " + radio ;
    }
    
    //--------------------------------------------------------------------------
    
    @Override
    public double perimetro () {
        return circunferencia () ; 
    }

    //--------------------------------------------------------------------------
    
    @Override
    public double area() {
        return  Math.PI * Math.pow ( radio, 2 );
       
    }
        
}