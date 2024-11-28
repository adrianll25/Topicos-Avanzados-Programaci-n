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
:*  Archivo     : PrismaTringular.java
:*  Autor       : Magnolia Hernández Aguilera     18131248
:*  Fecha       : 15/10/2020
:*  Compilador  : JAVA J2SE v1.8.2
:*  Descripción : Clase que tiene metodos estaticos que permiten crear un prisma
                  con base en forma de triangulo.
                   obteniendo los valores de:
                   -base de triangulo
                   -altura de la del triangulo
                   - y la altura del prisma
                implementando metodos estaticos de la clase abstracta 
                prismas para calcular el 
                   -area de la base
                   -area lateral
                   -area total
                   -y el volumen 
                del prisma triangular que se formó con las medidas que el usuario dio.
:*------------------------------------------------------------------------------------------
:*  Ultima modif:
:*  Fecha: 18/Octubre/20202 
    Modificó: Magnolia Hernández Aguilera             
    Motivo: Actualizacion del codigo    
:*------------------------------------------------------------------------------------------*/
package figura;

public class PrismaTriangular extends Prisma {
    private double base;
    private double alturaBase;
    private double alturaPrisma;
    
    //Composicion del prisma
    private TrianguloRec baseSuperior;
    private TrianguloRec baseInferior;
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
        baseSuperior = new TrianguloRec ( base,                      alturaBase   );
        baseInferior = new TrianguloRec ( base,                      alturaBase   );
        caraLatera11 = new Rectangulo   ( base,                      alturaPrisma );
        caraLatera12 = new Rectangulo   ( base,                      alturaPrisma );
        caraLatera13 = new Rectangulo   (baseInferior.hipotenusa (), alturaPrisma );   
    }
    
    //------------------------------------------------------------------------------
    
    @Override
    public double areaBase() {
        return baseInferior.area ();
    }

    //--------------------------------------------------------------------------
    
    @Override
    public double areaLateral() {
        return caraLatera11.area () + caraLatera12.area () + caraLatera13.area ();
    }

    //--------------------------------------------------------------------------
    
    @Override
    public double areaTotal() {
        return baseInferior.area () + baseSuperior.area () + areaLateral ();
    }

    //--------------------------------------------------------------------------
    
    @Override
    public double volumen() {
        return baseInferior.area () * areaLateral ();       
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
