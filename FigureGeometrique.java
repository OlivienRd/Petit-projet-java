package Heritage_Methode_virtuelle;

import java.awt.Point;

public abstract class FigureGeometrique {
	private Point orig;
	FigureGeometrique(Point o){
		orig=new Point(o);
	}
   abstract double Perimetre();
}
