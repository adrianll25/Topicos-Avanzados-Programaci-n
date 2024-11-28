/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*          Clase Rectangulo con métodos que se implementan en un jFrame
:*        
:*  Archivo     : Rectangulo.java
:*  Autor       : Jesus Adrian Lopez Luevanos   #18131253
:*  Fecha       : 21/09/2020
:*  Compilador  : JAVA v1.8.2
:*  Descripción : Clase que tiene metodos estaticos que permiten hacer operaciones
                  de: Perimetro y area recibiendo parametros.
                 
:*------------------------------------------------------------------------------------------
:*  Ultima modif:
:*  Fecha: 21/Octubre/20202 
    Modificó:Jesus Adrian Lopez Luevanos           
    Motivo: Actualizacion del codigo    
:*------------------------------------------------------------------------------------------*/

package mx.tecnm.itl.figuras;

public class Rectangulo extends Figura {
	private double ancho;
	private double largo;

	public Rectangulo() {
		ancho = 0;
                largo = 0;
                     
	}

	public Rectangulo( double ancho, double largo )  {
		this.ancho = ancho;
                this.largo = largo;
	}

	public double Diagonal() {
		return Math.sqrt ( Math.pow ( ancho, 2 ) + Math.pow ( largo, 2 ) );
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho( double ancho ) {
		this.ancho = ancho;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo( double largo ) {
		this.largo = largo;
	}

        @Override
	public String toString() {
		return " Rectangulo de ancho = " + ancho + ", largo = " + largo;
	}

        @Override
	public double Perimetro() {
		return 2 * largo + 2 * ancho;
	}

        @Override
	public double Area() {
               return ancho * largo;
	 	
	}
}