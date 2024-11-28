package figurasapp;

import java.util.Vector;
import figurasapp.Rectangulo;

public class PrismaRectangular extends Prisma {
	private double ancho;
	private double largo;
	private double altura;
	public Vector<Rectangulo> unnamed_Rectangulo_ = new Vector<Rectangulo>();

	public PrismaRectangular() {
		throw new UnsupportedOperationException();
	}

	public PrismaRectangular(double ancho, double largo, double altura) {
		throw new UnsupportedOperationException();
	}

	public double getAncho() {
		return this.ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getLargo() {
		return this.largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}

	public double getAltura() {
		return this.altura;
	}

	public void setAltura(double alto) {
		this.altura = alto;
	}

	public String toString() {
		throw new UnsupportedOperationException();
	}

	public double AreaBase() {
		throw new UnsupportedOperationException();
	}

	public double AreaLateral() {
		throw new UnsupportedOperationException();
	}

	public double AreaTotal() {
		throw new UnsupportedOperationException();
	}

	public double Volumen() {
		throw new UnsupportedOperationException();
	}
}