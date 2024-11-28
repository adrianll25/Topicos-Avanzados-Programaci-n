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
:*  Archivo     : PrismaRectangular.java
:*  Autor       : Magnolia Hernández Aguilera     18131248
:*  Fecha       : 15/10/2020
:*  Compilador  : JAVA J2SE v1.8.2
:*  Descripción : Clase que tiene metodos estaticos que permiten crear un prisma
                  con base en forma de rectangulo.
                   obteniendo los valores de:
                   -largo
                   -ancho
                   - y la altura del prisma
                implementando metodos estaticos de la clase abstracta 
                prismas para calcular el 
                   -area de la base
                   -area lateral
                   -area total
                   -y el volumen 
                del prisma rectangular que se formó con las medidas que el usuario dio.
:*------------------------------------------------------------------------------------------
:*  Ultima modif:
:*  Fecha: 18/Octubre/20202 
    Modificó: Magnolia Hernández Aguilera             
    Motivo: Actualizacion del codigo    
:*------------------------------------------------------------------------------------------*/

package figura;

public class PrismaRectangular extends Prisma {
    private double ancho;
    private double largo;
    private double altura;
    
    //Componentes del prisma
    private Rectangulo baseSuperior;
    private Rectangulo baseInferior;
    private Rectangulo caraLatera11;
    private Rectangulo caraLatera12;
      
    //--------------------------------------------------------------------------
    
    public PrismaRectangular () {
        ancho  = 0;
        largo  = 0;
        altura = 0;
        crearPrisma ();
    }
    
    //--------------------------------------------------------------------------
    
    public PrismaRectangular ( double ancho, double largo, double altura ) {
        this.ancho  = ancho;
        this.largo  = largo;
        this.altura = altura;
        crearPrisma ();       
    }
    
    //--------------------------------------------------------------------------
    
    public void crearPrisma () {
        baseSuperior = new Rectangulo ( ancho, largo  );
        baseInferior = new Rectangulo ( ancho, largo  );
        caraLatera11 = new Rectangulo ( ancho, altura );
        caraLatera12 = new Rectangulo ( largo, altura );
    }
    
    //--------------------------------------------------------------------------
    
    @Override
    public double areaBase() {
        return baseInferior.area ();
    }

    //--------------------------------------------------------------------------
    
    @Override
    public double areaLateral() {
        return 2 * ( caraLatera11.area () + caraLatera12.area () );
    }

    //--------------------------------------------------------------------------
    
    @Override
    public double areaTotal() {
        return baseSuperior.area () + baseInferior.area () + areaLateral ();
    }

    //--------------------------------------------------------------------------
    
    @Override
    public double volumen() {
        return baseInferior.area () * altura;
    }

    //--------------------------------------------------------------------------
    
    public double getAncho() {
        return ancho;
    }
    
    //--------------------------------------------------------------------------
    
    public void setAncho(double ancho) {
        this.ancho = ancho;
        crearPrisma ();
    }

    //--------------------------------------------------------------------------
    
    public double getLargo() {
        return largo;
    }

    //--------------------------------------------------------------------------
    
    public void setLargo(double largo) {
        this.largo = largo;
        crearPrisma ();
    }

    //--------------------------------------------------------------------------
    
    public double getAltura() {
        return altura;
    }
    
    //--------------------------------------------------------------------------
    
    public void setAltura(double altura) {
        this.altura = altura;
        crearPrisma ();
    }
    
    //--------------------------------------------------------------------------

    @Override
    public String toString() {
        return "PrismaRectangular: con ancho = " + ancho + 
                ", largo = "  + largo + 
                ", altura = " + altura;
    }
    
    
}
