/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*       Clase abstract Prisma con métodos que se implementan en otra clase.
:*        
:*  Archivo     : Prisma.java
:*  Autor       : Jesus Adrian Lopez Luevanos #18131253
:*  Fecha       : 18/10/2020
:*  Compilador  : JAVA v1.8.2
:*  Descripción : Clase que tiene metodos abstractos de:
                    -AreaLateral
                    -ÁreaBase
                    -AreaTotal
                    -Volumen


:*------------------------------------------------------------------------------------------
:*  Ultima modif:
:*  Fecha: 21/Octubre/20202 
    Modificó: Jesus Adrian Lopez Luevanos              
    Motivo: Actualizacion del codigo    
:*------------------------------------------------------------------------------------------*/
package mx.tecnm.itl.prismas;

public abstract class Prisma {
    
    //--------------------------------------------------------------------------
    
    public abstract double areaBase ();
    
    //--------------------------------------------------------------------------
    
    public abstract double areaLateral ();
    
    //--------------------------------------------------------------------------
    
    public abstract double areaTotal ();
    
    //--------------------------------------------------------------------------
    
    public abstract double Volumen ();
    
}
