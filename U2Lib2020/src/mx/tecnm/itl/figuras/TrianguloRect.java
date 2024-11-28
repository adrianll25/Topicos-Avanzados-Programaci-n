/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*       Clase TrianguloRectangulo con métodos que se implementan en un jFrame
:*        
:*  Archivo     : TrianguloRect.java
:*  Autor       : Jesus Adrian Lopez Luevanos  #18131253
:*  Fecha       : 15/09/2020
:*  Compilador  : JAVA v1.8.2
:*  Descripción : Clase que tiene metodos estaticos que permiten hacer operaciones
                  de: Hipotenusa, area y perimetro recibiendo parametros.
                 
:*------------------------------------------------------------------------------------------
:*  Ultima modif:
:*  Fecha: 21/Octubre/20202 
    Modificó: jesus Adrian Lopez Luevanos             
    Motivo: Actualizacion del codigo    
:*------------------------------------------------------------------------------------------*/

package mx.tecnm.itl.figuras;

public class TrianguloRect extends Figura {
	private double base;
	private double altura;

	public TrianguloRect() {
		base = 0;
                altura = 0;
                
	}

	public TrianguloRect( double base, double altura ) {
		this.base = base;
                this.altura = altura;
                
	}

	public double hipotenusa() {
		return Math.sqrt( Math.pow( base, 2 ) + Math.pow( altura, 2 ) );
                
	}

	public double getBase() {
		return base;
	}

	public void setBase( double base ) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura( double altura ) {
		this.altura = altura;
	}

        @Override
	public String toString() {
		return " Triangulo Rectangulo de base = " + base + ", altura = " + altura;
                
	}

        @Override
	public double Perimetro() {
		return base + altura + hipotenusa();
                
	}

        @Override
	public double Area() {
		return base * altura / 2;
                
	}
}