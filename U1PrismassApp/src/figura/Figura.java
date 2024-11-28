/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*                Clase abstract con métodos que se implementan en otra clase.
:*        
:*  Archivo     : Figura.java
:*  Autor       : Magnolia Hernández Aguilera     18131248
:*  Fecha       : 15/10/2020
:*  Compilador  : JAVA J2SE v1.8.2
:*  Descripción : Clase que tiene metodos abstractos de:
                    -Perimetro
                    -Áreaa
:*------------------------------------------------------------------------------------------
:*  Ultima modif:
:*  Fecha: 18/Octubre/20202 
    Modificó: Magnolia Hernández Aguilera             
    Motivo: Actualizacion del codigo    
:*------------------------------------------------------------------------------------------*/

package figura;

public abstract class Figura {
    
    //-------------------------------------------------------------------------
    
    public abstract double perimetro ();
    
    //-------------------------------------------------------------------------
    
    public abstract double area ();
    
}
