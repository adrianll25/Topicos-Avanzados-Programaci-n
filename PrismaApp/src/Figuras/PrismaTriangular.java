/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*          Clase Prisma Triangular con métodos que se implementan en un jFrame
:*        
:*  Archivo     : PrismaTringular.java
:*  Autor       : Jesus Adrian Lopez Luevanos    18131253
:*  Fecha       : 15/10/2020
:*  Compilador  : JAVA v1.8.2
:*  Descripción : Clase que tiene metodos estaticos que permiten crear un prisma
                  con base en forma de triangulo.
                   obteniendo los valores de:
                   -base de triangulo
                   -altura de la del triangulo
                   - y la altura del prisma
                implementando metodos estaticos de la clase abstracta 
                prismas para calcular el area de la base, area lateral, area total y el volumen 
                del prisma triangular que se formó con las medidas que el usuario proporciono en el jframe.
:*------------------------------------------------------------------------------------------
:*  Ultima modif:
:*  Fecha: 20/Octubre/2020
    Modificó: Jesus Adrian lopez Luevanos           
    Motivo: correciones de codigo    
:*------------------------------------------------------------------------------------------*/
package Figuras;

public class PrismaTriangular extends Prisma {
    private double base;
    private double alturaBase;
    private double alturaPrisma;
    
    //Composicion del prisma
    private TrianguloRect baseSuperior;
    private TrianguloRect baseInferior;
    private Rectangulo   caraLatera11;
    private Rectangulo   caraLatera12;
    private Rectangulo   caraLatera13;
    
    //--------------------------------------------------------------------------
    
    public PrismaTriangular () {
        base         = 0;
        alturaBase   = 0;
        alturaPrisma = 0;
        crearPrisma ();
    }
    
    //------------------------------------------------------------------------------
    
    public PrismaTriangular ( double base, double alturaBase, double alturaPrisma ) {
        this.base         = base;
        this.alturaBase   = alturaBase;
        this.alturaPrisma = alturaPrisma;
        crearPrisma ();
    }
    
    //------------------------------------------------------------------------------
    
    public void crearPrisma () {
        baseSuperior = new TrianguloRect ( base,                      alturaBase   );
        baseInferior = new TrianguloRect ( base,                      alturaBase   );
        caraLatera11 = new Rectangulo    ( base,                      alturaPrisma );
        caraLatera12 = new Rectangulo    ( base,                      alturaPrisma );
        caraLatera13 = new Rectangulo    (baseInferior.hipotenusa (), alturaPrisma );   
    }
    
    //------------------------------------------------------------------------------
    
    @Override
    public double areaBase() {
        return baseInferior.Area ();
    }

    //--------------------------------------------------------------------------
    
    @Override
    public double areaLateral() {
        return caraLatera11.Area () + caraLatera12.Area () + caraLatera13.Area ();
    }

    //--------------------------------------------------------------------------
    
    @Override
    public double areaTotal() {
        return baseInferior.Area () + baseSuperior.Area () + areaLateral ();
    }

    //--------------------------------------------------------------------------
    
    @Override
    public double Volumen() {
        return baseInferior.Area () * areaLateral ();       
    }

    //--------------------------------------------------------------------------

    public double getBase() {
        return base;
    }

    //--------------------------------------------------------------------------
    
    public void setBase(double base) {
        this.base = base;
    }

    //--------------------------------------------------------------------------
    
    public double getAlturaBase() {
        return alturaBase;
    }

    //--------------------------------------------------------------------------

    
    public void setAlturaBase(double alturaBase) {
        this.alturaBase = alturaBase;
    }

    //--------------------------------------------------------------------------
    
    public double getAlturaPrisma() {
        return alturaPrisma;
    }
    
    //--------------------------------------------------------------------------
    
    public void setAlturaPrisma(double alturaPrisma) {
        this.alturaPrisma = alturaPrisma;
    }
  
    //-------------------------------------------------------------------------
    
    @Override
    public String toString() {
        return "PrismaTriangular: con base = " + base +
                ", altura Base = " + alturaBase + 
                ", alturaPrisma =" + alturaPrisma;
    }


}
