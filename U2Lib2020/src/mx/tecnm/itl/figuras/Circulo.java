/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*           Clase con métodos que se implementan en un jFramePrisma
:*        
:*  Archivo     : Circulo.java
:*  Autor       : Jesus Adrian Lopez Luevanos #18131253
:*  Fecha       : 20/09/2020
:*  Compilador  : JAVA v1.8.2
:*  Descripción : Clase que tiene metodos estaticos que permiten hacer operaciones
                  de: perimetro y area recibiendo parametros.
                  
:*------------------------------------------------------------------------------------------
:*  Ultima modif:
:*  Fecha: 21/Octubre/2020
    Modificó: Jesus Adrian Lopez Luevanos       
    Motivo: Actualizacion del codigo    
:*------------------------------------------------------------------------------------------*/

package mx.tecnm.itl.figuras;

public class Circulo extends Figura {
	private double radio;

	public Circulo() {
		radio = 0;
                
	}

	public Circulo( double r ) {
		radio = r;
                
	}

	public double Diametro() {
		return 2 * radio;
                
	}

	public double Circunferencia() {
		return Math.PI * Diametro();
                
	}

        @Override
	public String toString() {
		return "El circulo de radio: " + radio;
                
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio( double radio ) {
		this.radio = radio;
	}

        @Override
	public double Perimetro() {
		return Circunferencia();
	}

        @Override
	public double Area() {
		return Math.PI * Math.pow ( radio, 2 );
	}
}