package Heritage_Methode_virtuelle;

import java.awt.Point;

public class Cercle extends FigureGeometrique {
	final double pi=3.14;
	double rayon;
	Cercle(Point centre,double r) {
		super(centre);
		this.rayon=r;
	}
	@Override
	double Perimetre() {
		return 2*pi*rayon;
	}
	double getRayon() {
		return rayon;
	}
	void setRayon(double r) {
		this.rayon=r;
	}

}
