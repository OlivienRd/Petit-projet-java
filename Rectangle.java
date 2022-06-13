package Heritage_Methode_virtuelle;

import java.awt.Point;

public class Rectangle extends FigureGeometrique {
	double hauteur;
	double largeur;
	

	Rectangle(Point coin,double h,double l) {
		super(coin);
		this.hauteur=h;
		this.largeur=l;
	}
	@Override
	public double Perimetre() {
		return 2 * (largeur + hauteur);
	}

	public double getLargueur() {
		return largeur;
	}

	public void setLargueur(double largueur) {
		this.largeur = largueur;
	}

	public double getHauteur() {
		return hauteur;
	}

	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}

}
