package figurasapp;

import java.util.Vector;
import figurasapp.Circulo;

public class Cilindro extends Prisma {
	private double radio;
	private double altura;
	public Vector<Circulo> unnamed_Circulo_ = new Vector<Circulo>();
	public Rectangulo unnamed_Rectangulo_;

	public Cilindro() {
		throw new UnsupportedOperationException();
	}

	public Cilindro(double radio, double altura) {
		throw new UnsupportedOperationException();
	}

	public double getRadio() {
		return this.radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getAltura() {
		return this.altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
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