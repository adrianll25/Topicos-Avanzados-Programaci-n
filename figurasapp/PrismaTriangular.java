package figurasapp;

import java.util.Vector;
import figurasapp.TrianguloRect;
import figurasapp.Rectangulo;

public class PrismaTriangular extends Prisma {
	private double base;
	private double alturaBase;
	private double alturaPrima;
	public Vector<TrianguloRect> unnamed_TrianguloRect_ = new Vector<TrianguloRect>();
	public Vector<Rectangulo> unnamed_Rectangulo_ = new Vector<Rectangulo>();

	public PrismaTriangular() {
		throw new UnsupportedOperationException();
	}

	public PrismaTriangular(double base, double alturabase, double alturaprisma) {
		throw new UnsupportedOperationException();
	}

	public double getBase() {
		return this.base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAlturaBase() {
		return this.alturaBase;
	}

	public void setAlturaBase(double alturaBase) {
		this.alturaBase = alturaBase;
	}

	public double getAlturaPrima() {
		return this.alturaPrima;
	}

	public void setAlturaPrima(double alturaPrima) {
		this.alturaPrima = alturaPrima;
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