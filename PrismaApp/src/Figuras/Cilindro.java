/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*        Clase Cilindro con métodos matematicos que se implementan en un jFrame
:*        
:*  Archivo     : Cilindro.java
:*  Autor       : Jesus Adrian Lopez Luevanos, 18131253
:*  Fecha       : 15/10/2020
:*  Compilador  : JAVA  v1.8.2
:*  Descripción : Clase que tiene metodos estaticos que permiten crear un cilindro
                   obteniendo los valores de:
                   -radio
                   -altura
                implementando metodos estaticos de la clase abstracta 
                   Prisma para calcular el area de la base, area lateral, area total, y el volumen 
                   del cilindro que se forma con las medidas que el usuario proporciono en jFramePrisma.
:*------------------------------------------------------------------------------------------
:*  Ultima modif:
:*  Fecha: 19/Octubre/2020
    Modificó: Jesus Adrian Lopez Luevanos             
    Motivo: Terminacion del codigo   
:*------------------------------------------------------------------------------------------*/

package Figuras;

public class Cilindro extends Prisma {
    private double radio;
    private double altura;
    
    //Composición del cilindro
    private Circulo    baseInferior;
    private Circulo    baseSuperior;
    private Rectangulo cuerpo;
    
    //--------------------------------------------------------------------------

    public Cilindro () {
        radio  = 0;
        altura = 0;
        crearPrisma ();
    }
    
    //--------------------------------------------------------------------------
   
    public Cilindro ( double radio, double altura ) {
        this.radio  = radio;
        this.altura = altura;
        crearPrisma ();
    }
    
    //--------------------------------------------------------------------------

    public void crearPrisma () {
        baseInferior = new Circulo ( radio );
        baseSuperior = new Circulo ( radio );
        cuerpo       = new Rectangulo ( baseInferior.Circunferencia () , altura );       
    }
       
    //--------------------------------------------------------------------------

    @Override
    public double areaBase() {
        return baseInferior.Area ();
    }
    
    //--------------------------------------------------------------------------

    @Override
    public double areaLateral() {
        return cuerpo.Area ();
    }
    
    //--------------------------------------------------------------------------

    @Override
    public double areaTotal () {
        return 2 * areaBase () + areaLateral ();
    }
    
    //--------------------------------------------------------------------------

    @Override
    public double Volumen() {
        return areaBase () * altura; 
    }
    
    //--------------------------------------------------------------------------

    public double getRadio() {
        return radio;
    }
    
    //--------------------------------------------------------------------------

    public void setRadio(double radio) {
        this.radio = radio;
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
    public String toString () {
        return "Cilindro de radio = " + radio + ", altura = " + altura;
    }

}
