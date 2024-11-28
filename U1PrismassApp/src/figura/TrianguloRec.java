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
:*  Archivo     : TrianguloRec.java
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

public class TrianguloRec extends Figura {
   
    private double base;
    private double altura;
    
    //--------------------------------------------------------------------------

    public TrianguloRec () {
        base   = 0;
        altura = 0;
    }
   
    //--------------------------------------------------------------------------

    public TrianguloRec ( double base, double altura ) {
        this.base   = base;
        this.altura = altura;
    }
 
    //--------------------------------------------------------------------------
    
    public double hipotenusa () {
        return Math.sqrt ( Math.pow ( base, 2 ) + Math.pow( altura, 2) );
    }
    
    //--------------------------------------------------------------------------
    
    public double getAltura () {
        return altura;
    }
      
    //--------------------------------------------------------------------------

    public void setAltura ( double altura ) {
        this.altura = altura;
    }

    //--------------------------------------------------------------------------

    public double getBase () {
        return base;
    }
    
    //--------------------------------------------------------------------------

    public void setBase ( double base ) {
        this.base = base;
    }
    
    //--------------------------------------------------------------------------

    @Override
    public String toString () {
        return " TrianguloRecangulo con base = " + base +  ", altura = " + altura;
    }
    
    //--------------------------------------------------------------------------

    @Override
    public double perimetro() {
        return base + altura + hipotenusa ();
    }

    @Override
    public double area() {
        return base * altura / 2;
    }
    
}
